var Config = function () {

    function initTreeview() {
        if ($("#treeview").length > 0) {
            $('#treeview').treeview({data: getTree()});
        }
    }

    function getTree() {
        var tree = [
            {
                text: "上海地铁15号线",
                nodes: [
                    {
                        text: "第一站",
                        nodes: [
                            {
                                text: "底图一.jpg"
                            },
                            {
                                text: "底图二.png"
                            }
                        ]
                    },
                    {
                        text: "第二站"
                    }
                ]
            },
            {
                text: "上海地铁17号线"
            }
        ];
        return tree;
    }


    function forwardToEditPage(page) {
        window.location.href = page;
    }

    function dataTablesSettings() {
        /* ---------- Datable ---------- */
        $("table[id^='config-datatable']").dataTable({
            "sDom": "<'row-fluid'<'span6'l><'span6'f>r>t<'row-fluid'<'span12'i><'span12 center'p>>",
            "sPaginationType": "bootstrap",
            "bLengthChange": false, //改变每页显示数据数量
            "bFilter": false, //过滤功能
            "oLanguage": {
                //"sLengthMenu": "_MENU_ records per page",
                //"sSearch": "搜索",
                //"sLengthMenu": "每页显示 _MENU_ 条记录",
                "sZeroRecords": "抱歉， 没有找到",
                "sInfo": "从 _START_ 到 _END_ /共 _TOTAL_ 条数据",
                "sInfoEmpty": "没有数据",
                "sInfoFiltered": "(从 _MAX_ 条数据中检索)",
                "oPaginate": {
                    "sFirst": "首页",
                    "sPrevious": "前一页",
                    "sNext": "后一页",
                    "sLast": "尾页"
                },
                "sZeroRecords": "没有检索到数据",
                "sProcessing": "<img src='./loading.gif' />"
            },
            "fnServerData": function (sSource, aoData, fnCallback) {
                $.ajax({
                    "type": 'post',
                    "url": sSource,
                    "dataType": "json",
                    "data": {
                        aoData: JSON.stringify(aoData)
                    },
                    "success": function (resp) {
                        fnCallback(resp);
                    }
                });
            },
        });
    }

    function uploader() {
        if ($("#dropz").length > 0) {
            $("#dropz").dropzone({
                url: "handle-upload.php",
                maxFiles: 10,
                maxFilesize: 512,
                addRemoveLinks: true,
                dictRemoveFile: "移除文件",
                removedfile: function () {
                    //移除监听事件，可再次调用从服务器端删除文件
                },
                uploadMultiple: true,
                dictDefaultMessage: "点击或者拖拽文件至该区域上传",
                //acceptedFiles: ".js,.obj,.dae"
                init: function () {
                    this.on("success", function (file) {
                        console.log("File " + file.name + "uploaded");
                    });
                    this.on("removedfile", function (file) {
                        console.log("File " + file.name + "removed");
                    });
                }
            });
        }
    }

    var multiSelect = function () {
        if ($('#pre-selected-options').length > 0) {
            $('#pre-selected-options').multiSelect({});
        }
    }

    return {
        init: function () {
            //文件上传
            uploader();
            //表格设置
            //dataTablesSettings();
            //多选框
            multiSelect();
            //树形菜单
            initTreeview();

        }
    }
}();


var ContextMenu = function () {
    var thiz = this;
    var evt,
        offset_top = 0,
        offset_left = 0,
        curr_svg_cx = 0,
        curr_svg_cy = 0,
        currentObj,
        draw,
        image,
        default_color="#4d90fe"; //#12943e

    this.createSVGRootElement = function(){
        if($("#drawing").length > 0) {
            draw = SVG('drawing').attr({
                id          : 'project_img_svg',
                'font-size' : 10,
                  //style       : "background:url('../../img/project_cad.jpg');background-repeat: no-repeat;",
                onmousedown : ' btnSVGMousedown(evt,this)'
            }).fill("gray");

            image = draw.image('../../img/project_cad.jpg').attr({id:'project-img'}).loaded(function(loader) {
                image.size(loader.width, loader.height);
                draw.size(loader.width,loader.height);
                draw.viewbox(0, 0, loader.width, loader.height);
                //$("#drawing").attr("style","width:"+loader.width+";height:"+loader.height+";");
            });
            //image.load('../../img/cad.jpg');
           // thiz.test();
        }
    }

    this.test = function(){
        /* plain draggable */
        draw.group().circle(30, 30).center(100, 120).draggable().fill( default_color ).attr({
            id: 'zhouzhuanshu',
            onmousedown: 'btnSVGChildMousedown(evt,this)'
        });
        draw.group().plain('1号传感器').center(80, 100).draggable();
        //    draw.rect(100,100).center(150, 150).draggable();
        //    draw.plain('just plain draggable').center(150, 210);
        /* grouped draggable */
        draw.group().circle(30, 30).center(140, 120).draggable().fill( default_color ).attr({
            id: 'zhouzhuanshu',
            onmousedown: 'btnSVGChildMousedown(evt,this)'
        });
        draw.group().circle(30, 30).center(200, 120).draggable().fill( "red" ).attr({
            id: 'zhouzhuanshu',
            onmousedown: 'btnSVGChildMousedown(evt,this)'
        });
        draw.group().circle(30, 30).center(140, 160).draggable().fill( default_color ).attr({
            id: 'zhouzhuanshu',
            cursor:'move',
            onmousedown: 'btnSVGChildMousedown(evt,this)'
        });
        draw.group().circle(30, 30).center(200, 160).draggable().fill( default_color ).attr({
            id: 'zhouzhuanshu',
            onmousedown: 'btnSVGChildMousedown(evt,this)'
        });
    }

    this.btnSVGChildMousedown = function(evt, obj) {
        currentObj =  $(evt.target);
        thiz._getPosition(evt,'svg-child-node');
        if (3 == evt.which) {
            evt.preventDefault();
            evt.stopPropagation();
            console.log("svg子元素右击事件");
            $("#sensor_dropdown_menu").html("<li><a id='remove-sensor' tabindex='-1'>删除监测点组建</a></li>"
                                           // +"<li><a id='sensor-text' tabindex='-1'>新增监测点说明</a></li>"
                                            );
        } else if (1 == evt.which) {
            console.log("svg子元素鼠标单击事件");
            evt.preventDefault();
            evt.stopPropagation();
            var r = currentObj.attr("r");
            curr_svg_cx = currentObj.attr("cx");
            curr_svg_cy = currentObj.attr("cy");
            var prop = {color : currentObj.attr("fill"),width : r*2,height : r*2 };
            thiz._setCompProperties( prop );
        }
    }

    this.btnSVGMousedown = function(evt) {
        thiz._getPosition(evt,'svg-node');
        if (3 == evt.which) {
            console.log("SVG父元素鼠标右击事件");
            //            $("#sensor_dropdown_menu").empty();
            $("#sensor_dropdown_menu").html("<li><a id='new-sensor' tabindex='-1'>新增监测点</a></li>"
                                            + "<li><a id='clear-sensor' tabindex='-1'>清除监测点</a></li>"
                                            + "<li><a id='prview_img' tabindex='-1'>预览效果图</a></li>");
        } else if (1 == evt.which) {
            console.log("svg父元素鼠标单击事件");
        }
    }

    this._getPosition = function(evt,nodetype) {
        var mTop=0,mLeft=0;
        if(nodetype=='svg-node'){
            var offset = $(evt.target).offset();
            mTop = offset.top+10;
            mLeft = offset.left-20;
        }
        //var position = (evt.pageY - offset.top);
        console.log("scrollLeft : "+$(window).scrollLeft()+" ; clientX: "+evt.clientX+ " ; Left : " + mLeft +"; pageX : "+ evt.pageX+"; ");
        console.log("scrollTop : "+$(window).scrollTop()+" ; clientY: "+evt.clientY+ " ; top : " + mTop +"; pagey : "+ evt.pageY+"; ");
        var mouseX = evt.clientX, mouseY = evt.clientY;
        offset_top = mouseY + $(window).scrollTop() - mTop;
        offset_left = mouseX + $(window).scrollLeft() - mLeft;
        console.log("offset_left: "+ offset_left + " ; offset_top: " + offset_top);
    }

    this.compEventListener = function(){
        /* 颜色选择器及监听事件 组件颜色变换*/
        if ($('.colorpicker-default').length > 0) {
            $('.colorpicker-default').colorpicker({
                format: 'hex'
            }).on('changeColor',function(ev){
                console.log(currentObj + "--------"+ ev.color.toHex());
                if( currentObj ){
                    currentObj.attr("fill",ev.color.toHex())
                }
            });
        }
        /* 宽 高 监听事件 */
        $("#comp_size_height").change(function(){
            var height = $(this).val();
            var width = $("#comp_size_width").val();
            currentObj.attr("r",height/2)
            //currentObj.attr("cx",width)
            //currentObj.attr("cy",height)
        });
        $("#comp_size_width").change(function(){
            var width = $(this).val();
            var height = $("#comp_size_height").val();
            currentObj.attr("r",height/2)
            //currentObj.attr("cx",width)
            //currentObj.attr("cy",height)
            // currentObj.size(width,height);
        });
        thiz._svgZoom();
    }

    this._setCompProperties = function( prop ){
        $("#comp_color").val(prop.color );
        $("#comp_size_width").val( prop.width );
        $("#comp_size_height").val( prop.height );
    }

    this._svgZoom = function(){
        //var example1, example2; //globals so we can manipulate them in the debugger
        var svgzoom = $("#project_img_svg").svgPanZoom({
            Options:
            {
                events: {
                    mouseWheel: true, // enables mouse wheel zooming events
                    doubleClick: true, // enables double-click to zoom-in events
                    drag: true, // enables drag and drop to move the SVG events
                    dragCursor:  "move" // cursor to use while dragging the SVG
                },
                animationTime: 300,// time in milliseconds to use as default for animations. Set 0 to remove the animation
                zoomFactor: 0.25,// how much to zoom-in or zoom-out
                maxZoom: 3,//maximum zoom in, must be a number bigger than 1
                panFactor: 100,// how much to move the viewBox when calling .panDirection() methods
                initialViewBox: { // the initial viewBox, if null or undefined will try to use the viewBox set in the svg tag. Also accepts string in the format "X Y Width Height"
                    x: 0, // the top-left corner X coordinate
                    y: 0, // the top-left corner Y coordinate
                    width:  800, // the width of the viewBox
                    height:  800 // the height of the viewBox
                },
                limits: { // the limits in which the image can be moved. If null or undefined will use the initialViewBox plus 15% in each direction
                    x:   -150,
                    y:   -150,
                    x2:  1150,
                    y2:  1150
                }
            }
        });
        var callback= function(svgzoom) {
            return function(event) {
                if ($(event.target).hasClass("icon-arrow-up") || $(event.target).hasClass("btn_arrow_up"))
                    svgzoom.panUp()
                if ($(event.target).hasClass("icon-arrow-down") || $(event.target).hasClass("btn_arrow_down"))
                    svgzoom.panDown()
                if ($(event.target).hasClass("icon-arrow-left") || $(event.target).hasClass("btn_arrow_left"))
                    svgzoom.panLeft()
                if ($(event.target).hasClass("icon-arrow-right") || $(event.target).hasClass("btn_arrow_right") )
                    svgzoom.panRight()
                if ($(event.target).hasClass("icon-plus") || $(event.target).hasClass("btn_plus"))
                    svgzoom.zoomIn()
                if ($(event.target).hasClass("icon-minus") || $(event.target).hasClass("btn_minus"))
                    svgzoom.zoomOut()
                if ($(event.target).hasClass("icon-refresh") || $(event.target).hasClass("btn_refresh"))
                    svgzoom.reset()
            }
        };
        //example1= examples[0]
        //example2= examples[1]
        $("div#svgzoom button").click(callback(svgzoom));
        //$("div#example2 i").click(callback(example2));
    }

    this.html_encode = function(str)
    {
        var s = "";
        if (str.length == 0) return "";
        s = str.replace(/&/g, ">");
        s = s.replace(/</g, "<");
        s = s.replace(/>/g, ">");
        s = s.replace(/ /g, " ");
        s = s.replace(/\'/g, "'");
        s = s.replace(/\"/g, "'");
        //s = s.replace(/\n/g, "<br>");
        return s;
    }

    this._canvgCallback = function(  ){
        var canvas = document.getElementById("canvas");
        var image = canvas.toDataURL("image/png");//.replace("image/png", "image/octet-stream"); //Convert image to 'octet-stream' (Just a download, really)
        $("#preview_img").attr('src',image);
        $('#long_preview').modal('toggle');
    }

    this.loadContextmenu = function(){
        if ($('#project_img_svg').length > 0) {
            var mWidth=30,mHeight=30,mColor=default_color;
            $('#project_img_svg').contextmenu({
                target: '#context-menu',
                onItem: function (context, evt) {
                    //$("#sensor_dropdown_menu").empty();
                    console.log("execute the onItem , menu name : "+ $(evt.target).text());
                    var id = $(evt.target).attr("id");
                    switch (id) {
                        case "new-sensor":
                            svgChildNode = draw.circle(mWidth, mHeight).center(offset_left, offset_top + 40).draggable().fill(mColor ).attr({
                                id: 'zhouzhuanshu',
                                cursor:'move',
                                onmousedown: 'btnSVGChildMousedown(evt,this)'
                            });
                            draw.plain('1号监测点').center(svgChildNode.cx(), svgChildNode.cy()+20).draggable().attr({
                                id: 'station-text',
                                onmousedown: 'btnSVGChildMousedown(evt,this)'
                            });
                            var prop = {color : mColor,width : mWidth,height : mHeight };
                            thiz._setCompProperties( prop );
                            break;
                        case "remove-sensor":
                            currentObj.remove();
                            break;

                        case "clear-sensor":
                            //清除不包含Image的所有子元素
                            draw.each(function(i, children) {
                              console.log(children[i]);
                                if(children[i]!="project-img"){
                                    children[i].remove();
                                }
                            }, true)
                            //draw.clear();
                            break;
                        case "prview_img":
                            var cloneObj = $("#drawing").clone();
                            cloneObj.find('#svgzoom').remove();
                            var svghtml = thiz.html_encode( $.trim( cloneObj.html() )) ;
                            console.log( "********"+ svghtml );
                            var canvas = document.getElementById("canvas");
                            canvg(canvas, svghtml ,thiz._canvgCallback( ));
                           // $("#svg_img").attr('src',image);
                            break;
                        //case "sensor-text":
                        //    draw.plain('1号监测点').center(offset_left, offset_top).draggable().attr({
                        //        id: 'station-text',
                        //        onmousedown: 'btnSVGChildMousedown(evt,this)'
                        //    });
                        //    break;
                        default:
                            break;
                    }
                }
            });

            //SVG.on(window, 'resize', function() { draw.spof() })

            $('#context-menu').on('show.bs.context', function (e) {
                console.log('显示菜单前响应事件');
                //      console.log('======== '+$('#menu-remove').text());
                return false;
            });
            $('#context-menu').on('shown.bs.context', function (e) {
                console.log('显示菜单后响应时间');
            });
            $('#context-menu').on('hide.bs.context', function (e) {
                console.log('隐藏菜单前响应事件');
            });
            $('#context-menu').on('hidden.bs.context', function (e) {
                console.log('隐藏菜单后响应时间');
            });
        }

    }

    return {
        init: function () {
            thiz.createSVGRootElement();
            //thiz.colorPicker();
            thiz.compEventListener();
            thiz.loadContextmenu();
        }
    }
}();

$(document).ready(function () {

    $(".btn-add-station").click(function () {
        window.location.href = "station_add.html";
    });

    $(".btn-add-dtu").click(function () {
        window.location.href = "dtu_add.html";
    });

    $(".btn-add-img").click(function () {
        window.location.href = "import_img.html";
    });

    $(".btn-add-straintype").click(function () {
        window.location.href = "strain_type_add.html";
    });

    $(".btn-add-strain_limit").click(function () {
        window.location.href = "strain_limit_add.html";
    });

    $(".btn-add-incli-elevation").click(function () {
        window.location.href = "incli_elevation_add.html";
    });

    $(".btn-add-inclilimit").click(function () {
        window.location.href = "incli_limit_add.html";
    });

    $(".btn-add-param").click(function () {
        window.location.href = "param_add.html";
    });


    $(".btn-add-formula").click(function () {
        window.location.href = "formula_add.html";
    });

    Config.init();
    ContextMenu.init();
});

function btnSVGChildMousedown(evt,obj){
    ContextMenu.btnSVGChildMousedown(evt,obj);
}

function btnSVGMousedown(evt,obj){
    ContextMenu.btnSVGMousedown(evt);
}
