<%@ page language="java" contentType="text/html; charset=UTF-8" import="java.util.*"
    pageEncoding="UTF-8"%>
<%@ page import="bean.*" %>
<%@ page import="dao.*" %>
<%@ page import="servlet.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>显示研究方向和结构信息</title>
<style type="text/css">
.a_demo_two 
{
	background-color:#3bb3e0;
	padding:10px;
	position:relative;
	font-family: 'Open Sans', sans-serif;
	font-size:18px;
	text-decoration:none;
	color:#fff;
	background-image: linear-gradient(bottom, rgb(44,160,202) 0%, rgb(62,184,229) 100%);
	background-image: -o-linear-gradient(bottom, rgb(44,160,202) 0%, rgb(62,184,229) 100%);
	background-image: -moz-linear-gradient(bottom, rgb(44,160,202) 0%, rgb(62,184,229) 100%);
	background-image: -webkit-linear-gradient(bottom, rgb(44,160,202) 0%, rgb(62,184,229) 100%);
	background-image: -ms-linear-gradient(bottom, rgb(44,160,202) 0%, rgb(62,184,229) 100%);
	background-image: -webkit-gradient(
	linear,
	left bottom,
	left top,
	color-stop(0, rgb(44,160,202)),
	color-stop(1, rgb(62,184,229))
	);
	-webkit-box-shadow: inset 0px 1px 0px #7fd2f1, 0px 6px 0px #156785;
	-moz-box-shadow: inset 0px 1px 0px #7fd2f1, 0px 6px 0px #156785;
	-o-box-shadow: inset 0px 1px 0px #7fd2f1, 0px 6px 0px #156785;
	box-shadow: inset 0px 1px 0px #7fd2f1, 0px 6px 0px #156785;
	-webkit-border-radius: 5px;
	-moz-border-radius: 5px;
	-o-border-radius: 5px;
	border-radius: 5px;
}
.a_demo_two1 {
	background-color:#fff;
	padding:10px;
	position:relative;
	font-family: 'Open Sans', sans-serif;
	font-size:18px;
	text-decoration:none;
	color:#fff;
	background-image: linear-gradient(bottom, rgb(44,160,202) 0%, rgb(62,184,229) 100%);
	background-image: -o-linear-gradient(bottom, rgb(44,160,202) 0%, rgb(62,184,229) 100%);
	 background-image: -moz-linear-gradient(bottom, rgb(44,160,202) 0%, rgb(62,184,229) 100%);
	background-image: -webkit-linear-gradient(bottom, rgb(44,160,202) 0%, rgb(62,184,229) 100%);
	background-image: -ms-linear-gradient(bottom, rgb(44,160,202) 0%, rgb(62,184,229) 100%); 
	background-image: -webkit-gradient(
	linear,
	left bottom,
	left top,
	color-stop(0, rgb(14,160,202)),
	color-stop(1, rgb(62,184,229))
	);
	-webkit-box-shadow: inset 0px 1px 0px #7fd2f1, 0px 6px 0px #156785;
	-moz-box-shadow: inset 0px 1px 0px #7fd2f1, 0px 6px 0px #156785;
	-o-box-shadow: inset 0px 1px 0px #7fd2f1, 0px 6px 0px #156785;
	box-shadow: inset 0px 1px 0px #7fd2f1, 0px 6px 0px #156785;
	-webkit-border-radius: 5px;
	-moz-border-radius: 5px;
	-o-border-radius: 5px;
	border-radius: 5px; 
}
body {
	margin: 0px;
	padding: 0px;
}

#div0 {
	position: absolute; //
	top: 50%;
	left: 20%;
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
<script type="text/javascript" src="lhgcore.js"></script>
<script type="text/javascript" src="lhgcalendar.js"></script>
</head>
<body style="background-color: #dceefc">
<nav class="breadcrumb"><i class="Hui-iconfont">&#xe67f;</i> 首页 <span class="c-gray en">&gt;</span> 研究方向和体系结构 <span class="c-gray en">&gt;</span> 研究方向和体系结构 <a class="btn btn-success radius r" style="line-height:1.6em;margin-top:3px" href="javascript:location.replace(location.href);" title="刷新" ><i class="Hui-iconfont">&#xe68f;</i></a></nav>
	<div id="div0">
		<form action="AddYanjiuServlet" method="post" >
			<div id="div1">
				<table>
					<tr>					
						<th>ID</th>
						<th>平台编号</th>
						<th>研究方向</th>
						<th>服务项目</th>
						<th>平台内设机构</th>
						<th>中试生产线</th>
						<th>中试生产线所在单位</th>
						<th>检验检测机构</th>
						<th>资质评定部门</th>
						<th>资质等级</th>
						<th>研究内容</th>
						<th>服务内容</th>	
					</tr>	
						<%
						List<YanjiuJiegou> yanjius= (List<YanjiuJiegou>)request.getAttribute("yanjius");
						for(YanjiuJiegou yanjiu:yanjius)
						{
						%>
					<tr>
					          <td><input type="text" value="<%=yanjiu.getPid() %>" name="pid">&nbsp;</td>
					          <td><input type="text" value="<%=yanjiu.getId() %>" name="id">&nbsp;</td>
					          <td><input type="text" value="<%=yanjiu.getYjfx() %>" name="yjfx">&nbsp;</td>
					          <td><input type="text" value="<%=yanjiu.getFwxm() %>"  name="fwxm">&nbsp;</td>
					          <td><input type="text" value="<%=yanjiu.getGzjg() %>" name="gzjg">&nbsp;</td>
					          <td><input type="text" value="<%=yanjiu.getZssc() %>" name="zssc">&nbsp;</td>
					          <td><input type="text" value="<%=yanjiu.getSzdw() %>" name="szdw">&nbsp;</td>
					          <td><input type="text" value="<%=yanjiu.getJcjg() %>" name="jcjg">&nbsp;</td>
                              <td><input type="text" value="<%=yanjiu.getPdbm() %>" name="pdbm">&nbsp;</td>
					         <td><input type="text" value="<%=yanjiu.getJcdj() %>" name="jcdj">&nbsp;</td>					
					         <td><input type="text" value="<%=yanjiu.getYjnr() %>" name="yjnr">&nbsp;</td>
					         <td><input type="text" value="<%=yanjiu.getFwnr()%>" name="fwnr">&nbsp;</td>
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