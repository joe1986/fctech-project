<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<div id="long_datawin" class="modal inmodal fade" tabindex="-1" role="dialog" aria-hidden="true">

    <div class="modal-dialog" >
        <div class="modal-content fadein" style="width: 1000px;">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal"><span aria-hidden="true">×</span><span class="sr-only">关闭</span>
                </button>
                <h4 class="modal-title">应变公式设置</h4>
            </div>
            <small class="font-bold">
                <div class="modal-body" >
                    <div class="box-content">
                        <div class="row">
                            <div class="col-sm-6">
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
                            <div class="col-sm-6">

                                <div class="tabs-container">
                                    <ul class="nav nav-tabs">
                                        <li class="active"><a data-toggle="tab" href="#tab-1" aria-expanded="true"> 轴向力</a>
                                        </li>
                                        <li class=""><a data-toggle="tab" href="#tab-2" aria-expanded="false">弯曲力</a>
                                        </li>
                                    </ul>
                                    <div class="tab-content">
                                        <div id="tab-1" class="tab-pane active">
                                            <div class="panel-body">
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
                                        </div>
                                        <div id="tab-2" class="tab-pane">
                                            <div class="panel-body">
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
                                        </div>
                                    </div>


                                </div>
                            </div>
                        </div>

                        <div class="row">
                            <table class="table table-striped table-bordered table-hover dataTables-example dataTable" id="config-datatable">
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
                    <button type="button" class="btn btn-white" data-dismiss="modal">关闭</button>
                    <button type="button" class="btn btn-primary">保存</button>
                </div>
                </small>
            </div>
        <small class="font-bold">
        </small>
    </div>

    <div id="sensor_context_menu" style="position: absolute; z-index: 10000; top: 420px; left: 317px;" class="">
        <ul id="sensor_dropdown_menu" class="bootstrap-dropdown-menu" role="menu">

        </ul>
    </div>
</div>


