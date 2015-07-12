var Config = function () {

    function initTreeview() {
        if ($("#treeview").length > 0) {
            $('#treeview').treeview({data: getTree()});
        }
    }

    function getTree() {
        var tree = [
            {
                text: "上海地铁15号线",
                nodes: [
                    {
                        text: "第一站",
                        nodes: [
                            {
                                text: "底图一.jpg"
                            },
                            {
                                text: "底图二.png"
                            }
                        ]
                    },
                    {
                        text: "第二站"
                    }
                ]
            },
            {
                text: "上海地铁17号线"
            }
        ];
        return tree;
    }


    function forwardToEditPage(page) {
        window.location.href = page;
    }

    function dataTablesSettings() {
        /* ---------- Datable ---------- */
        $("table[id^='config-datatable']").dataTable({
            "sDom": "<'row-fluid'<'span6'l><'span6'f>r>t<'row-fluid'<'span12'i><'span12 center'p>>",
            "sPaginationType": "bootstrap",
            "bLengthChange": false, //改变每页显示数据数量
            "bFilter": false, //过滤功能
            "oLanguage": {
                //"sLengthMenu": "_MENU_ records per page",
                //"sSearch": "搜索",
                //"sLengthMenu": "每页显示 _MENU_ 条记录",
                "sZeroRecords": "抱歉， 没有找到",
                "sInfo": "从 _START_ 到 _END_ /共 _TOTAL_ 条数据",
                "sInfoEmpty": "没有数据",
                "sInfoFiltered": "(从 _MAX_ 条数据中检索)",
                "oPaginate": {
                    "sFirst": "首页",
                    "sPrevious": "前一页",
                    "sNext": "后一页",
                    "sLast": "尾页"
                },
                "sZeroRecords": "没有检索到数据",
                "sProcessing": "<img src='./loading.gif' />"
            },
            "fnServerData": function (sSource, aoData, fnCallback) {
                $.ajax({
                    "type": 'post',
                    "url": sSource,
                    "dataType": "json",
                    "data": {
                        aoData: JSON.stringify(aoData)
                    },
                    "success": function (resp) {
                        fnCallback(resp);
                    }
                });
            },
        });
    }

    function uploader() {
        if ($("#dropz").length > 0) {
            $("#dropz").dropzone({
                url: "handle-upload.php",
                maxFiles: 10,
                maxFilesize: 512,
                addRemoveLinks: true,
                dictRemoveFile: "移除文件",
                removedfile: function () {
                    //移除监听事件，可再次调用从服务器端删除文件
                },
                uploadMultiple: true,
                dictDefaultMessage: "点击或者拖拽文件至该区域上传",
                //acceptedFiles: ".js,.obj,.dae"
                init: function () {
                    this.on("success", function (file) {
                        console.log("File " + file.name + "uploaded");
                    });
                    this.on("removedfile", function (file) {
                        console.log("File " + file.name + "removed");
                    });
                }
            });
        }
    }

    var multiSelect = function () {
        if ($('#pre-selected-options').length > 0) {
            $('#pre-selected-options').multiSelect({});
        }
    }

    return {
        init: function () {
            //文件上传
            uploader();
            //表格设置
            //dataTablesSettings();
            //多选框
            multiSelect();
            //树形菜单
            initTreeview();

        }
    }
}();


var ContextMenu = function () {
    var thiz = this;
    var evt,
        offset_top = 0,
        offset_left = 0,
        curr_svg_cx = 0,
        curr_svg_cy = 0,
        currentObj,
        draw,sensordraw,group,
        image,sensorImg,
        default_color="#4d90fe"; //#12943e

    this.createSVGRootElement = function(){
        if($("#layout_drawing").length > 0) {
            draw = SVG('layout_drawing').attr({
                id          : 'station_layout_drawing',
                'font-size' : 10,
                // style       : "background-image:url('../../img/grid-gray.png');",
                onmousedown : ' btnSVGMousedown(evt,this)'
            }).fill("gray");
            image = draw.image('../../img/project_cad.jpg').attr({id:'project-img'}).loaded(function(loader) {
                var divWidth =  $("body").width();
                image.size(loader.width, loader.height);
                if(divWidth > loader.width) {
                    draw.size( divWidth ,loader.height);
                }else{
                    draw.size( loader.width ,loader.height );
                }
                draw.viewbox(0, 0, loader.width, loader.height);
                //$("#drawing").attr("style","width:"+loader.width+";height:"+loader.height+";");
            });
            //image.load('../../img/cad.jpg');
           // thiz.test();
        }

        if(("#sensor_layout_drawing").length>0){
            sensordraw = SVG('sensor_layout_drawing').attr({
                id          :  'sensor_svg',
                'font-size' :  10
               // style:"background:url('../../img/cad.jpg');background-repeat: no-repeat;",
               // onmousedown :  'btnSVGMousedown(evt,this)'
            });

            var sensor_group = sensordraw.group();
            sensorImg = sensor_group.image('../../img/cad.jpg').attr({id:'sensor_img'}).loaded(function(loader) {
                sensorImg.size(loader.width, loader.height);
                sensordraw.size( loader.width ,loader.height );
                $("div #sensor_layout_drawing").css('height',loader.height  + 1)
                //draw.viewbox(0, 0, loader.width, loader.height);
            });

            sensor_group.circle(30,30).center(90,115).fill("green");
            sensor_group.text("a").size(20).dx(85).dy(95).fill("white");

            sensor_group.circle(30,30).center(238,115).fill("green");
            sensor_group.text("b").size(20).dx(233).dy(95).fill("white");


            sensor_group.circle(30,30).center(140,165).fill("green");
            sensor_group.text("c").size(20).dx(135).dy(145).fill("white");

            sensor_group.circle(30,30).center(180,165).fill("green");
            sensor_group.text("d").size(20).dx(175).dy(145).fill("white");

            sensor_group.circle(30,30).center(90,207).fill("green");
            sensor_group.text("e").size(20).dx(85).dy(187).fill("white");

            sensor_group.circle(30,30).center(238,207).fill("green");
            sensor_group.text("f").size(20).dx(233).dy(187).fill("white");
        }

    }

    this.btnSVGChildMousedown = function(evt, obj) {
        currentObj =  $(evt.target);
        thiz._getPosition(evt,'svg-child-node');
        var type = currentObj.attr('type');
        if (3 == evt.which) {
            evt.preventDefault();
            evt.stopPropagation();
            console.log("svg子元素右击事件");
            if(type=="station"){
                $("#station_dropdown_menu").html("<li><a class='new_data' tabindex='-1'>应变监测</a></li>"
                    + "<li><a class='new_data_settling' tabindex='-1'>沉降监测</a></li>"
                    + "<li><a class='new_data_concentrate' tabindex='-1'>集中力监测</a></li>"
                    + "<li><a class='new_data_incli' tabindex='-1'>测斜监测</a></li>"
                    + "<li><a class='remove_component' tabindex='-1'>删除组建</a></li>"
                    // +"<li><a id='sensor-text' tabindex='-1'>新增监测点说明</a></li>"
                );
            }
        } else if (1 == evt.which) {
            console.log("svg子元素鼠标单击事件");
            evt.preventDefault();
            evt.stopPropagation();
            switch(type){
                case 'sensor' :

                        break;
                case 'data'    :
                       // $('#long_datawin').modal('toggle');
                        break;

                default : break;
            }

        }
    }

    this.btnSVGMousedown = function(evt) {
        thiz._getPosition(evt,'svg-node');
        if (3 == evt.which) {
            console.log("SVG父元素鼠标右击事件");
            var id = $(evt.target).attr('id');
            $("#station_dropdown_menu").html("<li><a class='new_station' tabindex='-1'>新增监测点</a></li>"
                + "<li><a class='clear_component' tabindex='-1'>清除监测点</a></li>"
                + "<li><a class='prview_img' tabindex='-1'>预览效果图</a></li>");


        } else if (1 == evt.which) {
            console.log("svg父元素鼠标单击事件");
        }
    }

    this.onSVGMouseOver = function(evt){
        console.log("-------------onSVGMouseOver event---------------");
        var type = $(evt.target).attr('type');
        switch(type){
            case 'data' :
                $(evt.target).qtip({
                    id: 'sampletooltip',
                    content: {
                        text: 'Hi. I am a sample tooltip!',
                        title: 'Sample tooltip'
                    }
                });
                break;
            case  'station' :
                //$('#long_stationinfo').modal('toggle');
                break;
            default : break;
        }

    }

    this.onSVGDBClick= function(evt){
        var type = $(evt.target).attr('type');
        evt.preventDefault();
        evt.stopPropagation();
        switch(type){
            case 'station' :
                var r = currentObj.attr("r");
                curr_svg_cx = currentObj.attr("cx");
                curr_svg_cy = currentObj.attr("cy");
                var prop = {color : currentObj.attr("fill"),width : r*2,height : r*2 };
                thiz._setCompProperties( prop );
                $('#long_stationinfo').modal('toggle');break;
            case 'data_axial'    :
                $('#long_datawin').modal('toggle').css({
                    width: '90%',
                    'margin-left': function () {
                        return -( $(this).width() / 2);
                    }
                });
                break;
            case 'data_bending'    :
                $('#long_datawin').modal('toggle').css({
                    width: '90%',
                    'margin-left': function () {
                        return -( $(this).width() / 2);
                    }
                });
                break;
            case 'data_setting'    :
                $('#long_stationinfo').modal('toggle');break;
                break;
            case 'data_concentrate'    :
                $('#long_stationinfo').modal('toggle');break;
                break;
            case 'data_incli'    :
                $('#long_stationinfo').modal('toggle');break;
                break;
            case 'station' :
                $('#long_stationinfo').modal('toggle');break;
            default : break;
        }
    }

    this._getPosition = function(evt,nodetype) {
        var id = $(evt.target).attr('id');
        if(id=='sensor_layout_drawing'){
            var mouseX = evt.clientX, mouseY = evt.clientY;
            offset_top = mouseY + $(window).scrollTop()-80;
            offset_left  = mouseX + $(window).scrollLeft();
        }else{
            var mTop=0,mLeft=0;
            if(nodetype=='svg-node'){
                var offset = $(evt.target).offset();
                mTop = offset.top;
                mLeft = offset.left;
            }
            console.log("scrollLeft : "+$(window).scrollLeft()+" ; clientX: "+evt.clientX+ " ; Left : " + mLeft +"; pageX : "+ evt.pageX+"; ");
            console.log("scrollTop : "+$(window).scrollTop()+" ; clientY: "+evt.clientY+ " ; top : " + mTop +"; pagey : "+ evt.pageY+"; ");
            var mouseX = evt.clientX, mouseY = evt.clientY;
            offset_top = mouseY + $(window).scrollTop() - mTop;
            offset_left = mouseX + $(window).scrollLeft() - mLeft;
        }
        console.log("offset_left: "+ offset_left + " ; offset_top: " + offset_top);
    }

    this.compEventListener = function(){
        /* 颜色选择器及监听事件 组件颜色变换*/
        if ($('.colorpicker-default').length > 0) {
            $('.colorpicker-default').colorpicker({
                format: 'hex'
            }).on('changeColor',function(ev){
                console.log(currentObj + "--------"+ ev.color.toHex());
                if( currentObj ){
                    currentObj.attr("fill",ev.color.toHex())
                }
            });
        }
        /* 宽 高 监听事件 */
        $("#comp_size_height").change(function(){
            var height = $(this).val();
            var width = $("#comp_size_width").val();
            currentObj.attr("r",height/2)
            //currentObj.attr("cx",width)
            //currentObj.attr("cy",height)
        });
        $("#comp_size_width").change(function(){
            var width = $(this).val();
            var height = $("#comp_size_height").val();
            currentObj.attr("r",height/2)
            //currentObj.attr("cx",width)
            //currentObj.attr("cy",height)
            // currentObj.size(width,height);
        });
        thiz._svgZoom();
    }

    this._setCompProperties = function( prop ){
        $("#comp_color").val(prop.color );
        $("#comp_size_width").val( prop.width );
        $("#comp_size_height").val( prop.height );
    }

    this._svgZoom = function(){
        //var example1, example2; //globals so we can manipulate them in the debugger
        var svgzoom = $("#station_layout_drawing").svgPanZoom({
            Options:
            {
                events: {
                    mouseWheel: true, // enables mouse wheel zooming events
                    doubleClick: true, // enables double-click to zoom-in events
                    drag: true, // enables drag and drop to move the SVG events
                    dragCursor:  "move" // cursor to use while dragging the SVG
                },
                animationTime: 300,// time in milliseconds to use as default for animations. Set 0 to remove the animation
                zoomFactor: 0.25,// how much to zoom-in or zoom-out
                maxZoom: 1.5,//maximum zoom in, must be a number bigger than 1
                panFactor: 100// how much to move the viewBox when calling .panDirection() methods

            }
        });
        var callback= function(svgzoom) {
            return function(event) {
                if ($(event.target).hasClass("icon-arrow-up") || $(event.target).hasClass("btn_arrow_up"))
                    svgzoom.panDown()
                if ($(event.target).hasClass("icon-arrow-down") || $(event.target).hasClass("btn_arrow_down"))
                    svgzoom.panUp()
                if ($(event.target).hasClass("icon-arrow-left") || $(event.target).hasClass("btn_arrow_left"))
                    svgzoom.panRight()
                if ($(event.target).hasClass("icon-arrow-right") || $(event.target).hasClass("btn_arrow_right") )
                    svgzoom.panLeft()
                if ($(event.target).hasClass("icon-plus") || $(event.target).hasClass("btn_plus"))
                    svgzoom.zoomIn()
                if ($(event.target).hasClass("icon-minus") || $(event.target).hasClass("btn_minus"))
                    svgzoom.zoomOut()
                if ($(event.target).hasClass("icon-refresh") || $(event.target).hasClass("btn_refresh"))
                    svgzoom.reset()
            }
        };
        //example1= examples[0]
        //example2= examples[1]
        $("div#svgzoom button").click(callback(svgzoom));
        //$("div#example2 i").click(callback(example2));
    }

    this.html_encode = function(str)
    {
        var s = "";
        if (str.length == 0) return "";
        s = str.replace(/&/g, ">");
        s = s.replace(/</g, "<");
        s = s.replace(/>/g, ">");
        s = s.replace(/ /g, " ");
        s = s.replace(/\'/g, "'");
        s = s.replace(/\"/g, "'");
        //s = s.replace(/\n/g, "<br>");
        return s;
    }

    this._canvgCallback = function( ){
        var canvas = document.getElementById("canvas");
        var image = canvas.toDataURL("image/png");//.replace("image/png", "image/octet-stream"); //Convert image to 'octet-stream' (Just a download, really)
        $("#preview_img").attr('src',image);
        $('#long_preview').modal('toggle').css({
            width: '90%',
            height: '570px',
            'margin-left': function () {
                return -( $(this).width() / 2);
            }
        });
    }

    this._getNumInArray = function(arr){
        var len = arr.length,value=0;
        for(var i=0;i<len;i++ ){
            var num = i+1,value = arr[i];
            if(value!=num){
                console.log("###########" +num );
                arr[i] = num;
                return num;
            }
            value = arr[i];
        }
        return value;
    }


    this._drawRectInGroup = function( param ){
        var mGroup = draw.rect(param.width, param.height)
                        .center(param.offset_left, param.offset_top + 40)
                        .fill( param.color)
                        .attr({
                        id: param.id,
                        cursor:'move',
                        type: param.datatype,
                        style:'stroke:black;stroke-width:4;opacity:0.5',
                        onmouseover:'onSVGMouseOver(evt,this)',
                        onmousedown: 'btnSVGChildMousedown(evt,this)',
                        ondblclick:'onSVGDBClick(evt,this)'
                    }).draggable();
        //var text = draw.text(param.text).size(10).dx(param.offset_left-20).dy(param.offset_top+40).fill("red").attr( {type : param.datatype}).draggable();
        //text.tspan(param.text).attr({type : param.datatype} );
    }



    this.loadContextmenu = function(){
        var mWidth=20,mHeight=30,mColor=default_color,num= 0,arr = new Array();
        if ($('#station_layout_drawing').length > 0) {
            $('#station_layout_drawing').contextmenu({
                target: '#context-menu',
                onItem: function (context, evt) {
                    //$("#sensor_dropdown_menu").empty();
                    console.log("execute the onItem , menu name : "+ $(evt.target).text());
                    var id = $(evt.target).attr("class");
                    switch (id) {
                        case "new_station":
                            //num++;
                            //arr.push(num);
                            console.log("***offset_left: "+ offset_left + " ; offset_top: " + offset_top);
                            svgChildNode = draw.circle(mWidth).center(offset_left, offset_top ).draggable().fill(mColor ).attr({
                                id     : 'newstation',
                                type   : 'station',
                                num    : num,
                                cursor : 'move',
                                transform : "matrix(1.7656463,0,0,1.7656463,10,25.00942)",
                                onmouseover : 'onSVGMouseOver(evt,this)',
                                onmousedown : 'btnSVGChildMousedown(evt,this)',
                                ondblclick:'onSVGDBClick(evt,this)',
                                style:'stroke:black;stroke-width:5;opacity:0.5'

                            }).draggable();
                            //num  = thiz._getNumInArray( arr );
                            //group.plain(num +'号监测点').center(svgChildNode.cx(), svgChildNode.cy()+20).draggable().attr({
                            //    id: 'station-text',
                            //    type:'station_desc',
                            //    onmousedown: 'btnSVGChildMousedown(evt,this)'
                            //});
                            //var prop = {color : mColor,width : mWidth,height : mHeight };
                            //thiz._setCompProperties( prop );
                            break;
                        case "remove_component":
                            currentObj.remove();
                            currentObj.clear();
                            if(currentObj.attr('type')=="station"){
                                num--;
                                arr.splice( $.inArray( parseInt( currentObj.attr('num') ) , arr ) , 1);
                            }
                            break;
                        case "new_data":
                            var param = {
                                width: mWidth * 2,
                                height: mHeight / 2,
                                offset_left: offset_left,
                                offset_top: offset_top + 40,
                                color: '#cccccc',
                                id: 'newdataaxial',
                                datatype: 'data_axial',
                                text: '轴向力'
                            };
                            thiz._drawRectInGroup(param);
                            param = {
                                width: mWidth * 2,
                                height: mHeight / 2,
                                offset_left: offset_left,
                                offset_top: offset_top + 60,
                                color: '#cccccc',
                                id: 'newdataaxial',
                                datatype: 'data_bending',
                                text: '弯曲力'
                            };
                            thiz._drawRectInGroup(param);
                            break;
                        case "new_data_settling":
                            var param = {
                                width: mWidth * 2,
                                height: mHeight / 2,
                                offset_left: offset_left,
                                offset_top: offset_top + 40,
                                color: 'purple',
                                id: 'newdatasettling',
                                datatype: 'data_setting',
                                text: '沉降'
                            };
                            thiz._drawRectInGroup(param);
                            break;
                        case "new_data_concentrate":
                            var param = {
                                width: mWidth * 2,
                                height: mHeight / 2,
                                offset_left: offset_left,
                                offset_top: offset_top + 40,
                                color: 'green',
                                id: 'newdatacct',
                                datatype: 'data_concentrate',
                                text: '集中力'
                            };
                            thiz._drawRectInGroup(param);
                            break;
                        case "new_data_incli":
                            var param = {
                                width: mWidth * 2,
                                height: mHeight / 2,
                                offset_left: offset_left,
                                offset_top: offset_top + 40,
                                color: 'yellow',
                                id: 'newdataincli',
                                datatype: 'data_incli',
                                text: '测斜'
                            };
                            thiz._drawRectInGroup(param);
                            break;
                        case "clear_component":
                            //清除不包含Image的所有子元素
                            draw.each(function(i, children) {
                                if(children[i]!="project-img"){
                                    children[i].remove();
                                }
                            }, true)
                            //draw.clear();
                            arr = [];
                            break;
                        case "prview_img":
                            var cloneObj = $("#layout_drawing").clone();
                            cloneObj.find('#svgzoom').remove();
                            var svghtml = thiz.html_encode( $.trim( cloneObj.html() )) ;
                            console.log( "the svg html text after encode : "+ svghtml );
                            var canvas = document.getElementById("canvas");
                            canvg(canvas, svghtml ,thiz._canvgCallback( ));
                            // $("#svg_img").attr('src',image);
                            break;
                        default:
                            break;
                    }
                }
            });

            $('#context-menu').on('show.bs.context', function (e) {
                console.log('显示菜单前响应事件');
                return false;
            });
            $('#context-menu').on('shown.bs.context', function (e) {
                console.log('显示菜单后响应时间');
            });
            $('#context-menu').on('hide.bs.context', function (e) {
                console.log('隐藏菜单前响应事件');
            });
            $('#context-menu').on('hidden.bs.context', function (e) {
                console.log('隐藏菜单后响应时间');
            });

        }
    }

    return {
        init: function () {
            thiz.createSVGRootElement();
            //thiz.colorPicker();
            thiz.compEventListener();
            thiz.loadContextmenu();
        }
    }
}();

$(document).ready(function () {

    $(".btn-add-station").click(function () {
        window.location.href = "station_add.html";
    });

    $(".btn-add-dtu").click(function () {
        window.location.href = "dtu_add.html";
    });

    $(".btn-add-img").click(function () {
        window.location.href = "import_img.html";
    });

    $(".btn-add-straintype").click(function () {
        window.location.href = "strain_type_add.html";
    });

    $(".btn-add-strain_limit").click(function () {
        window.location.href = "strain_limit_add.html";
    });

    $(".btn-add-incli-elevation").click(function () {
        window.location.href = "incli_elevation_add.html";
    });

    $(".btn-add-inclilimit").click(function () {
        window.location.href = "incli_limit_add.html";
    });

    $(".btn-add-param").click(function () {
        window.location.href = "param_add.html";
    });


    $(".btn-add-formula").click(function () {
        window.location.href = "formula_add.html";
    });

    Config.init();
    ContextMenu.init();
});

function btnSVGChildMousedown(evt,obj){
    ContextMenu.btnSVGChildMousedown(evt,obj);
}

function btnSVGMousedown(evt,obj){
    ContextMenu.btnSVGMousedown(evt);
}

function onSVGMouseOver(evt,obj){
    ContextMenu.onSVGMouseOver(evt);
}

function onSVGDBClick(evt,obj){
    ContextMenu.onSVGDBClick(evt);
}

function qtiptest(){
    $("#qtipTest").qtip({content:{
        text: 'Hi. I am a sample tooltip!',
        title: 'Sample tooltip'
    }});
}
