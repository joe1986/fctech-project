/**
 * Created by joe on 15/6/16.
 */
$(document).ready(function () {

    $(".btn-add-user").click( function(){
        window.location.href="user_add.html";
    });

    $(".btn-add-role").click( function(){
        window.location.href="role_add.html";
    });

    $(".btn-add-author").click( function(){
        window.location.href="author_add.html";
    });


    $(".btn-add-menu").click( function(){
        window.location.href="menu_add.html";
    });

    $('#tags_1').tagsInput({
        width:'auto',
        'defaultText':'', //默认文字
        onAddTag:function(tag){
            console.log('增加了'+tag)
        },
        onRemoveTag:function(tag){
            console.log('删除了'+tag)
        }
    });

    $(".author").click(function () {
        if($(this).attr("checked")=='checked'){
            $("#tags_1").addTag( $(this).val() );
        }else{
            $("#tags_1").removeTag( $(this).val() );
        }
    });
});
