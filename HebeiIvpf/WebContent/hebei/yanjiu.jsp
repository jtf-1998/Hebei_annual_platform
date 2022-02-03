<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>添加研究方向和体系结构</title>
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
	width: 1200px;
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
<%!						
						String id;
						
						%>
						<%
						  String id=request.getParameter("id");
						%>
<a href="QueryYanjiuServlet">查看全部</a>
	<div id="div0">
		<form action="AddYanjiuServlet" method="post" >
			<div id="div1">
				<table>
					<tr>					
						<td class="labels">平台编号:</td>
						<td width="300px"><font color=red>*</font>
						<input type="text" maxlength="30" name="id"  style="width: 200px; height: 18px" value="<%=(id==null?" ":id) %>"/></td>
						<td class="labels">研究方向:</td>
						<td width="300px"><font color=red>*</font>
						<input type="text" style="width: 200px; height: 18px" name="yjfx"/></td>
						<td class="labels">服务项目:</td>
						<td width="300px"><font color=red>*</font>
						<input type="text" style="width: 200px; height: 18px" name="fwxm"/></td>
					</tr>
				</table>
			</div>
			<div id="div3">
				<table>
					<tr>
						<td class="labels"  align="center" valign="middle">研究内容:</th>
						<td class="labels" align="center" valign="middle">服务内容:</th>
					</tr>
						<tr>
						     <td width="500px" align="center" valign="middle">
						     <textarea rows="5" cols="20" name="yjnr"></textarea></td>						
						    <td width="500px" align="center" valign="middle">&nbsp;&nbsp;
						    <textarea rows="5" cols="20" name="fwnr"></textarea></td>
					     </tr>
				</table>
			</div>
			<hr>
			<div id="div8">
				<table cellpadding="0" cellspacing="0">
					<tr>
						<td class="labels" width="120px">平台内设机构:</td>
						<td width="250px"><input type="text"placeholder="填写中文" name="gzjg"style="width: 200px; height: 18px"/></td>
						
						<td class="labels" width="150px">中试生产线(基地):</td>
						<td width="250px"><input type="text"placeholder="填写中文" name="zssc"style="width: 200px; height: 18px"/></td>
						<td class="labels" width="180px">中试生产线所在单位:</td>
						<td width="250px"><input type="text"placeholder="填写中文" name="szdw"style="width: 200px; height: 18px"/></td>
					</tr>
					<tr>
					  <td style="height: 18px">&nbsp;</td>
					 </tr>
				</table>
			</div>
			<div id="div10">
				<table cellpadding="1" cellspacing="0">
					<tr>
					    <td class="labels" width="120px">检验检测机构:</td>
						<td width="250px"><input type="text"placeholder="填写中文" name="jcjg"style="width: 200px; height: 18px"/></td>
						<td class="labels" width="150px">资质评定部门:</td>
						<td width="300px"><input type="text" placeholder="填写中文" name="pdbm"style="width: 200px; height: 18px"/></td>
						<td class="labels" width="120px">资质等级:</td>
						<td><input type="radio" value="一级" name="jcdj">一级 <input
							type="radio" value="二级" name="jcdj">二级 <input
							type="radio" value="三级" name="jcdj">三级</td>
					</tr>
				</table>
			</div>
			<hr>
		<div id="div13">
				<table>
			<tr>
						<td width="300px">&nbsp;</td>
						<td style="font-size:20px" width="350px">确定填写信息准确请提交</td>
						<td></td>
						<td><input type="submit" class="a_demo_two1" style='font-size: 20px' value="提交"></td>
						<td></td>
					</tr>
					</table>
			</div>
		</form>
	</div>
</body>
</html>
<script> 
  var result ='<%=request.getParameter("result")%>';
  if(result=='-1')
  {
   alert("该条记录已存在!");
  }
  else
  {
  }
</script>
