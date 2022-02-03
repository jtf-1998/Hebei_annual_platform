package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.Login;
import service.LoginService;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
	public LoginServlet()
    {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException 
	{
		request.setCharacterEncoding("utf-8");
		int id=new Integer(request.getParameter("id"));
		Cookie cookie =new Cookie("id", request.getParameter("id")); 
		response.addCookie(cookie);
		int password=new Integer(request.getParameter("password"));
		Login login=new Login(id,password);
		LoginService loginservice=new LoginService();
		int result= loginservice.Login(login);
		switch (result)
		{
		case 1:  response.sendRedirect("./hebei/index.jsp"); //如果输入信息准确
		
		break;
		case -1:  response.sendRedirect("login.jsp?result=-1"); //如果输入信息不正确 
		break;
		case -2:  response.sendRedirect("login.jsp?result=-2");   //如果系统异常
		break;
		case -3: response.sendRedirect("login.jsp?result=-3");   //如果平台编号不存在
		break;
		default:
			break;
		}
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException 
	{
		doGet(request, response);
	}

}
