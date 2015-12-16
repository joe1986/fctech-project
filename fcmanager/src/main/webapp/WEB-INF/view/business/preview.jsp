<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

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