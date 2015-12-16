<%@ page language="java" errorPage="common/error.jsp" pageEncoding="UTF-8" contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="shortcut icon" type="image/x-icon"
          href="<c:url value="/resources/images/favicon.ico"></c:url>">

    <title>富城科技 - 登录</title>
    <meta name="keywords" content="富城科技">
    <meta name="description" content="富城科技基坑项目">

    <link href='<c:url value="/resources/css/bootstrap.min.css?v=3.4.0"></c:url>' rel="stylesheet">
    <link href='<c:url value="/resources/css/font-awesome.min.css?v=4.4.0"></c:url>' rel="stylesheet">
    <link href='<c:url value="/resources/css/animate.min.css"></c:url>' rel="stylesheet">
    <link href='<c:url value="/resources/css/style.min.css?v=3.2.0"></c:url>' rel="stylesheet">
    <link href='<c:url value="/resources/css/layer.css"></c:url>' id="layui_layer_skinlayercss" rel="stylesheet">
    <link href='<c:url value="/resources/css/layer.ext.css"></c:url>' id="layui_layer_skinlayerextcss" rel="stylesheet">
    <link href='<c:url value="/resources/css/style.css"></c:url>' id="layui_layer_skinmoonstylecss" rel="stylesheet">
</head>

<body class="fixed-sidebar full-height-layout gray-bg  pace-done" style="overflow:hidden">
<div class="pace  pace-inactive">
    <div class="pace-progress" data-progress-text="100%" data-progress="99" style="width: 100%;">
        <div class="pace-progress-inner"></div>
    </div>
    <div class="pace-activity"></div>
</div>
<div id="wrapper">
    <!--左侧导航开始-->
    <c:import url="include/navbar.jsp"/>
    <!--左侧导航结束-->

    <!--右侧部分开始-->
    <c:import url="include/dashbard.jsp"/>
    <!--右侧部分结束-->

    <!--右侧边栏开始-->
    <c:import url="include/rightSidebar.jsp"/>
    <!--右侧边栏结束-->

</div>

<!-- 全局js -->
<script src='<c:url value="resources/js/jquery.min.js"></c:url>'></script>
<script src='<c:url value="resources/js/bootstrap.min.js"></c:url>'></script>
<script src='<c:url value="resources/js/jquery.metisMenu.js"></c:url>'></script>
<script src='<c:url value="resources/js/jquery.slimscroll.min.js"></c:url>'></script>
<script src='<c:url value="resources/js/layer.min.js"></c:url>'></script>
<!-- 自定义js -->
<script src='<c:url value="resources/js/hplus.min.js"></c:url>'></script>
<script src='<c:url value="resources/js/contabs.min.js"></c:url>'></script>
<!-- 第三方插件 -->
<script src='<c:url value="resources/js/pace.min.js"></c:url>'></script>

<script type="text/javascript" src='<c:url value="resources/js/common.js"></c:url>'></script>

</body>
</html>