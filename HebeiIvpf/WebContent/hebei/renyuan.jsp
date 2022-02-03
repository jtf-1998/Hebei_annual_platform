<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>添加人员情况</title>
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
		<form action="index.jsp" method="post" >
			<div id="div1">
				<table>
					<tr>					
						<td class="labels">平台编号:</td>
						<td width="300px"><font color=red>*</font>
						<%=(id==null?" ":id) %></td>
					</tr>
				</table>
			</div>
			<hr>
			<div id="div8">
                <span style="color: red"><font size=2px color=red>现有人才信息</font></span>
				<table>
					<tr>
						<td class="labels">姓名:</td>
						<td><font color=red>*</font>
						<input type="text" placeholder="张三" style="width: 100px; height: 18px" name="ptzr"
							maxlength="30" onkeyup="this.value=this.value.replace(/[^\u4e00-\u9fa5]/g,'')"/> &nbsp; &nbsp;
							&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;
							&nbsp; 
							<label><input type="radio" value="男" name="sex">男</label>
							<label><input type="radio" value="女" name="sex">女</label>

						</td>
						<td class="labels">出生年月:</td>
						<td width="220px"><font color=red>*</font>
						<input type="date" style="width: 200px; height: 18px" name="birth"/></td>
						<td class="labels">人事关系所在单位:</td>
						<td width="300px"><font color=red>*</font>
						<input type="email" maxlength="30" placeholder="开发部"
							style="width: 200px; height: 18px" name="e-mail" /></td>
					</tr>
					<tr>
						<td class="labels">人员状态:</td>
						<td width="335px"><font color=red>*</font>
						<input type="text" maxlength="30" placeholder=""
							style="width: 100px; height: 18px" name="bgphone"/>
							&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; 
							&nbsp; 
							<label><input type="radio" value="固定" name="sex">固定</label>
							<label><input type="radio" value="流动" name="sex">流动</label>

						</td>
						<td class="labels">人才层次:</td>
						<td width="242px">
							<label><input type="radio" value="" name="sex"><font size=2.5px>院士</font></label>&nbsp;&nbsp;&nbsp;
							<label><input type="radio" value="" name="sex"><font size=2.5px>千人计划</font></label>&nbsp;&nbsp;&nbsp;
							<label><input type="radio" value="" name="sex"><font size=2.5px>万人计划</font></label>&nbsp;&nbsp;
					 </td>
					 <td width="px">
							<label><input type="radio" value="" name="sex"><font size=2.5px>其他国家级称号</font></label>
					   </td>
					   <td width="px">
							<label><input type="radio" value="" name="sex"><font size=2.5px>长江学者</font></label>&nbsp;&nbsp;&nbsp;
							<label><input type="radio" value="" name="sex"><font size=2.5px>国家杰出青年</font></label>&nbsp;&nbsp;&nbsp;
					 
							<label><input type="radio" value="" name="sex"><font size=2.5px>省级称号</font></label>&nbsp;&nbsp;&nbsp;
							<label><input type="radio" value="" name="sex"><font size=2.5px>无</font></label>

						</td>
					</tr>
					<tr>
						<td class="labels">毕业院校:</td>
						<td width="220px"><font color=red>*</font>
						<input placeholder="石家庄铁道大学" maxlength="30" type="text"
							style="width: 200px; height: 18px" name="zhuanye" onkeyup="this.value=this.value.replace(/[^\u4e00-\u9fa5]/g,'')"/></td>
						<td class="labels">学历:</td>
						<td width="220px"><font color=red>*</font>
						<input type="text" placeholder="研究生" maxlength="30"
							style="width: 200px; height: 18px" name="xueli" onkeyup="this.value=this.value.replace(/[^\u4e00-\u9fa5]/g,'')"/></td>
						<td class="labels">学位:</td>
						<td width="220px"><font color=red>*</font>
						<input type="text" placeholder="博士" maxlength="30"
							style="width: 200px; height: 18px" name="xuewei" onkeyup="this.value=this.value.replace(/[^\u4e00-\u9fa5]/g,'')"/></td>
					</tr>
					<tr>
						<td class="labels">所学专业:</td>
						<td width="220px"><font color=red>*</font>
						<input placeholder="软件工程" maxlength="30" type="text"
							style="width: 200px; height: 18px" name="zhuanye" onkeyup="this.value=this.value.replace(/[^\u4e00-\u9fa5]/g,'')"/></td>
						<td class="labels">职称:</td>
						<td width="220px"><font color=red>*</font>
						<input type="text" placeholder="主任" maxlength="30"
							style="width: 200px; height: 18px" name="xueli" onkeyup="this.value=this.value.replace(/[^\u4e00-\u9fa5]/g,'')"/></td>
						<td class="labels">工作性质:</td>
						<td width="220px"><font color=red>*</font>
						<input type="text" placeholder="" maxlength="30"
							style="width: 200px; height: 18px" name="xuewei" onkeyup="this.value=this.value.replace(/[^\u4e00-\u9fa5]/g,'')"/></td>
					</tr>
					
				</table>
			</div>
			<hr>
            <div id="div8">
                <span style="color: red"><font size=2px color=red>年内新增固定人员信息</font></span>
				<table>
					<tr>
						<td class="labels">姓名:</td>
						<td><font color=red>*</font>
						<input type="text" placeholder="张三" style="width: 100px; height: 18px" name="ptzr"
							maxlength="30" onkeyup="this.value=this.value.replace(/[^\u4e00-\u9fa5]/g,'')"/> &nbsp; &nbsp;
							&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;
							&nbsp; 
							<label><input type="radio" value="男" name="sex">男</label>
							<label><input type="radio" value="女" name="sex">女</label>

						</td>
						<td class="labels">出生年月:</td>
						<td width="220px"><font color=red>*</font>
						<input type="date" style="width: 200px; height: 18px" name="birth"/></td>
						<td class="labels">所学专业:</td>
						<td width="300px"><font color=red>*</font>
						<input type="email" maxlength="30" placeholder="软件工程"
							style="width: 200px; height: 18px" name="e-mail" /></td>
					</tr>
					<tr>
						<td class="labels">职称:</td>
						<td width="335px"><font color=red>*</font>
						<input type="text" maxlength="30" placeholder="主任"
							style="width: 200px; height: 18px" name="bgphone"/>
							&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; 
							&nbsp; 
						</td>
						<td class="labels">人才层次:</td>
						<td width="242px">
							<label><input type="radio" value="" name="sex"><font size=2.5px>院士</font></label>&nbsp;&nbsp;&nbsp;
							<label><input type="radio" value="" name="sex"><font size=2.5px>千人计划</font></label>&nbsp;&nbsp;&nbsp;
							<label><input type="radio" value="" name="sex"><font size=2.5px>万人计划</font></label>&nbsp;&nbsp;
					 </td>
					 <td width="px">
							<label><input type="radio" value="" name="sex"><font size=2.5px>其他国家级称号</font></label>
					   </td>
					   <td width="px">
							<label><input type="radio" value="" name="sex"><font size=2.5px>长江学者</font></label>&nbsp;&nbsp;&nbsp;
							<label><input type="radio" value="" name="sex"><font size=2.5px>国家杰出青年</font></label>&nbsp;&nbsp;&nbsp;
					 
							<label><input type="radio" value="" name="sex"><font size=2.5px>省级称号</font></label>&nbsp;&nbsp;&nbsp;
							<label><input type="radio" value="" name="sex"><font size=2.5px>无</font></label>

						</td>
					</tr>
					<tr>
						<td class="labels">毕业院校:</td>
						<td width="220px"><font color=red>*</font>
						<input placeholder="石家庄铁道大学" maxlength="30" type="text"
							style="width: 200px; height: 18px" name="zhuanye" onkeyup="this.value=this.value.replace(/[^\u4e00-\u9fa5]/g,'')"/></td>
						<td class="labels">学历:</td>
						<td width="220px"><font color=red>*</font>
						<input type="text" placeholder="研究生" maxlength="30"
							style="width: 200px; height: 18px" name="xueli" onkeyup="this.value=this.value.replace(/[^\u4e00-\u9fa5]/g,'')"/></td>
						<td class="labels">学位:</td>
						<td width="220px"><font color=red>*</font>
						<input type="text" placeholder="博士" maxlength="30"
							style="width: 200px; height: 18px" name="xuewei" onkeyup="this.value=this.value.replace(/[^\u4e00-\u9fa5]/g,'')"/></td>
					</tr>
					
				</table>
			</div>
			<hr>
			<div id="div8">
                <span style="color: red"><font size=2px color=red>年内减少人员信息</font></span>
				<table>
					<tr>
						<td class="labels">姓名:</td>
						<td><font color=red>*</font>
						<input type="text" placeholder="张三" style="width: 100px; height: 18px" name="ptzr"
							maxlength="30" onkeyup="this.value=this.value.replace(/[^\u4e00-\u9fa5]/g,'')"/> &nbsp; &nbsp;
							&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;
							&nbsp; 
							<label><input type="radio" value="男" name="sex">男</label>
							<label><input type="radio" value="女" name="sex">女</label>

						</td>
						<td class="labels">出生年月:</td>
						<td width="220px"><font color=red>*</font>
						<input type="date" style="width: 200px; height: 18px" name="birth"/></td>
						<td class="labels">工作性质:</td>
						<td width="300px"><font color=red>*</font>
						<input type="email" maxlength="30" placeholder=""
							style="width: 200px; height: 18px" name="e-mail" /></td>
					</tr>
					
					<tr>
						<td class="labels">毕业院校:</td>
						<td width="220px"><font color=red>*</font>
						<input placeholder="石家庄铁道大学" maxlength="30" type="text"
							style="width: 200px; height: 18px" name="zhuanye" onkeyup="this.value=this.value.replace(/[^\u4e00-\u9fa5]/g,'')"/></td>
						<td class="labels">学历:</td>
						<td width="220px"><font color=red>*</font>
						<input type="text" placeholder="研究生" maxlength="30"
							style="width: 200px; height: 18px" name="xueli" onkeyup="this.value=this.value.replace(/[^\u4e00-\u9fa5]/g,'')"/></td>
						<td class="labels">学位:</td>
						<td width="220px"><font color=red>*</font>
						<input type="text" placeholder="博士" maxlength="30"
							style="width: 200px; height: 18px" name="xuewei" onkeyup="this.value=this.value.replace(/[^\u4e00-\u9fa5]/g,'')"/></td>
					</tr>
					<tr>
						<td class="labels">所学专业:</td>
						<td width="220px"><font color=red>*</font>
						<input placeholder="软件工程" maxlength="30" type="text"
							style="width: 200px; height: 18px" name="zhuanye" onkeyup="this.value=this.value.replace(/[^\u4e00-\u9fa5]/g,'')"/></td>
						<td class="labels">职称:</td>
						<td width="220px"><font color=red>*</font>
						<input type="text" placeholder="主任" maxlength="30"
							style="width: 200px; height: 18px" name="xueli" onkeyup="this.value=this.value.replace(/[^\u4e00-\u9fa5]/g,'')"/></td>
						<td class="labels">工作性质:</td>
						<td width="220px"><font color=red>*</font>
						<input type="text" placeholder="" maxlength="30"
							style="width: 200px; height: 18px" name="xuewei" onkeyup="this.value=this.value.replace(/[^\u4e00-\u9fa5]/g,'')"/></td>
					</tr>
					<tr>
						<td class="labels"></td>
						<td width="335px">
						    &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; 
							&nbsp;&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; 
							&nbsp;
							 &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; 
							&nbsp; 
							<label><input type="radio" value="固定" name="sex">固定</label>
							<label><input type="radio" value="流动" name="sex">流动</label>

						</td>
						<td class="labels">人才层次:</td>
						<td width="242px">
							<label><input type="radio" value="" name="sex"><font size=2.5px>院士</font></label>&nbsp;&nbsp;&nbsp;
							<label><input type="radio" value="" name="sex"><font size=2.5px>千人计划</font></label>&nbsp;&nbsp;&nbsp;
							<label><input type="radio" value="" name="sex"><font size=2.5px>万人计划</font></label>&nbsp;&nbsp;
					 </td>
					 <td width="px">
							<label><input type="radio" value="" name="sex"><font size=2.5px>其他国家级称号</font></label>
					   </td>
					   <td width="px">
							<label><input type="radio" value="" name="sex"><font size=2.5px>长江学者</font></label>&nbsp;&nbsp;&nbsp;
							<label><input type="radio" value="" name="sex"><font size=2.5px>国家杰出青年</font></label>&nbsp;&nbsp;&nbsp;
					 
							<label><input type="radio" value="" name="sex"><font size=2.5px>省级称号</font></label>&nbsp;&nbsp;&nbsp;
							<label><input type="radio" value="" name="sex"><font size=2.5px>无</font></label>

						</td>
					</tr>
				</table>
			</div>
			<hr>
				<div id="div8">
                <span style="color: red"><font size=2px color=red>现有固定，流动人员中中高层次人才汇总</font></span>
				<table>
					<th>指标</th>
					<th>院士</th>
					<th>千人计划</th>
					<th>万人计划</th>
					<th>长江学者</th>
					<th>国家杰出青年</th>
					<th>其他国家级称号</th>
					<th>省级称号</th>
					
					<tr>
						<td class="labels" style="width: 100px; height: 18px">合计:<font color=red>*</font></td>
						<td><input type="text" name="" style="width: 150px; height: 18px"></td>
						<td><input type="text" name="" style="width: 150px; height: 18px"></td>
						<td><input type="text" name="" style="width: 150px; height: 18px"></td>
						<td><input type="text" name="" style="width: 150px; height: 18px"></td>
						<td><input type="text" name="" style="width: 150px; height: 18px"></td>
						<td><input type="text" name="" style="width: 150px; height: 18px"></td>
						<td><input type="text" name="" style="width: 150px; height: 18px"></td>
					</tr>
					<tr>
						<td class="labels">固定人员:<font color=red>*</font></td>
						<td><input type="text" name="" style="width: 150px; height: 18px"></td>
						<td><input type="text" name="" style="width: 150px; height: 18px"></td>
						<td><input type="text" name="" style="width: 150px; height: 18px"></td>
						<td><input type="text" name="" style="width: 150px; height: 18px"></td>
						<td><input type="text" name="" style="width: 150px; height: 18px"></td>
						<td><input type="text" name="" style="width: 150px; height: 18px"></td>
						<td><input type="text" name="" style="width: 150px; height: 18px"></td>
					</tr>
					<tr>
						<td class="labels">流动人员:<font color=red>*</font></td>
						<td><input type="text" name="" style="width: 150px; height: 18px"></td>
						<td><input type="text" name="" style="width: 150px; height: 18px"></td>
						<td><input type="text" name="" style="width: 150px; height: 18px"></td>
						<td><input type="text" name="" style="width: 150px; height: 18px"></td>
						<td><input type="text" name="" style="width: 150px; height: 18px"></td>
						<td><input type="text" name="" style="width: 150px; height: 18px"></td>
						<td><input type="text" name="" style="width: 150px; height: 18px"></td>
					</tr>
					
				</table>
				</div>
			<hr>
		    <div id="div8">
                <span style="color: red"><font size=2px color=red>合计1</font></span>
				<table width="1200px">
					<th >指标</th>
					<th >年末总人数</th>
					<th >固定人员</th>
					<th >流动人员</th>
					
					<tr>
						<td class="labels" width="100px">年末总数:<font color=red>*</font></td>
						<td><input type="text" name="" style="width: 275px; height: 18px"></td>
						<td><input type="text" name="" style="width: 275px; height: 18px"></td>
						<td><input type="text" name="" style="width: 275px; height: 18px"></td>
					</tr>
					<tr>
						<td class="labels" width="100px">本年新增:<font color=red>*</font></td>
						<td><input type="text" name="" style="width: 275px; height: 18px"></td>
						<td><input type="text" name="" style="width: 275px; height: 18px"></td>
						<td><input type="text" name="" style="width: 275px; height: 18px"></td>

					</tr>
					<tr>
						<td class="labels" width="100px">本年减少:<font color=red>*</font></td>
						<td><input type="text" name="" style="width: 275px; height: 18px"></td>
						<td><input type="text" name="" style="width: 275px; height: 18px"></td>
						<td><input type="text" name="" style="width: 275px; height: 18px"></td>

					</tr>
				</table>
				</div>
				<hr>
				<div id="div8">
                <span style="color: red"><font size=2px color=red>合计2</font></span>
				<table>
					<th>职称\学位</th>
					<th>合计</th>
					<th>正高职称</th>
					<th>副高职称</th>
					<th>中级职称</th>
					<th>初级职称</th>
					<th>其他</th>
					
					<tr>
						<td class="labels">合计3:<font color=red>*</font></td>
						<td><input type="text" name=""></td>
						<td><input type="text" name=""></td>
						<td><input type="text" name=""></td>
						<td><input type="text" name=""></td>
						<td><input type="text" name=""></td>
						<td><input type="text" name=""></td>
					</tr>
					<tr>
						<td class="labels">博士:<font color=red>*</font></td>
						<td><input type="text" name=""></td>
						<td><input type="text" name=""></td>
						<td><input type="text" name=""></td>
						<td><input type="text" name=""></td>
						<td><input type="text" name=""></td>
						<td><input type="text" name=""></td>
					</tr>
					<tr>
						<td class="labels">硕士:<font color=red>*</font></td>
						<td><input type="text" name=""></td>
						<td><input type="text" name=""></td>
						<td><input type="text" name=""></td>
						<td><input type="text" name=""></td>
						<td><input type="text" name=""></td>
						<td><input type="text" name=""></td>
					</tr>
					<tr>
						<td class="labels">学士:<font color=red>*</font></td>
						<td><input type="text" name=""></td>
						<td><input type="text" name=""></td>
						<td><input type="text" name=""></td>
						<td><input type="text" name=""></td>
						<td><input type="text" name=""></td>
						<td><input type="text" name=""></td>
					</tr>
					<tr>
						<td class="labels">其他:<font color=red>*</font></td>
						<td><input type="text" name=""></td>
						<td><input type="text" name=""></td>
						<td><input type="text" name=""></td>
						<td><input type="text" name=""></td>
						<td><input type="text" name=""></td>
						<td><input type="text" name=""></td>
					</tr>
				</table>
				</div>
				<hr>
				<div id="div8">
                <span style="color: red"><font size=2px color=red>合计3</font></span>
				<table>
					<th>年龄\工作岗位</th>
					<th>合计</th>
					<th>大于或等于60</th>
					<th>45-59</th>
					<th>30-44</th>
					<th>小于30</th>
					
					<tr>
						<td class="labels">合计:<font color=red>*</font></td>
						<td><input type="text" name=""></td>
						<td><input type="text" name=""></td>
						<td><input type="text" name=""></td>
						<td><input type="text" name=""></td>
						<td><input type="text" name=""></td>
					</tr>
					<tr>
						<td class="labels">科研开发人员:<font color=red>*</font></td>
						<td><input type="text" name=""></td>
						<td><input type="text" name=""></td>
						<td><input type="text" name=""></td>
						<td><input type="text" name=""></td>
						<td><input type="text" name=""></td>
					</tr>
					<tr>
						<td class="labels">其他:<font color=red>*</font></td>
						<td><input type="text" name=""></td>
						<td><input type="text" name=""></td>
						<td><input type="text" name=""></td>
						<td><input type="text" name=""></td>
						<td><input type="text" name=""></td>
					</tr>
					<tr></tr>
					<tr>

						<td></td>
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
