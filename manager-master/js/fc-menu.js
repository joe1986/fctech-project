$(document).ready(function () {

    /* 单击子菜单响应事件 当前菜单显示为蓝色 */
    $(".submenu").click(function () {
        var url = $(this).attr("url");
        $("#iframepage").attr("src", url);
        $(this).parent().addClass("active");

        /*修改主面板中导航文字 和 链接 */
        var menu_name = $(this).find("span").text();
        var navObj = $("ul[class='breadcrumb']").find("a[class='dynamic-nav']");
        navObj.text(menu_name).attr("href" ,url );

        /*-- 当前菜单所有兄弟菜单设置为非激活状态  移除css属性class中active */
        var menuId= $(this).parent().attr("id");
        $(".main-menu").find("li[id!=" + menuId + "]").each(function () {
            $(this).removeClass("active");
        });
    });

    /* ---------- Submenu  菜单展开 缩回控制 ---------- */
    $('.dropmenu').click(function (e) {
        e.preventDefault();
        $(this).parent().find('ul').slideToggle();
        /* 所有其它munu 全部缩回 */
        var menuId = $(this).parent().attr("id");
        $(".main-menu").children("li[id!=" + menuId + "]").each(function () {
            if (menuId != $(this).attr("id")) {
                $(this).find('ul').slideUp();
            }
        });
    });

});