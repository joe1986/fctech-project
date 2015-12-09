<%@ page language="java" errorPage="../error.jsp" pageEncoding="UTF-8" contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib  prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn"  uri="http://java.sun.com/jsp/jstl/functions" %>

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