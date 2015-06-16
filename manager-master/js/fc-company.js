/**
 * Created by joe on 15/6/12.
 */
$(document).ready(function () {
    $(".btn-add").click( function(){
        window.location.href="company_add.html";
    });

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