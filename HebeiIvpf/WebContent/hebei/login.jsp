<%@ page language="java" contentType="text/html; charset=UTF-8" 
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>admin登录判断</title>
</head>
<body>
<%
 String html_head = "<html>\n" +
        "<head>\n" +
        "    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n" +
        "    <title>Title</title>\n" +
        "</head>\n" +
        "<body>\n";
 String html_tail="</body>\n"+"</html>";
response.setCharacterEncoding("UTF-8");
response.setContentType("text/html;charset=UTF-8");
  String name=request.getParameter("username");
  String password=request.getParameter("password");
  if(name.equals("admin")&&password.equals("aaa123456"))
	  response.sendRedirect("./indext.jsp"); //如果输入信息准确
  else
	  out.print(html_head + "<script>alert('用户名或密码错误');history.go(-1);</script>" + html_tail);
%>
</body>
</html>