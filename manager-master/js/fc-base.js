/**
 * Created by joe on 15/6/12.
 */
$(document).ready(function () {
    $(".btn-add-company").click( function(){
        window.location.href="company_add.html";
    });

    $(".btn-add-project").click( function(){
        window.location.href="project_add.html";
    });

    $(".btn-add-user").click( function(){
        window.location.href="user_add.html";
    });

    $(".btn-add-qualification").click( function(){
        window.location.href="company_qualification_add.html";
    });

    uploader();
});


function forwardToEditPage( page ){
    window.location.href= page ;
}

/*自页面请求变换iframe的高度 */
function dynmSetIframeheight(){
    var hostUrl = window.location.hash.slice(1);
    var offsetHeight = document.body.offsetHeight;
    hostUrl += "#height=" + offsetHeight;
    window.top.location = hostUrl;
}



function uploader(){

    if( $("#dropz").length >0){
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
}

