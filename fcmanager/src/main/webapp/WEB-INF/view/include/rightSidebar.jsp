<%@ page language="java" errorPage="../common/error.jsp" pageEncoding="UTF-8" contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<div id="right-sidebar" class="">
    <div class="slimScrollDiv" style="position: relative; width: auto; height: 100%;"><div class="sidebar-container" style="width: auto; height: 100%;">

        <ul class="nav nav-tabs navs-3">

            <li class="active">
                <a data-toggle="tab" href="#tab-1" aria-expanded="true">
                    <i class="fa fa-gear"></i> 主题
                </a>
            </li>
            <li class=""><a data-toggle="tab" href="#tab-2" aria-expanded="false">
                通知
            </a>
            </li>
            <li class=""><a data-toggle="tab" href="#tab-3" aria-expanded="false">
                项目进度
            </a>
            </li>
        </ul>

        <div class="tab-content">
            <div id="tab-1" class="tab-pane active">
                <div class="sidebar-title">
                    <h3> <i class="fa fa-comments-o"></i> 主题设置</h3>
                    <small><i class="fa fa-tim"></i> 你可以从这里选择和预览主题的布局和样式，这些设置会被保存在本地，下次打开的时候会直接应用这些设置。</small>
                </div>
                <div class="skin-setttings">
                    <div class="title">主题设置</div>
                    <div class="setings-item">
                        <span>收起左侧菜单</span>
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
                        <span>固定顶部</span>

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
                    <div class="setings-item default-skin nb">
                                <span class="skin-name ">
                         <a href="#" class="s-skin-0">
                             默认皮肤
                         </a>
                    </span>
                    </div>
                    <div class="setings-item blue-skin nb">
                                <span class="skin-name ">
                        <a href="#" class="s-skin-1">
                            蓝色主题
                        </a>
                    </span>
                    </div>
                    <div class="setings-item yellow-skin nb">
                                <span class="skin-name ">
                        <a href="#" class="s-skin-3">
                            黄色/紫色主题
                        </a>
                    </span>
                    </div>
                </div>
            </div>
            <div id="tab-2" class="tab-pane">

                <div class="sidebar-title">
                    <h3> <i class="fa fa-comments-o"></i> 最新通知</h3>
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

                                据天津日报报道：瑞海公司董事长于学伟，副董事长董社轩等10人在13日上午已被控制。
                                <br>
                                <small class="text-muted">今天 4:21</small>
                            </div>
                        </a>
                    </div>

                </div>

            </div>
            <div id="tab-3" class="tab-pane">

                <div class="sidebar-title">
                    <h3> <i class="fa fa-cube"></i> 最新任务</h3>
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
        </div>

    </div><div class="slimScrollBar" style="width: 4px; position: absolute; top: 0px; opacity: 0.4; display: none; border-radius: 7px; z-index: 99; right: 1px; height: 715px; background: rgb(0, 0, 0);"></div><div class="slimScrollRail" style="width: 4px; height: 100%; position: absolute; top: 0px; display: none; border-radius: 7px; opacity: 0.4; z-index: 90; right: 1px; background: rgb(51, 51, 51);"></div></div>
</div>