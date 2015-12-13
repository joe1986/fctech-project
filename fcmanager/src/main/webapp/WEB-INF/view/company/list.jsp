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
    <title>500错误</title>

    <link href='<c:url value="/resources/css/bootstrap.min.css?v=3.4.0"></c:url>' rel="stylesheet">
    <link href='<c:url value="/resources/css/font-awesome.min.css?v=4.4.0"></c:url>' rel="stylesheet">
    <link href='<c:url value="/resources/css/animate.min.css"></c:url>' rel="stylesheet">
    <link href='<c:url value="/resources/css/style.min.css?v=3.2.0"></c:url>' rel="stylesheet">
</head>

<body class="gray-bg">
<div class="wrapper wrapper-content animated fadeInRight">
    <div class="row">
        <div class="col-sm-12">
            <div class="ibox float-e-margins">
                <div class="ibox-title">
                    <h5>可编辑表格</h5>

                    <div class="ibox-tools">
                        <a class="collapse-link">
                            <i class="fa fa-chevron-up"></i>
                        </a>
                        <a class="dropdown-toggle" data-toggle="dropdown" href="table_data_tables.html#">
                            <i class="fa fa-wrench"></i>
                        </a>
                        <ul class="dropdown-menu dropdown-user">
                            <li><a href="table_data_tables.html#">选项1</a>
                            </li>
                            <li><a href="table_data_tables.html#">选项2</a>
                            </li>
                        </ul>
                        <a class="close-link">
                            <i class="fa fa-times"></i>
                        </a>
                    </div>
                </div>
                <div class="ibox-content">
                    <div class="">
                        <a onclick="fnClickAddRow();" href="javascript:void(0);" class="btn btn-primary ">添加行</a>
                    </div>
                    <div id="editable_wrapper" class="dataTables_wrapper form-inline" role="grid">
                        <div class="row">
                            <div class="col-sm-6">
                                <div class="dataTables_length" id="editable_length"><label>每页 <select
                                        name="editable_length" aria-controls="editable" class="form-control input-sm">
                                    <option value="10">10</option>
                                    <option value="25">25</option>
                                    <option value="50">50</option>
                                    <option value="100">100</option>
                                </select> 条记录</label></div>
                            </div>
                            <div class="col-sm-6">
                                <div id="editable_filter" class="dataTables_filter"><label>查找：<input type="search"
                                                                                                     class="form-control input-sm"
                                                                                                     aria-controls="editable"></label>
                                </div>
                            </div>
                        </div>
                        <table class="table table-striped table-bordered table-hover  dataTable" id="editable"
                               aria-describedby="editable_info">
                            <thead>
                            <tr role="row">
                                <th class="sorting_asc" tabindex="0" aria-controls="editable" rowspan="1" colspan="1"
                                    aria-sort="ascending" aria-label="渲染引擎：激活排序列升序" style="width: 176px;">渲染引擎
                                </th>
                                <th class="sorting" tabindex="0" aria-controls="editable" rowspan="1" colspan="1"
                                    aria-label="浏览器：激活排序列升序" style="width: 310px;">浏览器
                                </th>
                                <th class="sorting" tabindex="0" aria-controls="editable" rowspan="1" colspan="1"
                                    aria-label="平台：激活排序列升序" style="width: 288px;">平台
                                </th>
                                <th class="sorting" tabindex="0" aria-controls="editable" rowspan="1" colspan="1"
                                    aria-label="引擎版本：激活排序列升序" style="width: 122px;">引擎版本
                                </th>
                                <th class="sorting" tabindex="0" aria-controls="editable" rowspan="1" colspan="1"
                                    aria-label="CSS等级：激活排序列升序" style="width: 122px;">CSS等级
                                </th>
                            </tr>
                            </thead>
                            <tbody>
                            <tr class="gradeA odd">
                                <td class="sorting_1">Gecko</td>
                                <td class=" ">Firefox 1.0</td>
                                <td class=" ">Win 98+ / OSX.2+</td>
                                <td class="center ">1.7</td>
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
    </div>
</div>
</body>
</html>