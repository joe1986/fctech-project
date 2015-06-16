var ajaxStandard, control_validator, dialog_info, dialog_tips, dialog_validator, initPop, label_tips, popupBase, popupDialog, popup_html, reset_api_button, reset_dialog_button, top_position, url_hash;

url_hash = [];

top_position = 0;

popup_html = '<div id="popup-dialog" class="modal fade">\n  <div class="modal-dialog">\n        <div class="modal-content">\n            <div class="modal-header">\n                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>\n                <h4 class="modal-title">Modal title</h4>\n            </div>\n            <div class="modal-body clearfix">\n                <p>One fine body&hellip;</p>\n            </div>\n            <div class="modal-info"></div>\n            <div class="modal-footer">\n                <button id=\'modal-return\' type="button" class="btn btn-default" data-dismiss="modal">取 消</button>\n                <button id="proceed" type="button" class="btn btn-primary">确 定</button>\n            </div>\n        </div><!-- /.modal-content -->\n  </div><!-- /.modal-dialog -->\n</div><!-- /.modal -->';

control_validator = function(id, name, regex_alert_tuple_list) {
  var kv, obj, value, _i, _len;
  obj = $("#" + id);
  obj.keypress(function() {
    dialog_info('', 'none');
    return obj.removeClass('user-error');
  });
  value = $.trim(obj.val());
  if (!(value && value.length)) {
    dialog_info("" + name + "不得为空！", 'error');
    obj.focus();
    obj.addClass('user-error');
    reset_api_button();
    return false;
  }
  for (_i = 0, _len = regex_alert_tuple_list.length; _i < _len; _i++) {
    kv = regex_alert_tuple_list[_i];
    if (value.match(kv.regex)) {
      dialog_info("" + name + kv.alert, 'error');
      obj.focus();
      obj.addClass('user-error');
      reset_api_button();
      return false;
    }
    obj.removeClass('user-error');
    dialog_info('', 'none');
  }
  return true;
};

ajaxStandard = function(url, args, method, headers, async) {
  var data, dfd, k, v;
  if (method == null) {
    method = 'GET';
  }
  if (headers == null) {
    headers = {};
  }
  if (async == null) {
    async = true;
  }
  data = {
    rand: Math.random().toString(36).substring(7)
  };
  for (k in args) {
    v = args[k];
    data[k] = v;
  }
  dfd = $.Deferred();
  if (method === 'POST' || method === 'DELETE' || method === 'PUT') {
    if (data.csrfmiddlewaretoken == null) {
      headers['X-CSRFToken'] = data.csrfmiddlewaretoken = $("input[name='csrfmiddlewaretoken']").attr('value');
    }
  }
  $.ajax({
    url: url,
    data: data,
    type: method,
    beforeSend: function(req) {
      var h, _results;
      _results = [];
      for (h in headers) {
        _results.push(req.setRequestHeader(h, headers[h]));
      }
      return _results;
    },
    async: async
  }).done(function(data, textStatus, jqXHR) {
    return dfd.resolve(data, textStatus, jqXHR);
  }).fail(function(data) {
    return dfd.reject(data);
  });
  return dfd.promise();
};

initPop = function(args) {
  var f, target, _i, _len, _ref;
  _ref = ['title', 'body', 'info'];
  for (_i = 0, _len = _ref.length; _i < _len; _i++) {
    f = _ref[_i];
    target = "#popup-dialog .modal-" + f;
    $(target).html(args[f]);
  }
  if (args.button_hot != null) {
    $('#proceed').addClass('btn-hot');
  }
  if (args.button_text != null) {
    $('#proceed').html(args.button_text);
  }
  if (args.popName != null) {
    $('.modal-dialog').addClass(args.popName);
    $('.modal-footer').addClass('hidden');
  }
  return url_hash.push(window.location.hash);
};

reset_api_button = function() {
  return $('#proceed').removeClass('btn-disabled').addClass('btn-primary');
};

popupBase = function(args) {
  var _ref;
  $('#popup-dialog').remove();
  if ((_ref = $('.modal-backdrop.fade.in')) != null) {
    _ref.remove();
  }
  $('html').append(popup_html);
  if (args.topValue != null) {
    $('#popup-dialog.fade .modal-dialog').css('top', args.topValue);
  }
  $('.modal-header button.close').click(function() {
    var _ref1;
    return (_ref1 = $('.modal-backdrop.fade.in')) != null ? _ref1.remove() : void 0;
  });
  initPop(args);
  if (args.init != null) {
    args.init();
  }
  if ((args.reload != null) && args.reload) {
    $('#popup-dialog').on('hidden', function() {
      loadUrl($('#main-zone').attr('url-base') + window.location.search);
      return window.location.hash = url_hash.pop();
    });
  }
  $('#popup-dialog').modal();
  $('#proceed').click(function() {
    if ($('#proceed').hasClass('btn-disabled')) {
      return;
    }
    $('#proceed').removeClass('btn-primary').addClass('btn-disabled');
    return args.api();
  });
  $('.nav-tabs a[data-toggle="tab"]').click(function() {
    var osTempName;
    osTempName = $('.nav-tabs li.active a').attr('href');
    if (osTempName === "#system-templates") {
      return $('.sys-detail').html($.trim($('#os-name').html() + ' ' + $('#version-no').html()));
    } else if (osTempName === "#personal-templates") {
      if ($('#personal_image_select option:checked').length === 0) {
        return $('.sys-detail').html("未创建模板");
      } else {
        return $('.sys-detail').html($('#personal_image_select option:checked').attr('os') + ' ' + $('#personal_image_select option:checked').attr('version'));
      }
    }
  });
  return $('#thresholdForm').change(function() {
    return args.changeUnit();
  });
};

dialog_info = function(msg, type, countdownSeconds, callback) {
  var interval;
  if (type == null) {
    type = 'success';
  }
  if (countdownSeconds == null) {
    countdownSeconds = 0;
  }
  if (callback == null) {
    callback = null;
  }
  if (type === 'error') {
    type = 'danger';
  }
  if ((type != null) && (type === 'success' || type === 'warning' || type === 'danger')) {
    msg = "<div class='alert alert-" + type + "'>" + msg + "<span id=\"count-down\" class=\"text-muted\"></div>";
  }
  $('#popup-dialog .modal-info').html(msg);
  if (countdownSeconds > 0) {
    interval = setInterval(function() {
      --countdownSeconds;
      return $('#count-down').html(" (" + countdownSeconds + "秒后关闭对话框)");
    }, 1000);
    return setTimeout(function() {
      clearInterval(interval);
      $('#popup-dialog').modal('hide');
      if (callback != null) {
        return callback();
      }
    }, countdownSeconds * 1000);
  }
};


/*new dialog code */

dialog_validator = function(dialogName, id, name, regex_alert_tuple_list) {
  var kv, obj, value, _i, _len;
  if (dialogName == null) {
    dialogName = '';
  }
  obj = $("#" + id);
  obj.keypress(function() {
    dialog_tips(dialogName, '', 'none');
    return obj.removeClass('user-error');
  });
  value = $.trim(obj.val());
  if (!(value && value.length)) {
    dialog_tips(dialogName, "" + name + "不得为空！", 'error');
    obj.focus();
    obj.addClass('user-error');
    reset_dialog_button(dialogName);
    return false;
  }
  for (_i = 0, _len = regex_alert_tuple_list.length; _i < _len; _i++) {
    kv = regex_alert_tuple_list[_i];
    if (value.match(kv.regex)) {
      dialog_tips(dialogName, "" + name + kv.alert, 'error');
      obj.focus();
      obj.addClass('user-error');
      reset_dialog_button(dialogName);
      return false;
    }
    obj.removeClass('user-error');
    dialog_tips(dialogName, '', 'none');
  }
  return true;
};

reset_dialog_button = function(dialogName) {
  if (dialogName == null) {
    dialogName = '';
  }
  return $("." + dialogName + " .popup-confirm").removeClass('btn-disabled').addClass('btn-primary');
};

dialog_tips = function(dialogName, msg, type, countdownSeconds, callback) {
  var interval;
  if (dialogName == null) {
    dialogName = '';
  }
  if (type == null) {
    type = 'success';
  }
  if (countdownSeconds == null) {
    countdownSeconds = 0;
  }
  if (callback == null) {
    callback = null;
  }
  if (type === 'error') {
    type = 'danger';
  }
  if ((type != null) && (type === 'success' || type === 'warning' || type === 'danger')) {
    msg = "<div class='alert alert-" + type + "'>" + msg + "<span id=\"count-down\" class=\"text-muted\"></div>";
  }
  $("." + dialogName + " .modal-info").html(msg);
  if (type === 'danger') {
    $("." + dialogName + " .popup-confirm").removeClass('btn-disabled').addClass('btn-primary');
  }
  if (countdownSeconds > 0) {
    interval = setInterval(function() {
      --countdownSeconds;
      return $('#count-down').html(" (" + countdownSeconds + "秒后关闭对话框)");
    }, 1000);
    return setTimeout(function() {
      clearInterval(interval);
      $("." + dialogName).remove();
      if (callback != null) {
        return callback();
      }
    }, countdownSeconds * 1000);
  }
};

popupDialog = function(options) {
  var defaultParam, innerDialog, ops;
  defaultParam = {
    parentContainer: $('html'),
    dialogName: '',
    dialogTitle: null,
    innerHtml: '',
    zIndex: 1500,
    top: 45
  };
  ops = options || defaultParam;
  innerDialog = "<div class=\"popupdialog-container " + ops.dialogName + "\" style=\"z-index:" + ops.zIndex + ";\">\n    <div class=\"popupdialog\" style=\"top:" + ops.top + "px;\">\n        <div class=\"popupdialog-content\">\n            <div class=\"popup-header\">\n                <h4 class=\"modal-title\">" + ops.dialogTitle + "</h4>\n            </div>\n            <div class=\"popup-content clearfix\">\n                " + ops.innerHtml + "\n            </div>\n            <div class=\"modal-info\"></div>\n            <div class=\"popup-footer\">\n                <button type=\"button\" class=\"popup-return btn btn-default\" data-dismiss=\"modal\">取 消</button>\n                <button type=\"button\" class=\"popup-confirm btn btn-primary\">确 定</button>\n            </div>\n            <div class=\"popup-close\">×</div>\n        </div>\n    </div>\n</div>";
  ops.parentContainer.append(innerDialog);
  if (ops.init != null) {
    ops.init();
  }
  $('.popup-close').click(function(e) {
    return $("." + ops.dialogName).remove();
  });
  $('.popup-return').click(function(e) {
    return $("." + ops.dialogName).remove();
  });
  return $('.popup-confirm').click(function(e) {
    if ($(e.target).hasClass('btn-disabled')) {
      return;
    }
    $(e.target).removeClass('btn-primary').addClass('btn-disabled');
    return ops.api();
  });
};

label_tips = function(selector, msg, level, countdownSeconds, callback) {
  if (msg == null) {
    msg = "";
  }
  if (level == null) {
    level = "success";
  }
  if (countdownSeconds == null) {
    countdownSeconds = 0;
  }
  if (callback == null) {
    callback = null;
  }
  selector.html(msg);
  selector.removeClass("label-success label-warning label-danger label-info");
  selector.addClass("label-" + level);
  if (countdownSeconds > 0) {
    return setTimeout(function() {
      selector.removeClass("label-" + level);
      selector.addClass("hidden");
      if (callback != null) {
        return callback();
      }
    }, countdownSeconds * 1000);
  }
};
