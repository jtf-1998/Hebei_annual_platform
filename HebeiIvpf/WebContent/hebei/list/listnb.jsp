<%@ page language="java" contentType="text/html; charset=UTF-8" import="java.util.*"
    pageEncoding="UTF-8"%>
<%@ page import="bean.*" %>
<%@ page import="dao.*" %>
<%@ page import="servlet.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>显示简略的年报</title>
<style type="text/css">

body {
	margin: 0px;
	padding: 0px;
}
#div100{

   margin-top: 10px;
	border: 1px solid #617775;
	width: 200px;
	height: 570px;
	overflow-y: scroll;
	overflow-x: auto;
    float:left;
     
}
#div0 {
	position: absolute; //
	top: 50%;
	left: 31%;
	margin: 12px 0 0 -200px;
	
	width: 1800px;
	
	float:left;
}

a:link {
	color: #0cc;
	text-decoration: none;
}

a:visited {
	color: #0cc;
	text-decoration: underline;
}

a:hover {
	color: red;
	text-decoration: none;
	font-size: 20px;
}

a:active {
	color: #00f;
	text-decoration: none;
}


ul.ztree {
	margin-top: 10px;
	border: 1px solid #617775;
	width: 200px;
	height: 570px;
	overflow-y: scroll;
	overflow-x: auto;
}
div.zTreeDemoBackground {
	width: 200px;
	height: 570px;
	text-align: left;
}

span.search_highlight {
	color: whitesmoke;
	background-color: darkred; 	
}
</style>
<link rel="stylesheet" type="text/css" href="../lib/zTree/css/metro.css" />
<!-- 定义了一些模拟数据的js文件dataset.js -->
<script type="text/javascript" src="../lib/zTree/js/dataset.js"></script>
<!-- 引入jquery  -->
<script type="text/javascript" src="../lib/zTree/js/jquery-1.4.4.min.js"></script>
<!-- 引入ztree插件 -->
<script type="text/javascript" src="../lib/zTree/js/jquery.ztree.all.min.js"></script>
<!-- 引入ztree插件扩展功能 -->
<script type="text/javascript" src="../lib/zTree/js/jquery.ztree.exhide.min.js"></script>
<!-- 引入自定义方法 -->
<script type="text/javascript" src="../lib/zTree/js/fuzzysearch.js"></script>

</head>
<body style="background-color: #dceefc">
<nav class="breadcrumb"><i class="Hui-iconfont">&#xe67f;</i> 首页 <span class="c-gray en">&gt;</span> 年报统计管理<span class="c-gray en">&gt;</span>年报统计 <a class="btn btn-success radius r" style="line-height:1.6em;margin-top:3px" href="javascript:location.reload();" title="刷新" ><i class="Hui-iconfont">&#xe68f;</i></a></nav>
<div id="div100">
    <script>
    //实现功能,搜索显示,大小写搜索不会影响,模糊搜索，匹配结果显示并高亮
      window.onload=function () {
        var otab = document.getElementById('theader');
        var obtn = document.getElementById('search');
        var otext = document.getElementById('keyword');
        obtn.onclick=function () {
          for (var i = 0; i < otab.tBodies[0].rows.length ; i++) {
            var stab = otab.tBodies[0].rows[i].cells[4].innerHTML.toLowerCase();
            var stext = otext.value.toLowerCase();
           // toLowerCase()将英文全部转换成小写,为了用户在输入小写的时候仍然可以将内容搜索出来
            var arr = stext.split(' ');
            //split的作用将某一段字符串按照指定字符进行切割
            otab.tBodies[0].rows[i].style.background = "";//确保在下一次搜索时上一次搜索不会影响这次搜索的结果
            for (var j = 0; j < arr.length; j++) 
            {
            	var type=0;
              if (stab.search(arr[j]) != -1) 
              {
                   otab.tBodies[0].rows[i].style.background = 'red';
                    type=1;
              }
              if(type!=1)
              {
                  //var tbody=child.parentNode;
                  //tbody.removeChild(child);
                     otab.tBodies[0].rows[i].style.display="none";
               }
            }
        }
        }
        
      } 
   
    </script>
	<div style="width: 200px">
	   <table>
	      <tr>
	          <td style="width: 50px"><input type="button" value="搜索" id="search"/></td>
	          <td style="width: 100px"><input id="keyword" type="search" placeHolder="平台机构所在地"/></td>
	      </tr>
	   </table>	
	   <div class="content_wrap">
		<div class="zTreeDemoBackground left">
			<ul id="book" class="ztree"></ul>
		</div>
	    </div>	
	</div>
    <script type="text/javascript">
			
	//ztree配置
	var setting = {
			check: {
				enable: false//checkbox
			},
			view: {
				nameIsHTML: true, //允许name支持html
				showLine: true,				
				selectedMulti: false
			},
			edit: {
				enable: true,
				editNameSelectAll: false,
				showRemoveBtn : $("#pdelete").val() == "delete" ? setRemoveBtn : false,
				showRenameBtn : false,
                removeTitle : "删除节点"
			},
			data: {
				key : {
                        name : "name"
                      },
				simpleData: 
				{
					enable: true,
					idKey : "id",
					pIdKey : "pId"
			    }
           },
                                      

	};
	
	$(document).ready(function(){
		//从服务器读取数据并初始化树形图
		//loadDataFromServer(urlStr);  
		//本例直接从模拟数据dataset.js读取
		loadDataFromLocal();//从本地dataset.js文件读取模拟数据并初始化树形图
	});
            
	/**
	 * 通过ajax方法从服务器获取数据并初始化树形图
	 */
	function loadDataFromServer(urlStr){
		 $.ajax({                 
			type: "get",                 
			dataType: "json",
			url: urlStr,  //服务请求地址 
			success: function(data) {
				initThisZtree(data);//传入数据,初始化ztree
				fuzzySearch('book','#keyword',null,true); //初始化模糊搜索方法
			}     
		});   
	}
	
	/**
	 * 从本地js/dataset.js文件读取模拟数据并初始化树形图
	 */
	function loadDataFromLocal(){
		//此处的树节点数据mockData是在本地js/dataSet.js中预先定义的模拟数据

		initThisZtree(mockData);//传入数据,初始化ztree
		// zTreeId ztree对象的id,不需要#
 		// searchField 输入框选择器
        // isHighLight 是否高亮,默认高亮,传入false禁用
        // isExpand 是否展开,默认合拢,传入true展开
		fuzzySearch('book','#keyword',null,true); //初始化模糊搜索方法
	}
	
	/**
	 * 初始化ztree
	 * 
	 * @param {Object} data
	 */
	function initThisZtree(data){
		//初始化ztree三个参数分别是(jQuery对象,ztree设置,树节点数据)
		var treeObj = $.fn.zTree.init($("#book"), setting, data); 
		treeObj.expandAll(true);
	}
	</script>
</div>
<div id="div0">
		<form action="AddYanjiuServlet" method="post" >
			<div id="div1">
				<table id="theader">
					<tr >					
						<th>平台编号</th>
						<th>平台名称</th>
						<th>批准年月</th>
						<th>批准文号</th>
						<th>所在地区</th>
						<th>平台主任</th>
					</tr>	
<%!
    int id;
    String name;
	 String pzny; //批准年月
	 int pzwh;   //批准文号
	 String xq;  //平台级别
	 String ptzr;   //平台主任  
    %>
    <%
       List<NianBao> nbs= (List<NianBao>)request.getAttribute("nbs");
       List<Ptzr> pts= (List<Ptzr>)request.getAttribute("pts");
       for(NianBao nb:nbs)
       {
    	   id=nb.getId();
           name=nb.getName();   //平台名称   
 		  pzny=nb.getPzny(); //批准年月 		  
 		 int pzwh=nb.getPzwh();   //批准文号
 		  xq=nb.getXq();  //平台级别
 		  ptzr=nb.getPtzr();   //平台主任
 	%>
 	               <tr>
					          <td><input type="text" value="<%=id%>" name="id">&nbsp;</td>					       
					          <td><input type="text" value="<%=name%>" name="name">&nbsp;</td>
					          <td><input type="text" value="<%=pzny%>"  name="ptny">&nbsp;</td>
					          <td><input type="text" value="<%=pzwh%>" name="pzwh">&nbsp;</td>
					          <td><input type="text" value="<%=xq%>" name="ptjb">&nbsp;</td>
					          <td><input type="text" value="<%=ptzr%>" name="ptzr">&nbsp;</td>	
					          <td><a href="QueryNianBaoServlet?id=<%=id%>">详细年报</a></td>				         
					</tr>
    <%
       }
           
    %>
					
			

				</table>
			</div>
			<hr>
		</form>
</div>
	
</body>
</html>
