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
    <title>新增公司</title>

    <link href='<c:url value="/resources/css/bootstrap.min.css?v=3.4.0"></c:url>' rel="stylesheet">
    <link href='<c:url value="/resources/css/font-awesome.min.css?v=4.4.0"></c:url>' rel="stylesheet">
    <link href='<c:url value="/resources/css/animate.min.css"></c:url>' rel="stylesheet">
    <link href='<c:url value="/resources/css/style.min.css?v=3.2.0"></c:url>' rel="stylesheet">
    <style>
        .form-section {
            margin: 15px 0px 20px 0px !important;
            padding-bottom: 5px;
            border-bottom: 1px solid #eee;
        }
    </style>
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
                <fieldset>
                    <h3 class="form-section">基本信息</h3>

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

                    <h3 class="form-section">企业法人营业执照</h3>

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

                    <h3 class="form-section">组织机构代码</h3>

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

                    <h3 class="form-section">税务登记证明</h3>

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
                        <div class="col-sm-offset-3 col-sm-8">
                            <button class="btn btn-w-m btn-primary" type="submit">保存</button>
                            <button type="button" class="btn btn-w-m btn-default">取消</button>
                        </div>
                    </div>
                </fieldset>

            </form>


        </div>
    </div>

    <div class="ibox float-e-margins">
        <div class="ibox-title">
            <h5>资质证书
                <small>列表</small>
            </h5>
            <div class="ibox-tools">
                <a class="collapse-link">
                    <i class="fa fa-chevron-up"></i>
                </a>
                <a class="dropdown-toggle" data-toggle="dropdown" href="#">
                    <i class="fa fa-wrench"></i>
                </a>
                <ul class="dropdown-menu dropdown-user">
                    <li><a id="btn-add-project" href="#">新增项目</a>
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
            <div id="DataTables_Table_0_wrapper" class="dataTables_wrapper form-inline" role="grid">

                <table class="table table-striped table-bordered table-hover dataTables-example dataTable"
                       id="DataTables_Table_0" aria-describedby="DataTables_Table_0_info">
                    <thead>
                    <tr role="row">
                        <th class="sorting_desc" tabindex="0" aria-controls="DataTables_Table_0" rowspan="1"
                            colspan="1" aria-label="渲染引擎：激活排序列升序" style="width: 176px;" aria-sort="descending">
                            渲染引擎
                        </th>
                        <th class="sorting" tabindex="0" aria-controls="DataTables_Table_0" rowspan="1"
                            colspan="1" aria-label="浏览器：激活排序列升序" style="width: 310px;">浏览器
                        </th>
                        <th class="sorting" tabindex="0" aria-controls="DataTables_Table_0" rowspan="1"
                            colspan="1" aria-label="平台：激活排序列升序" style="width: 288px;">平台
                        </th>
                        <th class="sorting" tabindex="0" aria-controls="DataTables_Table_0" rowspan="1"
                            colspan="1" aria-label="引擎版本：激活排序列升序" style="width: 122px;">引擎版本
                        </th>
                        <th class="sorting" tabindex="0" aria-controls="DataTables_Table_0" rowspan="1"
                            colspan="1" aria-label="CSS等级：激活排序列升序" style="width: 122px;">CSS等级
                        </th>
                    </tr>
                    </thead>
                    <tbody>
                    <tr class="gradeA odd">
                        <td class="sorting_1">Webkit</td>
                        <td class="">Safari 3.0</td>
                        <td class=" ">OSX.4+</td>
                        <td class="center ">522.1</td>
                        <td class="center ">A</td>
                    </tr>
                    </tbody>
                    <tfoot>
                    <tr>
                        <th rowspan="1" colspan="1">渲染引擎</th>
                        <th rowspan="1" colspan="1">浏览器</th>
                        <th rowspan="1" colspan="1">平台</th>
                        <th rowspan="1" colspan="1">引擎版本</th>
                        <th rowspan="1" colspan="1">CSS等级</th>
                    </tr>
                    </tfoot>
                </table>

            </div>
        </div>
    </div>

</div>

<script type="text/javascript" src="<c:url value="/resources/js/jquery.min.js" />"></script>
<script type="text/javascript" src="<c:url value="/resources/js/bootstrap.min.js" />"></script>
<script type="text/javascript" src="<c:url value="/resources/js/jquery.dataTables.js" />"></script>
<script type="text/javascript" src="<c:url value="/resources/js/dataTables.bootstrap.min.js" />"></script>
<script type="text/javascript" src="<c:url value="/resources/js/content.min.js" />"></script>
</body>
</html>