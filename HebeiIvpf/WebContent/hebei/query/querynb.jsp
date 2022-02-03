<%@ page language="java" contentType="text/html; charset=UTF-8" import="java.util.*"
    pageEncoding="UTF-8"%>
<%@ page import="bean.*" %>
<%@ page import="dao.*" %>
<%@ page import="servlet.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>单条件/模糊查询</title>
<style type="text/css">

body {
	margin: 0px;
	padding: 0px;
}

#div  {
    position: absolute; 
	top: 23%;
    margin: 0px;
	padding: 0px;
	width:45%;
	height: 99%;
	
}

#divd{
       position: absolute; 
	top: 54%;
    margin: 0px;
	padding: 0px;
	width:45%;
	height: 99%;
}

#div0 {
	position: absolute; //
	top: 50%;
	left: 20%;
	margin: 12px 0 0 -200px;
	width: 2400px;
	border: 1px solid #008800;
}
#div2 {
    position: absolute; //
	top: 50%;
	left: 44.4%;
	margin: 12px 0 0 -200px;
	width: 2400px;
	border: 1px solid #008800;
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
</style>
<script type="text/javascript" src="/hebei/lhgcore.js"></script>
<script type="text/javascript" src="/hebei/lhgcalendar.js"></script>
</head>
<body style="background-color: #dceefc">
<nav class="breadcrumb"><i class="Hui-iconfont">&#xe67f;</i> 首页 <span class="c-gray en">&gt;</span> 年报统计管理<span class="c-gray en">&gt;</span>单条件/模糊查询年报 <a class="btn btn-success radius r" style="line-height:1.6em;margin-top:3px" href="javascript:location.replace(location.href);" title="刷新" ><i class="Hui-iconfont">&#xe68f;</i></a></nav>
	<div id="div0">
			<div id="div1">
			 <form action="SeachNbServlet" method="post">
				<table>
					<tr>					
						<th>选择查询条件</th>
						<th>输入您的条件</th>
						<th>如果选择批准年月</th>
						<th>从什么时候开始</th>
						<th>从什么时候结束</th>
					</tr>	
					<tr>
					          <td>
                                     <select name="select">
				                            <option value="">选择一个条件</option>
				                            <option value="id">平台编号</option>
				                            <option value="ptzr">平台主任</option>
				                            <option value="ptmc">平台名称</option>
				                            <option value="time">批准年月</option>
			                          </select>
                                                   &nbsp;</td>					       
					          <td><input type="text" name="value">&nbsp;</td>
					          <th>请单独输入年月范围:&nbsp;</th>
					          <td><input type="date" name="low_time" >&nbsp;</td>
					          <td><input type="date" name="high_time">&nbsp;</td>
					          <td><input type="submit" name="submit" value="查找">&nbsp;</td>					         
					</tr>
				</table>
		      </form>
			</div>
			<hr>
	</div>
 <div id="div">
	<nav class="breadcrumb"><i class="Hui-iconfont">&#xe67f;</i>首页<span class="c-gray en">&gt;</span>年报统计<span class="c-gray en">&gt;</span>多条件/模糊查询年报</nav>
    <div id="div2">
			<div id="div3">
			 <form action="SeachNbYServlet" method="post">
				<table>
					<tr>					
						<th>选择查询条件</th>
						<th>输入您的条件</th>
						<th>如果选择批准年月</th>
						<th>从什么时候开始</th>
						<th>从什么时候结束</th>
					</tr>	
					<tr>
					          <td>平台编号：&nbsp;</td>					       
					          <td><input type="text" name="value1">&nbsp;</td>
					          <th rowspan="3">请单独输入年月范围:&nbsp;</th>
					          <td rowspan="3"><input type="date" name="low_time" >&nbsp;</td>
					          <td rowspan="3"><input type="date" name="high_time">&nbsp;</td>
					          <td rowspan="3"><input type="submit" name="submit" value="查找">&nbsp;</td>					         
					</tr>
					<tr> 
					          <td>平台主任：&nbsp;</td>					       
					          <td><input type="text" name="value2">&nbsp;</td>					          
					         				         
					</tr>
					<tr>
					          <td>平台名称：&nbsp;</td>					       
					          <td><input type="text" name="value3">&nbsp;</td>
				    </tr>
					         					
				</table>
		      </form>
			</div>
			<hr>
	</div>
 </div>
  <div id="divd">
       <nav class="breadcrumb"><i class="Hui-iconfont">&#xe67f;</i> 首页 <span class="c-gray en">&gt;</span> 年报统计管理<span class="c-gray en">&gt;</span>一框式查询年报 <a class="btn btn-success radius r" style="line-height:1.6em;margin-top:3px" href="javascript:location.replace(location.href);" title="刷新" ><i class="Hui-iconfont">&#xe68f;</i></a></nav>
	<div id="div2">
			<div id="div3">
			 <form action="SearchAllServlet" method="post">
				<table>
					<tr>					
						<th>输入您条件</th>

					</tr>	
					<tr>				       
					          <td>&nbsp;&nbsp;&nbsp;&nbsp;<input type="text" name="value">&nbsp;</td>
					          <td><input type="submit" name="submit" value="查找">&nbsp;</td>					         
					</tr>
				</table>
		      </form>
			</div>
			<hr>
	</div>
  </div>
</body>
</html>
<script> 
  var id ='<%=request.getParameter("id")%>';
  if(id=='0')
  {
   alert("找不到相关信息!");
  }
  else if(id=='-1')
  {
	 alert("请输入查询条件!");  
  }
  else
  {
  }
</script>