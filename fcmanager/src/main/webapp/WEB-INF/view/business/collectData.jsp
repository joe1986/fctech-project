<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en" lang="en">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <meta http-equiv="imagetoolbar" content="no">
    <link rel="shortcut icon" type="image/x-icon"
          href="<c:url value="/resources/images/favicon.ico"></c:url>">
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
                    <li><a id="btn-add" href="#">列表</a>
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
                        <select id="project" class="form-control">
                            <option>项目一</option>
                            <option>项目二</option>
                        </select>
                    </div>
                    <label class="col-sm-2 control-label">选择底图：</label>

                    <div class="col-sm-4">
                        <select  id="project_pic" class="form-control">
                            <option>底图一</option>
                            <option>底图二</option>
                        </select>
                    </div>
                </div>

            </form>
            <div id="layout_drawing"  data-toggle="context" class="layout-drawing" >
                <div id="svgzoom" class="controls" >
                    <div class="controls-zoom">
                        <p><button class="btn btn-primary btn_refresh"><i class="glyphicon glyphicon-refresh"></i></button></p>
                        <p><button class="btn btn-primary btn_plus"><i class="glyphicon glyphicon-plus"></i></button> </p>
                        <p><button class="btn btn-primary btn_minus"><i class="glyphicon glyphicon-minus"></i></button></p>
                    </div>
                    <div class="controls-pan">
                        <p><button class="btn btn-primary  btn_arrow_up"><i class="glyphicon glyphicon-chevron-up"></i></button></p>
                        <p>
                            <button class="btn btn-primary btn_arrow_left"><i class="glyphicon glyphicon-chevron-left"></i></button>
                            <button class="btn btn-primary btn_arrow_right"><i class="glyphicon glyphicon-chevron-right"></i></button>
                        </p>
                        <p><button class="btn btn-primary btn_arrow_down"><i class="glyphicon glyphicon-chevron-down"></i></button></p>
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
<c:import url="preview.jsp" />
<!-- 监测点信息 -->
<c:import url="station.jsp"/>
<!-- 数据窗口 -->
<c:import url="data.jsp"/>

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