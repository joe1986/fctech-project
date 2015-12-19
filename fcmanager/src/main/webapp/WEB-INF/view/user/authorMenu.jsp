<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <meta http-equiv="imagetoolbar" content="no">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="shortcut icon" type="image/x-icon"
          href="<c:url value="/resources/images/favicon.ico"></c:url>">
    <title>角色菜单配置</title>

    <link href='<c:url value="/resources/css/bootstrap.min.css?v=3.5.0"></c:url>' rel="stylesheet">
    <link href='<c:url value="/resources/css/font-awesome.min.css?v=4.4.0"></c:url>' rel="stylesheet">
    <link href='<c:url value="/resources/css/dataTables.bootstrap.css"></c:url>' rel="stylesheet">
    <link href='<c:url value="/resources/css/animate.min.css"></c:url>' rel="stylesheet">
    <link href='<c:url value="/resources/css/style.min.css"></c:url>' rel="stylesheet">

</head>

<body class="gray-bg">
<div class="wrapper wrapper-content animated fadeInRight">
    <div class="row">
        <div class="col-sm-12">
            <div class="ibox float-e-margins">
                <div class="ibox-title">
                    <h5>角色菜单
                        <small>配置列表</small>
                    </h5>
                    <div class="ibox-tools">
                        <a class="collapse-link">
                            <i class="fa fa-chevron-up"></i>
                        </a>
                        <a class="dropdown-toggle" data-toggle="dropdown" href="#">
                            <i class="fa fa-wrench"></i>
                        </a>
                        <ul class="dropdown-menu dropdown-user">
                            <li><a href="#">选项1</a>
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
                            <tr class="gradeA even">
                                <td class="sorting_1">Webkit</td>
                                <td class="">Safari 2.0</td>
                                <td class=" ">OSX.4+</td>
                                <td class="center ">419.3</td>
                                <td class="center ">A</td>
                            </tr>
                            <tr class="gradeA odd">
                                <td class="sorting_1">Webkit</td>
                                <td class="">Safari 1.3</td>
                                <td class=" ">OSX.3</td>
                                <td class="center ">312.8</td>
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
<script type="text/javascript" src="<c:url value="/resources/js/jquery.min.js" />"></script>
<script type="text/javascript" src="<c:url value="/resources/js/bootstrap.min.js" />"></script>
<script type="text/javascript" src="<c:url value="/resources/js/jquery.dataTables.js" />"></script>
<script type="text/javascript" src="<c:url value="/resources/js/dataTables.bootstrap.min.js" />"></script>
<script type="text/javascript" src="<c:url value="/resources/js/content.min.js" />"></script>
<script>
    $(document).ready(function () {
        $(".dataTables-example").dataTable();
    });

</script>
</body>
</html>