package servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.YanjiuJiegou;
import dao.QueryYanjiu;

@WebServlet("/hebei/QueryYanjiuServlet")
public class QueryYanjiuServlet extends HttpServlet
{
	private static final long serialVersionUID = 1L;

    public QueryYanjiuServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException 
	{
		request.setCharacterEncoding("utf-8");
		QueryYanjiu dao=new QueryYanjiu();
		List<YanjiuJiegou> yanjius=dao.queryall();
		request.setAttribute("yanjius", yanjius);
		request.getRequestDispatcher("/hebei/list/listyanjiu.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException 
	{
		doGet(request, response);
	}

}
