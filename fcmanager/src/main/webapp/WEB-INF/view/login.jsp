<%@ page language="java" errorPage="common/error.jsp" pageEncoding="UTF-8" contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="shortcut icon" type="image/x-icon"
          href="<c:url value="/resources/images/favicon.ico"></c:url>">

    <title>富城科技 - 登录</title>
    <meta name="keywords" content="富城科技">
    <meta name="description" content="富城科技基坑项目">

    <link href='<c:url value="resources/css/bootstrap.min.css?v=3.4.0"></c:url>' rel="stylesheet">
    <link href='<c:url value="resources/css/font-awesome.min.css?v=4.4.0"></c:url>' rel="stylesheet">
    <link href='<c:url value="resources/css/animate.min.css"></c:url>' rel="stylesheet">
    <link href='<c:url value="resources/css/style.min.css?v=3.2.0"></c:url>' rel="stylesheet">

    <script type="text/javascript">
        if (window.top !== window.self) {
            window.top.location = window.location;
        }
    </script>

</head>

<body class="gray-bg" youdao="bind">

<div class="middle-box text-center loginscreen  animated fadeInDown">
    <div>
        <div>

            <h1 class="logo-name">FC</h1>

        </div>
        <h3>欢迎使用 富城科技系统</h3>

        <form class="m-t" role="form" action="http://www.zi-han.net/theme/hplus/index.html">
            <div class="form-group">
                <input type="email" class="form-control" placeholder="用户名" required="">
            </div>
            <div class="form-group">
                <input type="password" class="form-control" placeholder="密码" required="">
            </div>
            <button type="submit" class="btn btn-primary block full-width m-b">登 录</button>


            <p class="text-muted text-left"><a href="#">
                <small>忘记密码了？</small>
            </a> <!--| <a href="＃">联系管理</a>-->
            </p>

        </form>
    </div>
</div>

<!-- 全局js -->
<script src="<c:url value="resources/js/jquery-2.1.1.min.js"></c:url>"></script>
<script src="<c:url value="resources/js/bootstrap.min.js"></c:url>"></script>
</body>
</html>