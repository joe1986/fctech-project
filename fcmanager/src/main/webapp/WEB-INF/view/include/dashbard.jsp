<%@ page language="java" errorPage="../common/error.jsp" pageEncoding="UTF-8" contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

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
                        <i class="fa fa-tasks">主题</i>
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
        <a href="<c:url value="logout" />" class="roll-nav roll-right J_tabExit"><i class="fa fa fa-sign-out"></i>
            退出</a>
    </div>
    <div class="row J_mainContent" id="content-main">
        <iframe class="J_iframe" name="iframe0" width="100%" height="100%" src="" frameborder="0" data-id=""
                seamless="" style="display: inline;"></iframe>
    </div>
    <div class="footer">
        <div class="pull-right">© 2014-2015 <a href="<c:url value="/login" />" <%--target="_blank"--%>>专书</a>
        </div>
    </div>
</div>