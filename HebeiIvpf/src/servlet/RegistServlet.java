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

/**
 * Servlet implementation class RegistServlet
 */
@WebServlet("/RegistServlet")
public class RegistServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public RegistServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException 
	{
		request.setCharacterEncoding("utf-8");
		int id=new Integer(request.getParameter("id"));
		int password=new Integer(request.getParameter("password"));
		System.out.println(id);
		Login login=new Login(id,password);
		LoginService loginservice=new LoginService();
		int result= loginservice.Register(login);
		System.out.println(result);
		if(result==-3)
		{
			response.sendRedirect("zhuce.jsp?result=-3");
		}
		else 
			response.sendRedirect("login.jsp"); //如果输入信息准确
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException 
	{
		doGet(request, response);
	}

}
