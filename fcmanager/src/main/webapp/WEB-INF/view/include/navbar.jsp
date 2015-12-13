<%@ page language="java" errorPage="../common/error.jsp" pageEncoding="UTF-8" contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<nav class="navbar-default navbar-static-side" role="navigation">
    <div class="nav-close"><i class="fa fa-times-circle"></i>
    </div>
    <div class="slimScrollDiv" style="position: relative; width: auto; height: 100%;">
        <div class="sidebar-collapse" style="width: auto; height: 100%;">
            <ul class="nav" id="side-menu" style="display: block;">
                <li class="nav-header">
                    <div class="dropdown profile-element">
                        <span><img alt="image" class="img-circle"
                                   src='<c:url value="resources/img/profile_small.jpg"></c:url>'/></span>
                        <a data-toggle="dropdown" class="dropdown-toggle" href="home.jsp" aria-expanded="false">
                                <span class="clear">
                               <span class="block m-t-xs"><strong class="font-bold">周专书</strong></span>
                                <span class="text-muted text-xs block">超级管理员<b class="caret"></b></span>
                                </span>
                        </a>
                        <ul class="dropdown-menu animated fadeInRight m-t-xs">
                            <%--   <li><a class="J_menuItem" href="#"
                                      data-index="0">修改头像</a>
                               </li>
                               <li><a class="J_menuItem" href="#"
                                      data-index="1">个人资料</a>
                               </li>
                               <li><a class="J_menuItem" href="#"
                                      data-index="2">联系我们</a>
                               </li>
                               <li class="divider"></li>--%>
                            <li><a href="<c:url value="logout" />">安全退出</a>
                            </li>
                        </ul>
                    </div>
                    <div class="logo-element">FC
                    </div>
                </li>
                <li class="">
                    <a href="http://www.baidu.com/">
                        <i class="fa fa-home"></i>
                        <span class="nav-label">基本信息</span>
                        <span class="fa arrow"></span>
                    </a>
                    <ul class="nav nav-second-level collapse" aria-expanded="false" style="height: 0px;">
                        <li>
                            <a class="J_menuItem" href="<c:url value="/company/list"></c:url>" data-index="0">公司管理</a>
                        </li>
                        <li>
                            <a class="J_menuItem" href="<c:url value="/project/list"></c:url>" data-index="5">项目管理</a>
                        </li>
                        <li>
                            <a class="J_menuItem" href="<c:url value="/user/list"></c:url>" data-index="6">用户管理</a>
                        </li>
                    </ul>

                </li>

                <li>
                    <a class="J_menuItem" href="http://www.zi-han.net/theme/hplus/layouts.html" data-index="8"><i
                            class="fa fa-columns"></i> <span class="nav-label">权限管理</span></a>
                    <ul class="nav nav-second-level collapse" aria-expanded="false" style="height: 0px;">
                        <li>
                            <a class="J_menuItem" href="<c:url value="/user/menu"></c:url>" data-index="0">菜单管理</a>
                        </li>
                        <li>
                            <a class="J_menuItem" href="<c:url value="/user/role"></c:url>" data-index="5">角色管理</a>
                        </li>
                        <li>
                            <a class="J_menuItem" href="<c:url value="/user/roleMenu"></c:url>"
                               data-index="6">角色菜单配置</a>
                        </li>
                        <li>
                            <a class="J_menuItem" href="<c:url value="/user/userRole"></c:url>"
                               data-index="6">用户角色配置</a>
                        </li>
                    </ul>
                </li>

                <li>
                    <a class="J_menuItem" href="http://www.zi-han.net/theme/hplus/layouts.html" data-index="8"><i
                            class="fa fa-columns"></i> <span class="nav-label">项目业务</span></a>
                    <ul class="nav nav-second-level collapse" aria-expanded="false" style="height: 0px;">
                        <li>
                            <a class="J_menuItem" href="<c:url value="/business/collectData"></c:url>" data-index="0">信息采集</a>
                        </li>
                        <li>
                            <a class="J_menuItem" href="<c:url value="/business/projectConfig"></c:url>" data-index="5">项目管理</a>
                        </li>
                        <li>
                            <a class="J_menuItem" href="<c:url value="/business/projectManager"></c:url>"
                               data-index="5">项目管理</a>
                        </li>
                    </ul>
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
                               data-index="9">报表图</a>
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