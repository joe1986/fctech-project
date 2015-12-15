<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en" lang="en">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <meta http-equiv="imagetoolbar" content="no">
    <link rel="icon" type="image/x-icon" href="/images/favicon.ico">
    <link rel="shortcut icon" type="image/x-icon"
          href="http://kidmondo.com/wp-content/themes/kidmondo2/images/favicon.ico">
    <meta name="robots" content="noindex,nofollow">
    <title>项目明细</title>

    <link href='<c:url value="/resources/css/bootstrap.min.css?v=3.4.0"></c:url>' rel="stylesheet">
    <link href='<c:url value="/resources/css/font-awesome.min.css?v=4.4.0"></c:url>' rel="stylesheet">
    <link href='<c:url value="/resources/css/animate.min.css"></c:url>' rel="stylesheet">
    <link href='<c:url value="/resources/css/style.min.css?v=3.2.0"></c:url>' rel="stylesheet">
</head>

<body class="gray-bg">
<div class="wrapper wrapper-content animated fadeInRight">
    <div class="ibox float-e-margins">
        <div class="ibox-title">
            <h5>新增项目</h5>

            <div class="ibox-tools">
                <a class="collapse-link">
                    <i class="fa fa-chevron-up"></i>
                </a>
                <a class="dropdown-toggle" data-toggle="dropdown" href="form_basic.html#">
                    <i class="fa fa-wrench"></i>
                </a>
                <ul class="dropdown-menu dropdown-user">
                    <li><a href="form_basic.html#">选项1</a>
                    </li>
                    <li><a href="form_basic.html#">选项2</a>
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
                    <label class="col-sm-2 control-label">用户名：</label>

                    <div class="col-sm-4">
                        <input type="email" placeholder="用户名"
                               class="form-control"> <%--<span class="help-block m-b-none">请输入您注册时所填的E-mail</span>--%>
                    </div>
                    <label class="col-sm-2 control-label">用户名：</label>

                    <div class="col-sm-4">
                        <input type="email" placeholder="用户名"
                               class="form-control"> <%--<span class="help-block m-b-none">请输入您注册时所填的E-mail</span>--%>
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-sm-2 control-label">字段名：</label>

                    <div class="col-sm-4">
                        <input type="text" placeholder="密码" class="form-control">
                    </div>
                    <label class="col-sm-2 control-label">字段名：</label>

                    <div class="col-sm-4">
                        <input type="text" placeholder="密码" class="form-control">
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-sm-2 control-label">字段名：</label>

                    <div class="col-sm-4">
                        <input type="text" placeholder="密码" class="form-control">
                    </div>
                    <label class="col-sm-2 control-label">字段名：</label>

                    <div class="col-sm-4">
                        <input type="text" placeholder="密码" class="form-control">
                    </div>
                </div>

                <div class="form-group">
                    <label class="col-sm-2 control-label">字段名：</label>

                    <div class="col-sm-4">
                        <input type="text" placeholder="密码" class="form-control">
                    </div>
                    <label class="col-sm-2 control-label">字段名：</label>

                    <div class="col-sm-4">
                        <input type="text" placeholder="密码" class="form-control">
                    </div>
                </div>

                <div class="form-group">
                    <label class="col-sm-2 control-label">字段名：</label>

                    <div class="col-sm-4">
                        <input type="text" placeholder="密码" class="form-control">
                    </div>
                    <label class="col-sm-2 control-label">字段名：</label>

                    <div class="col-sm-4">
                        <input type="text" placeholder="密码" class="form-control">
                    </div>
                </div>

                <div class="form-group">
                    <label class="col-sm-2 control-label">字段名：</label>

                    <div class="col-sm-4">
                        <input type="text" placeholder="密码" class="form-control">
                    </div>
                    <label class="col-sm-2 control-label">字段名：</label>

                    <div class="col-sm-4">
                        <input type="text" placeholder="密码" class="form-control">
                    </div>
                </div>

                <div class="form-group">
                    <label class="col-sm-2 control-label">字段名：</label>

                    <div class="col-sm-4">
                        <input type="text" placeholder="密码" class="form-control">
                    </div>
                    <label class="col-sm-2 control-label">字段名：</label>

                    <div class="col-sm-4">
                        <input type="text" placeholder="密码" class="form-control">
                    </div>
                </div>

                <div class="form-group">
                    <div class="col-sm-offset-3 col-sm-8">
                        <button class="btn btn-w-m btn-primary" type="submit">保存</button>
                        <button type="button" class="btn btn-w-m btn-default">取消</button>
                    </div>
                </div>

            </form>


        </div>
    </div>
</div>
</body>
</html>