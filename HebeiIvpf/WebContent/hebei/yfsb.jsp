<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>添加用房面积和设备数变化情况</title>
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
<a href="">查看全部</a>
	<div id="div0">
		<form action="AddYfyqServlet" method="post" >
			<div id="div1">
				<table>
					<tr>					
						<td class="labels">平台编号:</td>
						<td width="300px"><font color=red>*</font>
						<input type="text" maxlength="30" name="id"  style="width: 200px; height: 18px" value="<%=(id==null?" ":id) %>"/></td>
						<td class="labels">建筑面积合计:</td>
						<td width="300px"><font color=red>*</font>
						<input type="text" style="width: 200px; height: 18px" name="jzmj" placeholder="单位：平方米"/></td>
						<td class="labels">本年建筑面积变化:</td>
						<td width="300px"><font color=red>*</font>
						<input type="text" style="width: 200px; height: 18px" name="jzbh" placeholder="例如：增加1.5万（单位：平方米）"/></td>
					</tr>
				</table>
			</div>
			<div id="div3">
				<table>
					<tr>					
						<td class="labels">科研用房面积合计:</td>
						<td width="300px"><font color=red>*</font>
						<input type="text" maxlength="30" name="kymj"  style="width: 200px; height: 18px" placeholder="单位：平方米"/></td>
						<td class="labels">办公用房面积合计:</td>
						<td width="300px"><font color=red>*</font>
						<input type="text" style="width: 200px; height: 18px" name="bgmj" placeholder="单位：平方米"/></td>
						<td class="labels">其他用房面积合计:</td>
						<td width="300px"><font color=red>*</font>
						<input type="text" style="width: 200px; height: 18px" name="qtmj" placeholder="单位：平方米"/></td>
					</tr>
				</table>
			</div>
			<hr>
			<div id="div8">
				<table>
					<tr>					
						<td class="labels">本年科研用房面积变化:</td>
						<td width="300px"><font color=red>*</font>
						<input type="text" maxlength="30" name="kybh"  style="width: 200px; height: 18px" placeholder="例如：增加1.5万（单位：平方米）"/></td>
						<td class="labels">本年办公用房面积变化:</td>
						<td width="300px"><font color=red>*</font>
						<input type="text" style="width: 200px; height: 18px" name="bgbh" placeholder="例如：增加1.5万（单位：平方米）"/></td>
						<td class="labels">本年其他用房面积变化:</td>
						<td width="300px"><font color=red>*</font>
						<input type="text" style="width: 200px; height: 18px" name="qtbh" placeholder="例如：减少1.5万（单位：平方米）"/></td>
					</tr>
				</table>
			</div>
			<hr>
			<div id="div13">
				<table>
					<tr>
						<td class="labels">仪器设备总数:</td>
						<td width="340px"><input type="text" name="yq"style="width: 200px; height: 18px" placeholder="单位：台/套数"/></td>
						<td class="labels">本年仪器设备总数变化:</td>
						<td width="320px"><input type="text" name="yqbh"style="width: 200px; height: 18px" placeholder="例如：减少1000（单位：台）"/></td>
					</tr>
					<tr>
						<td class="labels">20万元以上仪器设备原值总额:</td>
						<td width="340px"><input type="text" name="yz"style="width: 200px; height: 18px" placeholder="单位：万元"/></td>
						<td class="labels">20万元以上仪器设备原值变化:</td>
						<td width="340px"><input type="text" name="yzbh"style="width: 200px; height: 18px" placeholder="例如：减少10（单位：万元）"/></td>
					</tr>
					<tr>
					  <td>&nbsp;</td>
					</tr>
					<tr>
					  <td>&nbsp;</td>
					</tr>
					<tr>
						<td></td>
						<td style="font-size:20px">确定填写信息准确请提交</td>
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
