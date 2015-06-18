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

    //动态添加标签
    tagsInput();

    //多选下拉框
    select2();
});


function select2(){
    if( $('#selectUser').length >0 ){
        $("#selectUser").select2({
            placeholder: "选择用户",
            allowClear: true
        });
    }
}

function tagsInput(){
    var tagsObj =  $('#tags_1');
    if( tagsObj.length >0 ){
        tagsObj.tagsInput({
            width:'auto',
            defaultText:'', //默认文字
            onAddTag:function(tag){
                console.log('增加了'+tag)
            },
            onRemoveTag:function(tag){
                console.log('删除了'+tag)
            }
        });

        $(".author").click(function () {
            if($(this).attr("checked")=='checked'){
                tagsObj.addTag( $(this).attr("value-zh") );
            }else{
                tagsObj.removeTag( $(this).attr("value-zh") );
            }
        });
    }
}
