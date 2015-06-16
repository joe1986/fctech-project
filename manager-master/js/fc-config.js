$(document).ready(function () {

    $(".btn-add-station").click( function(){
        window.location.href="station_add.html";
    });

    $(".btn-add-dtu").click( function(){
        window.location.href="dtu_add.html";
    });

    $(".btn-add-img").click( function(){
        window.location.href="import_img.html";
    });

    $(".btn-add-straintype").click( function(){
        window.location.href="strain_type_add.html";
    });

    $(".btn-add-strain_limit").click( function(){
        window.location.href="strain_limit_add.html";
    });

    $(".btn-add-incli-elevation").click( function(){
        window.location.href="incli_elevation_add.html";
    });

    $(".btn-add-inclilimit").click( function(){
        window.location.href="incli_limit_add.html";
    });

    $(".btn-add-param").click( function(){
        window.location.href="param_add.html";
    });


    $(".btn-add-formula").click( function(){
        window.location.href="formula_add.html";
    });

    //文件上传
    uploader();

    //表格设置
    dataTablesSettings();
});


function forwardToEditPage( page ){
    window.location.href= page ;
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
        "fnServerData" : function(sSource, aoData, fnCallback) {
            $.ajax({
                "type" : 'post',
                "url" : sSource,
                "dataType" : "json",
                "data" : {
                    aoData : JSON.stringify(aoData)
                },
                "success" : function(resp) {
                    fnCallback( resp );
                }
            });
        },
    });
}

function uploader(){
    $("#dropz").dropzone({
        url: "handle-upload.php",
        maxFiles: 10,
        maxFilesize: 512,
        addRemoveLinks: true,
        dictRemoveFile: "移除文件",
        removedfile : function(){
            //移除监听事件，可再次调用从服务器端删除文件
        },
        uploadMultiple:true,
        dictDefaultMessage:"点击或者拖拽文件至该区域上传",
        //acceptedFiles: ".js,.obj,.dae"
        init: function() {
            this.on("success", function(file) {
                console.log("File " + file.name + "uploaded");
            });
            this.on("removedfile", function(file) {
                console.log("File " + file.name + "removed");
            });
        }
    });
}