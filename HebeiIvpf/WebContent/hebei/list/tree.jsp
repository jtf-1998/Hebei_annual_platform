<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<meta http-equiv="content-type" content="text/html; charset=UTF-8">
<title>ztree模糊查询演示</title>
<head>
    <link rel="stylesheet" type="text/css" href="./zTreeStyle.css">
    <script type="text/javascript" src="./jquery-1.4.4.min.js"></script>
    <script type="text/javascript" src="./jquery.ztree.core.min.js"></script>
    <script type="text/javascript" src="./jquery.ztree.excheck.min.js"></script>
    <style type="text/css">
        body {
            font-family: "微软雅黑", "宋体";
            font-size: 12px;
            line-height: 26px;
            color: #666;
            background-color: #fff;
            width: 600px;
            height: 600px;
        }
 
        div.content_wrap {
            width: 800px;
            height: 380px;
        }
 
        div.content_wrap div.left {
            float: left;
            width: 250px;
            height: 300px;
        }
 
        div.content_wrap div.right {
            float: right;
            width: 340px;
        }
 
        .scontent {
            height: 300px;
            overflow-y: scroll;
        }
 
        li {
            list-style: none;
        }
 
 
    </style>
 
    <script>
        var setting = {
            check:{
                enable: true,
                chkStyle: "checkbox", //勾选框类型(checkbox 或 radio）
                chkboxType: {"Y": "ps", "N": "ps"} //勾选 checkbox 对于父子节点的关联关系
            },
            data: {
                simpleData: {
                    enable: true
                }
            },
            callback: {
                //zTree节点的点击事件
                onCheck:onClick/*,
                onClick: onClick*/
 
            }
        };
        //Ztree的初始数据
        var zNodes = [
            {id: 1, pId: 0, name: "北京"},
            {id: 2, pId: 0, name: "天津"},
            {id: 3, pId: 0, name: "上海"},
            {id: 6, pId: 0, name: "重庆"},
            {id: 4, pId: 0, name: "河北省", open: true},
            {id: 41, pId: 4, name: "石家庄"},
            {id: 42, pId: 4, name: "保定"},
            {id: 43, pId: 4, name: "邯郸"},
            {id: 44, pId: 4, name: "承德"},
            {id: 5, pId: 0, name: "广东省", open: true},
            {id: 51, pId: 5, name: "广州"},
            {id: 52, pId: 5, name: "深圳"},
            {id: 53, pId: 5, name: "东莞"},
            {id: 54, pId: 5, name: "佛山"},
            {id: 7, pId: 0, name: "江苏", open: true},
            {id: 71, pId: 7, name: "南京", open: true},
            {id: 711, pId: 71, name: "鼓楼区"},
            {id: 712, pId: 71, name: "建邺区"},
            {id: 713, pId: 71, name: "栖霞区"},
            {id: 7131, pId: 713, name: "南大"},
            {id: 72, pId: 7, name: "苏州"}
        ];
 
 
        //点击某个节点 然后将该节点的名称赋值值文本框
        function onClick(e, treeId, treeNode) {
 
            var zTree = $.fn.zTree.getZTreeObj("treeDemo");
            //获得选中的节点
            var nodes = zTree.getSelectedNodes(),
                    v = "", existFlg=false;
 
            if(nodes.length==0){
                nodes = zTree.getCheckedNodes(true);
                //先清空已选面板
                $(".scontent>ul").empty();
            }
 
            //根据id排序
            nodes.sort(function compare(a, b) {
                return a.id - b.id;
            });
            var selectedObj = $(".content_wrap>.right>.scontent>ul");
            for (var i = 0, l = nodes.length; i < l; i++) {
                v += nodes[i].name + ",";
                //判断是否已在列表中
                $(".scontent>ul>li").each(function(){
                    if($(this).attr("data-id")==nodes[i].id){
                        existFlg = true;
                        return false;
                    }
                });
 
                if(!existFlg){
                    selectedObj.append("<li id=data-" + nodes[i].id + ">" + nodes[i].name + "<button class='remove' style='float: left;' οnclick='removeNode("+nodes[i].id+")'>移除</button></li>");
                    //增加已选择数量
                    $("#scount").text($(".scontent>ul>li").length);
                }
 
 
            }
 
            //将选中节点的名称显示在文本框内
            if (v.length > 0) v = v.substring(0, v.length - 1);
            //var cityObj = $("#citySel");
            //cityObj.attr("value", v);
            //隐藏zTree
            //hideMenu();
            //return false;
 
 
        }
 
        //删除已选择元素同时取消选中状态
        function removeNode(nodeId){
            var zTree = $.fn.zTree.getZTreeObj("treeDemo");
            var nodes = zTree.getCheckedNodes(true);
            for(var i=0; i<nodes.length; i++){
                //alert(JSON.stringify(nodes[i]));
                if(nodes[i].id==nodeId){
                    $("#data-"+nodeId).remove();
                    zTree.checkNode(nodes[i], false);
                    zTree.refresh();
                    $("#scount").text($(".scontent>ul>li").length);
                    return false;
                }
            }
 
        }
 
        //显示树
        function showMenu() {
            var cityObj = $("#citySel");
            var cityOffset = $("#citySel").offset();
            $("#menuContent").css({
                left: cityOffset.left + "px"/*,
                 top: cityOffset.top + cityObj.outerHeight() + "px"*/
            }).slideDown("fast");
        }
 
        //隐藏树
        function hideMenu() {
            $("#menuContent").fadeOut("fast");
            $("body").unbind("mousedown");
        }
 
 
        //还原zTree的初始数据
        function InitialZtree() {
            $.fn.zTree.init($("#treeDemo"), setting, zNodes);
        }
 
        //根据文本框的关键词输入情况自动匹配树内节点 进行模糊查找
        function AutoMatch(txtObj) {
            if (txtObj.value.length > 0) {
                InitialZtree();
                var zTree = $.fn.zTree.getZTreeObj("treeDemo");
                var nodeList = zTree.getNodesByParamFuzzy("name", txtObj.value);
                //将找到的nodelist节点更新至Ztree内
                $.fn.zTree.init($("#treeDemo"), setting, nodeList);
                showMenu();
            } else {
                //隐藏树
                //hideMenu();
                InitialZtree();
            }
        }
 
        function clearAll() {
            var treeObj = $.fn.zTree.getZTreeObj("treeDemo");
            treeObj.checkAllNodes(false);
            $(".content_wrap>.right>.scontent>ul").empty();
            $("#scount").text(0);
        }
 
        $(document).ready(function () {
            $.fn.zTree.init($("#treeDemo"), setting, zNodes);
            showMenu();
        });
 
    </script>
</head>
<body>
<div class="content_wrap">
    <div class="left">
        <ul class="list">
            <li class="title">  城市：<input id="citySel" type="text" placeholder="请输入关键字检索"
                                                    οnkeyup="AutoMatch(this)"
                                                    style="width: 150px;"/>
            </li>
        </ul>
        <div id="menuContent" class="menuContent" style="position: relative;">
            <ul id="treeDemo" class="ztree">
            </ul>
        </div>
    </div>
 
    <div class="right">
        <div class="stitle">
            <h4>
                已选择：
                <span id="scount" style="color: red;">0</span>
            </h4>
        </div>
        <div class="scontent">
            <ul></ul>
        </div>
 
    </div>
 
</div>
<div class="button" style="float: right;">
    <input type="button" value="清空" οnclick="clearAll()">
</div>
</body>
</html>