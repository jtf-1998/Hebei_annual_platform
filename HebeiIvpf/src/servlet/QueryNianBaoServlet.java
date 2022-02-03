package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.NianBao;
import bean.Ptzr;
import service.QueryNianBaoService;

@WebServlet("/hebei/query/QueryNianBaoServlet")
public class QueryNianBaoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public QueryNianBaoServlet() 
    {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException 
	{
		request.setCharacterEncoding("utf-8");
		QueryNianBaoService querynb=new QueryNianBaoService();
		int id=Integer.parseInt(request.getParameter("id"));
		NianBao nb=querynb.querynianb(id);
		Ptzr pt=querynb.queryzr(id);
        request.setAttribute("nb", nb);
        request.setAttribute("pt",pt);
        request.getRequestDispatcher("/hebei/list/listnianbao.jsp").forward(request, response);
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException
	{
		doGet(request, response);
	}

}
