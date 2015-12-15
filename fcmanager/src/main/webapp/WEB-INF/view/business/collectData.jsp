<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en" lang="en">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <meta http-equiv="imagetoolbar" content="no">
    <link rel="icon" type="image/x-icon" href="/images/favicon.ico">
    <meta name="robots" content="noindex,nofollow">
    <title>数据采集</title>

    <link href='<c:url value="/resources/css/bootstrap.min.css?v=3.4.0"></c:url>' rel="stylesheet">
    <link href='<c:url value="/resources/css/font-awesome.min.css?v=4.4.0"></c:url>' rel="stylesheet">
    <link href='<c:url value="/resources/css/animate.min.css"></c:url>' rel="stylesheet">
    <link href='<c:url value="/resources/css/style.min.css?v=3.2.0"></c:url>' rel="stylesheet">
    <link href='<c:url value="/resources/css/collectData.css"></c:url>' rel="stylesheet">
    <link href='<c:url value="/resources/css/bootstrap-dropdown-menu.css"></c:url>' rel="stylesheet">
</head>

<body class="gray-bg">
<div class="wrapper wrapper-content animated fadeInRight collectData">
    <div class="ibox float-e-margins">
        <div class="ibox-title">
            <h5>新增用户</h5>

            <div class="ibox-tools">
                <a class="collapse-link">
                    <i class="fa fa-chevron-up"></i>
                </a>
                <a class="dropdown-toggle" data-toggle="dropdown" href="#">
                    <i class="fa fa-wrench"></i>
                </a>
                <ul class="dropdown-menu dropdown-user">
                    <li><a id="" href="#">列表</a>
                    </li>
                    <li><a href="#">选项2</a>
                    </li>
                </ul>
                <a class="close-link">
                    <i class="fa fa-times"></i>
                </a>
            </div>
        </div>
        <div class="ibox-content">
            <form class="form-horizontal">

                <div class="form-group">
                    <label class="col-sm-2 control-label">选择项目：</label>

                    <div class="col-sm-4">
                        <select class="span10" id="project">
                            <option>项目一</option>
                            <option>项目二</option>
                        </select>
                    </div>
                    <label class="col-sm-2 control-label">选择底图：</label>

                    <div class="col-sm-4">
                        <select class="span10" id="project_pic">
                            <option>底图一</option>
                            <option>底图二</option>
                        </select>
                    </div>
                </div>

            </form>
            <div id="layout_drawing"  data-toggle="context" class="layout-drawing" >
                <div id="svgzoom" class="controls" >
                    <div class="controls-zoom">
                        <p><button class="btn green btn_refresh"><i class="glyphicon-refresh"></i></button></p>
                        <p><button class="btn green btn_plus"><i class="glyphicon-plus"></i></button> </p>
                        <p><button class="btn green btn_minus"><i class="glyphicon-minus"></i></button></p>
                    </div>
                    <div class="controls-pan">
                        <p><button class="btn green  btn_arrow_up"><i class="glyphicon-arrow-up"></i></button></p>
                        <p>
                            <button class="btn green btn_arrow_left"><i class="glyphicon-arrow-left"></i></button>
                            <button class="btn green btn_arrow_right"><i class="glyphicon-arrow-right"></i></button>
                        </p>
                        <p><button class="btn green btn_arrow_down"><i class="glyphicon-arrow-down"></i></button></p>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>


<div id="context-menu" style="position: absolute; z-index: 9999; top: 420px; left: 317px;" class="">
    <ul id="station_dropdown_menu" class="bootstrap-dropdown-menu" role="menu">
    </ul>
</div>

<!-- start: JavaScript-->
<!-- 预览图 -->
<div id="long_preview" class="modal hide fade" tabindex="-1" data-replace="true">
    <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-hidden="true"><i class="icon-remove"></i></button>
        <h3>预览图</h3>
    </div>
    <div class="modal-body">
        <canvas id="canvas" ></canvas>
        <!--<img id="preview_img" style="background-repeat: no-repeat"/>-->
        <!--<img style="height: 100%;width: 100%;"  id = "preview_img" src="">-->
    </div>
    <div class="modal-footer">
        <button type="button" data-dismiss="modal" class="btn">保存</button>
    </div>
</div>
<!-- 监测点信息 -->
<div id="long_stationinfo" class="modal hide fade" tabindex="-1" data-replace="true">
    <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-hidden="true"><i class="icon-remove"></i></button>
        <h3>监测点信息</h3>
    </div>
    <div class="modal-body">
        <table id="config-datatable-9" class="table  table-bordered bootstrap-datatable">

            <tbody>
            <tr>
                <td align="left" colspan="2" style="background-color: #f9f9f9;">基本信息</td>
            </tr>
            <tr>
                <td width="30%">传感器数</td>
                <td class="center">1</td>
            </tr>
            <tr>
                <td>当前状态</td>
                <td class="center">已使用</td>
            </tr>
            <tr>
                <td>类型</td>
                <td class="center">集中力</td>
            </tr>
            <tr>
                <td>名称</td>
                <td class="center">1号监测点</td>
            </tr>
            <tr>
                <td>最近数据更新时间</td>
                <td class="center">2015-06-15</td>
            </tr>
            <tr>
                <td align="left" colspan="2" style="background-color: #f9f9f9;">数&nbsp;&nbsp;&nbsp;据</td>
            </tr>
            <tr>
                <td>沉降</td>
                <td class="center">0</td>
            </tr>
            <tr>
                <td>常量</td>
                <td class="center">0</td>
            </tr>
            <tr>
                <td>初始数据</td>
                <td class="center">0</td>
            </tr>
            <tr>
                <td>集中力</td>
                <td class="center">－40.0</td>
            </tr>
            <tr>
                <td>弯曲力</td>
                <td class="center">0</td>
            </tr>
            <tr>
                <td>位移</td>
                <td class="center">0</td>
            </tr>
            <tr>
                <td>温度</td>
                <td class="center">37.0</td>
            </tr>

            </tbody>
        </table>
    </div>
    <div class="modal-footer">
        <button type="button" data-dismiss="modal" class="btn">保存</button>
    </div>
</div>
<!-- 数据窗口 -->
<div id="long_datawin" class="modal container hide fade" tabindex="-1" data-replace="true">
    <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-hidden="true"><i class="icon-remove"></i></button>
        <h3>应变公式设置</h3>
    </div>
    <div class="modal-body" width="1000px">
        <div class="box-content">
            <div class="row-fluid">
                <div class="span6">
                    <div id="sensor_layout_drawing"  data-toggle="context" style="width:100%;border:1px solid #ddd"></div>
                    <form class="horizontal-form form-bordered">
                        <h3 class="form-section">传感器属性</h3>
                        <div class="row-fluid">
                            <div class="control-group">
                                <label class="control-label" for="comp_color">传感器编号</label>
                                <div class="controls">
                                    <input class="focused span6" id="" type="text" value="">
                                    <button type="submit" class="btn blue"><i class="icon-ok"></i>保&nbsp;&nbsp;&nbsp;存</button>
                                </div>
                            </div>
                        </div>
                        </fieldset>
                    </form>
                </div>
                <div class="span6">
                    <div class="tabbable tabbable-custom">
                        <ul class="nav nav-tabs">
                            <li class="active"><a href="#tab_1_1" data-toggle="tab">轴向力</a></li>
                            <li><a href="#tab_1_2" data-toggle="tab">弯曲力</a></li>
                            <!--<li><a href="#tab_1_3" data-toggle="tab">传感器分布图</a></li>-->
                        </ul>
                        <div class="tab-content">
                            <div class="tab-pane active" id="tab_1_1">
                                <form class="form-horizontal  form">
                                    <fieldset>
                                        <h3 class="form-section">设置公式</h3>

                                        <div class="control-group">
                                            <label class="control-label" for="img">当前公式</label>

                                            <div class="controls">
                                                <input class="focused span6" id="dtuNo" type="text" value="a+b+c" disabled>
                                            </div>
                                        </div>

                                        <div class="control-group">
                                            <label class="control-label" for="img">输入公式</label>

                                            <div class="controls">
                                                <input class="focused span6" id="dtuNo" type="text" value="">
                                            </div>
                                        </div>

                                        <div class="control-group">
                                            <label class="control-label" for="img">历史公式</label>

                                            <div class="controls">
                                                <select class="span6" id="img">
                                                    <option>a+b+c</option>
                                                    <option>a+b-c</option>
                                                    <option>a+b*c</option>
                                                </select>
                                            </div>
                                        </div>

                                        <h3 class="form-section">报警值</h3>

                                        <div class="control-group">
                                            <label class="control-label" for="img">报警上限</label>

                                            <div class="controls">
                                                <input class="focused span6" id="dtuNo" type="text" value="">
                                            </div>
                                        </div>

                                        <div class="control-group">
                                            <label class="control-label" for="img">报警下限</label>

                                            <div class="controls">
                                                <input class="focused span6" id="dtuNo" type="text" value="">
                                            </div>
                                        </div>
                                    </fieldset>
                                    <div class="form-actions" style="padding: 19px 50px 20px;">
                                        <button type="submit" class="btn blue"><i class="icon-ok"></i>保&nbsp;&nbsp;&nbsp;存</button>
                                        <button class="btn">取&nbsp;&nbsp;消</button>
                                    </div>
                                </form>

                            </div>

                            <div class="tab-pane" id="tab_1_2">
                                <form class="form-horizontal  form">
                                    <fieldset>
                                        <h3 class="form-section">设置公式</h3>

                                        <div class="control-group">
                                            <label class="control-label" for="img">当前公式</label>

                                            <div class="controls">
                                                <input class="focused span6" id="dtuNo" type="text" value="a+b+c" disabled>
                                            </div>
                                        </div>

                                        <div class="control-group">
                                            <label class="control-label" for="img">输入公式</label>

                                            <div class="controls">
                                                <input class="focused span6" id="dtuNo" type="text" value="">
                                            </div>
                                        </div>

                                        <div class="control-group">
                                            <label class="control-label" for="img">历史公式</label>

                                            <div class="controls">
                                                <select class="span6" id="img">
                                                    <option>a+b+c</option>
                                                    <option>a+b-c</option>
                                                    <option>a+b*c</option>
                                                </select>
                                            </div>
                                        </div>

                                        <h3 class="form-section">报警值</h3>

                                        <div class="control-group">
                                            <label class="control-label" for="img">报警上限</label>

                                            <div class="controls">
                                                <input class="focused span6" id="dtuNo" type="text" value="220.00">
                                            </div>
                                        </div>

                                        <div class="control-group">
                                            <label class="control-label" for="img">报警下限</label>

                                            <div class="controls">
                                                <input class="focused span6" id="dtuNo" type="text" value="160.00">
                                            </div>
                                        </div>

                                        <div class="form-actions" style="padding: 19px 50px 20px;">
                                            <button type="submit" class="btn blue"><i class="icon-ok"></i>保&nbsp;&nbsp;&nbsp;存</button>
                                            <button class="btn">取&nbsp;&nbsp;消</button>
                                        </div>
                                    </fieldset>
                                </form>
                            </div>

                            <!--<div class="tab-pane" id="tab_1_3">-->
                            <!--<div id="sensor_layout_drawing"  data-toggle="context" style="height:300px;width:650px;border:1px solid #ddd"></div>-->
                            <!--</div>-->

                        </div>

                    </div>
                </div>
            </div>

            <div class="row-fluid">
                <table class="table table-striped table-bordered bootstrap-datatable datatable table-hover " id="config-datatable">
                    <thead>
                    <tr>
                        <th>传感器</th>
                        <th>报警上限</th>
                        <th>报警下限</th>
                        <th>状态</th>
                        <th>操作</th>
                    </tr>
                    </thead>

                    <tbody>
                    <tr>
                        <td>编号897578</td>
                        <td class="center">100</td>
                        <td class="center">50</td>
                        <td class="center">
                            <span class="label label-success">Active</span>
                        </td>
                        <td class="center">
                            <a class="btn red" href="#">
                                <i class="halflings-icon white trash"></i>
                            </a>
                        </td>
                    </tr>
                    </tbody>
                </table>
            </div>
        </div>
    </div>
    <div class="modal-footer">
        <button type="button" data-dismiss="modal" class="btn">保存</button>
    </div>

    <div id="sensor_context_menu" style="position: absolute; z-index: 10000; top: 420px; left: 317px;" class="">
        <ul id="sensor_dropdown_menu" class="bootstrap-dropdown-menu" role="menu">

        </ul>
    </div>
</div>

<script type="text/javascript" src="<c:url value="/resources/js/jquery.min.js" />"></script>
<script type="text/javascript" src="<c:url value="/resources/js/bootstrap.min.js" />"></script>
<script type="text/javascript" src="<c:url value="/resources/js/bootstrap-contextmenu.js" />"></script>
<script type="text/javascript" src="<c:url value="/resources/js/bootstrap-colorpicker.js" />"></script>
<script type="text/javascript" src="<c:url value="/resources/js/content.min.js" />"></script>

<script type="text/javascript" src="<c:url value="/resources/js/svg.js" />"></script>
<script type="text/javascript" src="<c:url value="/resources/js/svg.draggable.js" />"></script>
<script type="text/javascript" src="<c:url value="/resources/js/jquery.svg.pan.zoom.js" />"></script>
<script type="text/javascript" src="<c:url value="/resources/js/canvg.js" />"></script>
<script type="text/javascript" src="<c:url value="/resources/js/raphael-min.js" />"></script>
<script type="text/javascript" src="<c:url value="/resources/js/rgbcolor.js" />"></script>
<script type="text/javascript" src="<c:url value="/resources/js/StackBlur.js" />"></script>

<script type="text/javascript" src="<c:url value="/resources/js/config.js" />"></script>
<script type="text/javascript" src="<c:url value="/resources/js/menu.js" />"></script>
<script>
    $(document).ready(function () {

    });
</script>
</body>
</html>