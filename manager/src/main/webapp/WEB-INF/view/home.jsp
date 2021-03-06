<%@ page language="java" errorPage="error.jsp" pageEncoding="UTF-8" contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<!-- saved from url=(0035)http://www.zi-han.net/theme/hplus/# -->
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">


    <title>富城科技 - 登录</title>
    <meta name="keywords" content="富城科技">
    <meta name="description" content="富城科技基坑项目">

    <link href='<c:url value="./css/bootstrap.min.css?v=3.4.0"></c:url>' rel="stylesheet">
    <link href='<c:url value="./css/font-awesome.min.css?v=4.4.0"></c:url>' rel="stylesheet">
    <link href='<c:url value="./css/animate.min.css"></c:url>' rel="stylesheet">
    <link href='<c:url value="../css/style.min.css?v=3.2.0"></c:url>' rel="stylesheet">
    <link href='<c:url value="./css/layer.css"></c:url>' id="layui_layer_skinlayercss" rel="stylesheet">
    <link href='<c:url value="./css/layer.ext.css"></c:url>' id="layui_layer_skinlayerextcss" rel="stylesheet">
    <link href='<c:url value="./css/style.css"></c:url>' id="layui_layer_skinmoonstylecss" rel="stylesheet">
</head>

<body class="fixed-sidebar full-height-layout gray-bg  pace-done" youdao="bind">
<div class="pace  pace-inactive">
    <div class="pace-progress" data-progress-text="100%" data-progress="99" style="width: 100%;">
        <div class="pace-progress-inner"></div>
    </div>
    <div class="pace-activity"></div>
</div>
<div id="wrapper">
    <!--左侧导航开始-->
    <nav class="navbar-default navbar-static-side" role="navigation">
        <div class="nav-close"><i class="fa fa-times-circle"></i>
        </div>
        <div class="slimScrollDiv" style="position: relative; width: auto; height: 100%;">
            <div class="sidebar-collapse" style="width: auto; height: 100%;">
                <ul class="nav" id="side-menu" style="display: block;">
                    <li class="nav-header">
                        <div class="dropdown profile-element">
                            <span><img alt="image" class="img-circle" src="img/profile_small.jpg"></span>
                            <a data-toggle="dropdown" class="dropdown-toggle" href="home.jsp" aria-expanded="false">
                                <span class="clear">
                               <span class="block m-t-xs"><strong class="font-bold">周专书</strong></span>
                                <span class="text-muted text-xs block">超级管理员<b class="caret"></b></span>
                                </span>
                            </a>
                            <ul class="dropdown-menu animated fadeInRight m-t-xs">
                                <li><a class="J_menuItem" href="http://www.zi-han.net/theme/hplus/form_avatar.html"
                                       data-index="0">修改头像</a>
                                </li>
                                <li><a class="J_menuItem" href="http://www.zi-han.net/theme/hplus/profile.html"
                                       data-index="1">个人资料</a>
                                </li>
                                <li><a class="J_menuItem" href="http://www.zi-han.net/theme/hplus/contacts.html"
                                       data-index="2">联系我们</a>
                                </li>
                                <li><a class="J_menuItem" href="http://www.zi-han.net/theme/hplus/mailbox.html"
                                       data-index="3">信箱</a>
                                </li>
                                <li class="divider"></li>
                                <li><a href="http://www.zi-han.net/theme/hplus/login.html">安全退出</a>
                                </li>
                            </ul>
                        </div>
                        <div class="logo-element">FC
                        </div>
                    </li>
                    <li class="">
                        <a href="http://www.baidu.com/">
                            <i class="fa fa-home"></i>
                            <span class="nav-label">主页</span>
                            <span class="fa arrow"></span>
                        </a>
                        <ul class="nav nav-second-level collapse" aria-expanded="false" style="height: 0px;">
                            <li>
                                <a class="J_menuItem" href="http://www.baidu.com/" data-index="0">百度</a>
                            </li>
                            <li>
                                <a class="J_menuItem" href="http://www.tmall.com/" data-index="5">天猫</a>
                            </li>
                            <li>
                                <a class="J_menuItem" href="http://www.tencent.com/" data-index="6">腾讯</a>
                            </li>
                            <li>
                                <a class="J_menuItem" href="http://www.jd.com/" data-index="7">京东</a>
                            </li>
                            <li>
                                <a href="http://www.apple.com.cn" target="_blank">苹果</a>
                            </li>
                        </ul>

                    </li>

                    <li>
                        <a class="J_menuItem" href="http://www.zi-han.net/theme/hplus/layouts.html" data-index="8"><i
                                class="fa fa-columns"></i> <span class="nav-label">布局</span></a>
                    </li>

                    <li>
                        <a href="#">
                            <i class="fa fa fa-bar-chart-o"></i>
                            <span class="nav-label">统计图表</span>
                            <span class="fa arrow"></span>
                        </a>
                        <ul class="nav nav-second-level collapse">
                            <li>
                                <a class="J_menuItem" href="http://www.zi-han.net/theme/hplus/graph_echarts.html"
                                   data-index="9">百度ECharts</a>
                            </li>

                        </ul>

                </ul>
            </div>

            <div class="slimScrollBar" style="width: 7px; position: absolute; top: 82px;
                 opacity: 0.4; display: none; border-radius: 7px; z-index: 99; right: 1px;
                 height: 471.484698097601px; background: rgb(0, 0, 0);"></div>
            <div class="slimScrollRail" style="width: 7px; height: 100%; position: absolute;
                top: 0px; display: none; border-radius: 7px; opacity: 0.9; z-index: 90;
                 right: 1px; background: rgb(51, 51, 51);"></div>
        </div>
    </nav>
    <!--左侧导航结束-->
    <!--右侧部分开始-->
    <div id="page-wrapper" class="gray-bg dashbard-1">
        <div class="row border-bottom">
            <nav class="navbar navbar-static-top" role="navigation" style="margin-bottom: 0">
                <div class="navbar-header">
                    <a class="navbar-minimalize minimalize-styl-2 btn btn-primary " href="#"><i class="fa fa-bars"></i>
                    </a>
                </div>
                <!-- 顶部右侧导航 -->
                <ul class="nav navbar-top-links navbar-right">
                    <!-- 消息 -->
                    <li class="dropdown">
                        <a class="dropdown-toggle count-info" data-toggle="dropdown" href="＃">
                            <i class="fa fa-envelope"></i> <span class="label label-warning">16</span>
                        </a>
                        <ul class="dropdown-menu dropdown-messages">
                            <li class="m-t-xs">
                                <div class="dropdown-messages-box">
                                    <a href="＃" class="pull-left">
                                        <img alt="image" class="img-circle"
                                             src="https://www.baidu.com/img/bd_logo1.png">
                                    </a>

                                    <div class="media-body">
                                        <small class="pull-right">46小时前</small>
                                        <strong>小四</strong>消息的主要内容
                                        <br>
                                        <small class="text-muted">3天前 2014.11.8</small>
                                    </div>
                                </div>
                            </li>
                            <li class="divider"></li>
                            <li>
                                <div class="text-center link-block">
                                    <a class="J_menuItem" href="＃" data-index="86">
                                        <i class="fa fa-envelope"></i> <strong> 查看所有消息</strong>
                                    </a>
                                </div>
                            </li>
                        </ul>
                    </li>
                    <!-- 消息 -->
                    <li class="dropdown">
                        <a class="dropdown-toggle count-info" data-toggle="dropdown" href="＃">
                            <i class="fa fa-bell"></i> <span class="label label-primary">8</span>
                        </a>
                        <ul class="dropdown-menu dropdown-alerts">
                            <li>
                                <a href="http://www.zi-han.net/theme/hplus/mailbox.html">
                                    <div>
                                        <i class="fa fa-envelope fa-fw"></i> 您有16条未读消息
                                        <span class="pull-right text-muted small">4分钟前</span>
                                    </div>
                                </a>
                            </li>
                            <li class="divider"></li>
                            <li>
                                <a href="http://www.zi-han.net/theme/hplus/profile.html">
                                    <div>
                                        <i class="fa fa-qq fa-fw"></i> 3条新回复
                                        <span class="pull-right text-muted small">12分钟钱</span>
                                    </div>
                                </a>
                            </li>
                            <li class="divider"></li>
                            <li>
                                <div class="text-center link-block">
                                    <a class="J_menuItem" href="http://www.zi-han.net/theme/hplus/notifications.html"
                                       data-index="87">
                                        <strong>查看所有 </strong>
                                        <i class="fa fa-angle-right"></i>
                                    </a>
                                </div>
                            </li>
                        </ul>
                    </li>
                    <!--帮助页面-->
                    <li class="hidden-xs">
                        <a href="＃" class="J_menuItem" data-index="0"><i class="fa fa-cart-arrow-down"></i>帮助</a>
                    </li>
                    <li class="dropdown hidden-xs">
                        <a class="right-sidebar-toggle" aria-expanded="false">
                            <i class="fa fa-tasks"></i>
                        </a>
                    </li>
                </ul>
            </nav>
        </div>
        <!-- 网页内容 -->
        <div class="row content-tabs">
            <button class="roll-nav roll-left J_tabLeft"><i class="fa fa-backward"></i>
            </button>
            <nav class="page-tabs J_menuTabs">
                <div class="page-tabs-content" style="margin-left: 0px;">
                    <a href="javascript:;" class="J_menuTab active" data-id="index_v1.html">首页</a>
                </div>
            </nav>
            <button class="roll-nav roll-right J_tabRight"><i class="fa fa-forward"></i>
            </button>
            <div class="btn-group roll-nav roll-right">
                <button class="dropdown J_tabClose" data-toggle="dropdown" aria-expanded="false">关闭操作<span
                        class="caret"></span>

                </button>
                <ul role="menu" class="dropdown-menu dropdown-menu-right">
                    <li class="J_tabShowActive"><a>定位当前选项卡</a>
                    </li>
                    <li class="divider"></li>
                    <li class="J_tabCloseAll"><a>关闭全部选项卡</a>
                    </li>
                    <li class="J_tabCloseOther"><a>关闭其他选项卡</a>
                    </li>
                </ul>
            </div>
            <a href="login.jsp" class="roll-nav roll-right J_tabExit"><i class="fa fa fa-sign-out"></i> 退出</a>
        </div>
        <div class="row J_mainContent" id="content-main">
            <iframe class="J_iframe" name="iframe0" width="100%" height="100%" src="" frameborder="0" data-id=""
                    seamless="" style="display: inline;"></iframe>
        </div>
        <div class="footer">
            <div class="pull-right">© 2014-2015 <a href="http://www.zi-han.net/" target="_blank">专书</a>
            </div>
        </div>
    </div>
    <!--右侧部分结束-->
    <!--右侧边栏开始-->
    <div id="right-sidebar" class="">
        <div class="slimScrollDiv" style="position: relative; width: auto; height: 100%;">
            <div class="sidebar-container" style="width: auto; height: 100%;">

                <ul class="nav nav-tabs navs-3">

                    <li class="active"><a data-toggle="tab" href="http://www.zi-han.net/theme/hplus/#tab-1">
                        通知
                    </a>
                    </li>
                    <li><a data-toggle="tab" href="http://www.zi-han.net/theme/hplus/#tab-2">
                        项目进度
                    </a>
                    </li>
                    <li class="">
                        <a data-toggle="tab" href="http://www.zi-han.net/theme/hplus/#tab-3">
                            <i class="fa fa-gear"></i>
                        </a>
                    </li>
                </ul>

                <div class="tab-content">

                    <!--／tab1 -->
                    <div id="tab-1" class="tab-pane active">

                        <div class="sidebar-title">
                            <h3><i class="fa fa-comments-o"></i> 最新通知</h3>
                            <small><i class="fa fa-tim"></i> 您当前有10条未读信息</small>
                        </div>

                        <div>

                            <div class="sidebar-message">
                                <a href="#">
                                    <div class="pull-left text-center">
                                        <img alt="image" class="img-circle message-avatar" src="">

                                        <div class="m-t-xs">
                                            <i class="fa fa-star text-warning"></i>
                                            <i class="fa fa-star text-warning"></i>
                                        </div>
                                    </div>
                                    <div class="media-body">

                                        系统消息啊
                                        <br>
                                        <small class="text-muted">今天 4:21</small>
                                    </div>
                                </a>
                            </div>

                        </div>

                    </div>

                    <!--／tab2-->
                    <div id="tab-2" class="tab-pane">

                        <div class="sidebar-title">
                            <h3><i class="fa fa-cube"></i> 最新任务</h3>
                            <small><i class="fa fa-tim"></i> 您当前有14个任务，10个已完成</small>
                        </div>

                        <ul class="sidebar-list">
                            <li>
                                <a href="#">
                                    <div class="small pull-right m-t-xs">9小时以后</div>
                                    <h4>市场调研</h4> 按要求接收教材；

                                    <div class="small">已完成： 22%</div>
                                    <div class="progress progress-mini">
                                        <div style="width: 22%;" class="progress-bar progress-bar-warning"></div>
                                    </div>
                                    <div class="small text-muted m-t-xs">项目截止： 4:00 - 2015.10.01</div>
                                </a>
                            </li>

                        </ul>

                    </div>

                    <div id="tab-3" class="tab-pane">

                        <div class="sidebar-title">
                            <h3><i class="fa fa-gears"></i> 设置</h3>
                        </div>

                        <div class="setings-item">
                            <span>
                                显示通知
                            </span>

                            <div class="switch">
                                <div class="onoffswitch">
                                    <input type="checkbox" name="collapsemenu" class="onoffswitch-checkbox"
                                           id="example">
                                    <label class="onoffswitch-label" for="example">
                                        <span class="onoffswitch-inner"></span>
                                        <span class="onoffswitch-switch"></span>
                                    </label>
                                </div>
                            </div>
                        </div>
                        <div class="sidebar-content">
                            <h4>设置</h4>

                            <div class="small">
                                你可以从这里设置一些常用选项，当然啦，这个只是个演示的示例。
                            </div>
                        </div>

                    </div>
                </div>

            </div>
            <div class="slimScrollBar"
                 style="width: 7px; position: absolute; top: 0px; opacity: 0.4; display: block; border-radius: 7px; z-index: 99; right: 1px; height: 584.509708737864px; background: rgb(0, 0, 0);"></div>
            <div class="slimScrollRail"
                 style="width: 7px; height: 100%; position: absolute; top: 0px; display: none; border-radius: 7px; opacity: 0.4; z-index: 90; right: 1px; background: rgb(51, 51, 51);"></div>
        </div>


    </div>
    <!--右侧边栏结束-->

</div>

<!-- 全局js -->
<script src="js/jquery-2.1.1.min.js"></script>
<script src="js/bootstrap.min.js"></script>
<script src="js/jquery.metisMenu.js"></script>
<script src="js/jquery.slimscroll.min.js"></script>
<script src="js/layer.min.js"></script>

<!-- 自定义js -->
<script src="js/hplus.min.js"></script>
<script type="text/javascript" src="js/contabs.min.js"></script>

<!-- 第三方插件 -->
<script src="js/pace.min.js"></script>


<div class="theme-config">
    <div class="theme-config-box">
        <div class="spin-icon">
            <i class="fa fa-cog fa-spin"></i>
        </div>
        <div class="skin-setttings">
            <div class="title">主题设置</div>
            <div class="setings-item">
                <span>
                        收起左侧菜单
                    </span>

                <div class="switch">
                    <div class="onoffswitch">
                        <input type="checkbox" name="collapsemenu" class="onoffswitch-checkbox" id="collapsemenu">
                        <label class="onoffswitch-label" for="collapsemenu">
                            <span class="onoffswitch-inner"></span>
                            <span class="onoffswitch-switch"></span>
                        </label>
                    </div>
                </div>
            </div>
            <div class="setings-item">
                <span>
                        固定顶部
                    </span>

                <div class="switch">
                    <div class="onoffswitch">
                        <input type="checkbox" name="fixednavbar" class="onoffswitch-checkbox" id="fixednavbar">
                        <label class="onoffswitch-label" for="fixednavbar">
                            <span class="onoffswitch-inner"></span>
                            <span class="onoffswitch-switch"></span>
                        </label>
                    </div>
                </div>
            </div>
            <div class="setings-item">
                <span>
                        固定宽度
                    </span>

                <div class="switch">
                    <div class="onoffswitch">
                        <input type="checkbox" name="boxedlayout" class="onoffswitch-checkbox" id="boxedlayout">
                        <label class="onoffswitch-label" for="boxedlayout">
                            <span class="onoffswitch-inner"></span>
                            <span class="onoffswitch-switch"></span>
                        </label>
                    </div>
                </div>
            </div>
            <div class="title">皮肤选择</div>
            <div class="setings-item default-skin">
                <span class="skin-name ">
                         <a href="#" class="s-skin-0">
                             默认皮肤
                         </a>
                    </span>
            </div>
            <div class="setings-item blue-skin">
                <span class="skin-name ">
                        <a href="#" class="s-skin-1">
                            蓝色主题
                        </a>
                    </span>
            </div>
            <div class="setings-item yellow-skin">
                <span class="skin-name ">
                        <a href="#" class="s-skin-3">
                            黄色/紫色主题
                        </a>
                    </span>
            </div>
        </div>
    </div>
</div>

<script type="text/javascript" src="js/common.js"></script>

<!--<style>
    .fixed-nav .slimScrollDiv #side-menu {
        padding-bottom: 60px;
    }
</style>-->
</body>
</html>