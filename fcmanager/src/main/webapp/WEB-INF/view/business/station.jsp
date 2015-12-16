<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<div id="long_stationinfo" class="modal inmodal fade" tabindex="-1" role="dialog" aria-hidden="true" >
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