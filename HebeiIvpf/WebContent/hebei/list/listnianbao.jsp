<%@ page language="java" contentType="text/html; charset=UTF-8" import="bean.*" 
    pageEncoding="UTF-8"%>
    <%@ page import="java.util.*" %>
     <%@ page import="dao.*" %>
      <%@ page import="service.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">

<title>年报统计</title>
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
</head>
<body style="background-color: #dceefc">
<nav class="breadcrumb"><i class="Hui-iconfont">&#xe67f;</i> 首页 <span class="c-gray en">&gt;</span> 年报统计管理 <span class="c-gray en">&gt;</span> 年报统计 <a class="btn btn-success radius r" style="line-height:1.6em;margin-top:3px" href="javascript:location.replace(location.href);" title="刷新" ><i class="Hui-iconfont">&#xe68f;</i></a></nav>
	 <%!
    int id;
    String name;
	 String pzny; //批准年月
	 int pzwh;   //批准文号
	 String jsly;  //技术领域
	 String ptjb;  //平台级别
	 String xq;   //所在县区
	 String ptxt1; //平台组织形态1
	 String ptxt2;  //平台组织形态2
	 String ptxt3;  //平台组织形态3
	 String wfhy;  //服务主要行业
	 String ssxk;   //服务的主要学科
	 String ytdw;  //依托单位名称
	 int ytdwdm;  //依托单位代码
	 String ytdwfr;  //依托单选法人
	 String bgdh;  //依托单位办公电话
	 String ytdwlx;  //依托单位类型
	 int nsdm;    //依托单位纳税代码
    String gjdw;  //共建单位
	 String ptwz;   //平台网站名称
	 String wz;   //平台网址
	 String pttxdz;  //平台通讯地址
	 String ptzr;   //平台主任
	 int yb; 
	 String sex;   //性别
	 String birth;  //出生年月
	 String zhichen; //职称
	 String zhuanye; //专业
	 String xueli; //学历
	 String xuewei; //学位
	 String bgphone; //办公电话
	 String phone;  //电话
	 String email;//E-mail    
    %>
    <%
       NianBao nb=(NianBao)request.getAttribute("nb");
       Ptzr pt=(Ptzr)request.getAttribute("pt"); 
             id=nb.getId();
              name=nb.getName();   //平台名称   
    		  pzny=nb.getPzny(); //批准年月
    		 int pzwh=nb.getPzwh();   //批准文号
    		  jsly=nb.getJsly();  //技术领域
    		  ptjb=nb.getPtjb();  //平台级别
    		  xq=nb.getXq();   //所在县区
    		  ptxt1=nb.getPtxt1(); //平台组织形态1
    		  ptxt2=nb.getPtxt2();  //平台组织形态2
    		 ptxt3=nb.getPtxt3();  //平台组织形态3
    		 wfhy=nb.getWfhy();  //服务主要行业
    		  ssxk=nb.getSsxk();   //服务的主要学科
    		  ytdw=nb.getYtdw();  //依托单位名称
    		  ytdwdm=nb.getYtdwdm();  //依托单位代码
    		  ytdwfr=nb.getYtdwfr();  //依托单选法人
    		  bgdh=nb.getBgdh();  //依托单位办公电话
    		  ytdwlx=nb.getYtdwlx();  //依托单位类型
    		 nsdm=nb.getNsdm();    //依托单位纳税代码
    	      gjdw=nb.getGjdw();  //共建单位
    		  ptwz=nb.getPtwz();   //平台网站名称
    		  wz=nb.getWz();   //平台网址
    		  pttxdz=nb.getPttxdz();  //平台通讯地址
    		  ptzr=nb.getPtzr();   //平台主任
    		 yb=nb.getYb(); 
        	   sex=pt.getSex();   //性别
        	   birth=pt.getBirth();  //出生年月
        	   zhichen=pt.getZhichen(); //职称
        	   zhuanye=pt.getZhuanye(); //专业
        	    xueli=pt.getXueli(); //学历
        	    xuewei=pt.getXuewei(); //学位
        	   bgphone=pt.getBgphone(); //办公电话
        	   phone=pt.getPhone();  //电话
        	   email=pt.getEmail(); //E-mail
    %>
	<div id="div0">
		<form action="" method="post" >
			<div id="div1">
				<table>
					<tr>
						<td class="labels">平台名称:</td>
						<td width="300px"><font color=red>*</font>
						<input type="text" maxlength="30" name="name"  style="width: 200px; height: 18px" value="<%=name%>"/>
						</td>
						<td class="labels">平台编号:</td>
						<td width="300px"><font color=red>*</font>
						<input type="text" maxlength="30" name="id"  style="width: 200px; height: 18px" value="<%=id%>"/></td>
						<td class="labels">批准年月:</td>
						<td width="300px"><font color=red>*</font>
						<input type="text" value="<%=pzny%>" /></td>
					</tr>
				</table>
			</div>
			<div id="div3">
				<table>
					<tr>
						<td class="labels">批准文号:</td>
						<td width="200px"><font color=red>*</font>
						<input maxlength="30" type="text" name="pzwh" style="width: 150px; height: 18px" value="<%=pzwh%>"/></td>
						<td class="labels">技术领域:</td>
						<td width="200px">
						<input type="text" maxlength="30" name="jsly" style="width: 150px; height: 18px" value="<%=jsly%>"/></td>
						<td class="labels" >平台级别:</td>
						<td width="200px">
						<input type="text" maxlength="30" name="jsly" style="width: 150px; height: 18px" value="<%=ptjb%>"/></td>
						<td class="labels">所在市，县（区）:</td>
						<td width="200px"><font color=red>*</font>
						<input maxlength="30" type="text" name="xq" style="width: 150px; height: 18px" value="<%=xq%>"//></td>
					</tr>
				</table>
			</div>
			<hr>
			<div id="div5">
				<table>
					<tr>
						<td rowspan="1" width="250px" style="font-size: 16px">平台组织形态:</td>
						<td width="200px">
						<input maxlength="30" type="text" name="pzwh" style="width: 150px; height: 18px" value="<%=ptxt1%>"/></td>
						<td width="200px">
						<input maxlength="30" type="text" name="pzwh" style="width: 150px; height: 18px" value="<%=ptxt2%>"/></td>
						<td width="200px">
						<input maxlength="30" type="text" name="pzwh" style="width: 150px; height: 18px" value="<%=ptxt3%>"/></td>
					</tr>	
				</table>
			</div>
			<hr>

			<div id="div6">
			<table>
			    <tr>
			       <td rowspan="1" width="250px" style="font-size: 16px">服务的主要国民经济行业</td>
			       <td width="950px">
				   <input maxlength="30" type="text" name="pzwh" style="width: 500px; height: 18px" value="<%=wfhy%>"/></td>
				  </tr>
			</table>		
			</div>
			<hr>
			<div id="div7">
              <table>
			    <tr>
			       <td rowspan="1" width="250px" style="font-size: 16px">服务的主要学科</td>
			       <td width="950px">
				    <input maxlength="30" type="text" name="pzwh" style="width: 500px; height: 18px" value="<%=ssxk%>"/></td>
				 </tr>
			</table>
			</div>
			<hr>
			<div id="div8">
				<span style="color: red; heignt: 10px"><font size=2px color=red>依托单位的信息</font></span>
				<br>
				<table cellpadding="0" cellspacing="0">
					<tr>
						<td class="labels">单位名称:</td>
						<td width="200px"><input type="text" name="ytdw"style="width: 100px; height: 18px" value="<%=ytdw%>"/></td>
						<td class="labels">机构代码:</td>
						<td width="200px"><input type="text" name="ytdwdm"style="width: 100px; height: 18px" value="<%=ytdwdm%>"/></td>
						<td class="labels">法人代表姓名:</td>
						<td width="200px"><input type="text" name="ytdwfr"style="width: 100px; height: 18px" value="<%=ytdwfr%>"/></td>
						<td class="labels">依托单位纳税地区划代码:</td>
						<td width="150px"><input type="text" name="nsdm"style="width: 100px; height: 18px" value="<%=nsdm%>"/></td>
					</tr>
					<tr>
					  <td style="height: 18px">&nbsp;</td>
					 </tr>
				</table>
			</div>
			<div id="div10">
				<table cellpadding="1" cellspacing="0">
					<tr>
						<td class="labels">办公电话:</td>
						<td width="300px"><input type="text" name="bgdh"style="width: 200px; height: 18px" value="<%=bgdh%>"/></td>
						<td class="labels">依托单位类型:</td>
						<td width="600px">
				   <input maxlength="30" type="text" name="pzwh" style="width: 500px; height: 18px" value="<%=ytdwlx%>"/></td>
					</tr>
				</table>
			</div>
			<hr>
			<div id="div11">
				<div id="InputsWrapper">
				<table>
				  <tr>
				    <td rowspan="1" width="250px" style="font-size: 16px">共建单位</td>
			       <td width="950px">
				   <input maxlength="30" type="text" name="pzwh" style="width: 500px; height: 18px" value="<%=gjdw%>"/></td> 
				 </tr>
				</table>
				</div>
			</div>
			<hr>
			<div id="div12">
				<span style="color: red"><font size=2px color=red>平台主任的信息</font></span>
				<table>
					<td class="labels" width="80px">姓名:</td>
						<td><font color=red>*</font>
						<input type="text"  style="width: 100px; height: 18px" name="ptzr" maxlength="30" value="<%=ptzr%>"/></td>
						<td class="labels" width="80px">性别：</td>
                        <td><font color=red>*</font>
						<input type="text"  style="width: 100px; height: 18px" name="ptzr" maxlength="30" value="<%=sex%>"/></td>
						<td class="labels" width="150px">出生年月:</td>
						<td ><font color=red>*</font>
						<input type="text"  style="width: 100px; height: 18px" name="ptzr" maxlength="30" value="<%=birth%>"/></td>
						<td class="labels" width="80px">职称:</td>
						<td width="100px">
						<input type="text" maxlength="30" style="width: 100px; height: 18px" name="zhichen" value="<%=zhichen%>"/></td>
					</tr>
					<tr>
						<td class="labels">所学专业:</td>
						<td width="220px"><font color=red>*</font>
						<input  maxlength="30" type="text" style="width: 200px; height: 18px" name="zhuanye" value="<%=zhuanye%>"/></td>
						<td class="labels">学历:</td>
						<td width="220px"><font color=red>*</font>
						<input type="text" maxlength="30" style="width: 200px; height: 18px" name="xueli" value="<%=xueli%>"/></td>
						<td class="labels">学位:</td>
						<td width="220px"><font color=red>*</font>
						<input type="text" axlength="30"style="width: 200px; height: 18px" name="xuewei" value="<%=xuewei%>"/></td>
					</tr>
					<tr>
						<td class="labels">办公电话:</td>
						<td width="360px"><font color=red>*</font>
						<input type="text" maxlength="30" style="width: 200px; height: 18px" name="bgphone" value="<%=bgphone%>"/></td>
						<td class="labels">手机:</td>
						<td width="340px"><font color=red>*</font>
						<input type="text" maxlength="30" style="width: 200px; height: 18px" name="phone" value="<%=phone%>"/></td>
						<td class="labels">E-mail:</td>
						<td width="340px"><font color=red>*</font>
						<input type="email" maxlength="30" style="width: 200px; height: 18px" name="email" value="<%=email%>"/></td>
					</tr>
				</table>
			</div>
			<hr>
			<div id="div13">
				<table>
					<tr>
						<td class="labels">平台网站名称:</td>
						<td width="340px"><input type="text" name="ptwz"style="width: 200px; height: 18px" value="<%=ptwz%>"/></td>
						<td class="labels">网址:</td>
						<td width="320px"><input type="text" name="wz"style="width: 200px; height: 18px" value="<%=wz%>"/></td>
					</tr>
					<tr>
						<td class="labels">平台通讯地址:</td>
						<td width="340px"><input type="text" name="pttxdz"style="width: 200px; height: 18px" value="<%=pttxdz%>"/></td>
						<td class="labels">邮编:</td>
						<td width="340px"><input type="text" name="yb"style="width: 200px; height: 18px" value="<%=yb%>"/></td>
					</tr>
					<tr></tr>
				</table>
			</div>
		</form>
	</div>
</body>
</html>
