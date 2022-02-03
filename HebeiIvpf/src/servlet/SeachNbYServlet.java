package servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.NianBao;
import bean.Ptzr;
import service.QueryNianBaoService;


@WebServlet("/hebei/query/SeachNbYServlet")
public class SeachNbYServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public SeachNbYServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException 
	{
		request.setCharacterEncoding("utf-8");
		String value1=request.getParameter("value1");
		String value2=request.getParameter("value2");
		String value3=request.getParameter("value3");
		String low=request.getParameter("low_time");
		String high=request.getParameter("high_time");
		QueryNianBaoService querynb=new QueryNianBaoService();
		SeachNbServlet searchnb=new SeachNbServlet();
		int id=0;
		if((value1==null||value1.length()==0)&&(value2==null||value2.length()==0)&&(value3==null||value3.length()==0)&&(low==null||low.length()==0)&&(high==null||high.length()==0))
		{

			id=-1;
			request.getRequestDispatcher("/hebei/query/querynb.jsp?id=-1").forward(request, response);
		}
		else
		{
			if(value1=="")
			{
				int vl=0;
				List<NianBao> nbs= querynb.searchall(vl,value2, value3, low, high);
				for(NianBao nb:nbs)
				{
					id=nb.getId();
					if(searchnb.exit(id)!=0)
					 {
					 List<Ptzr> pts=querynb.searchptzr(value2);
		           request.setAttribute("nbs", nbs);
		            request.setAttribute("pts",pts);
		          request.getRequestDispatcher("/hebei/list/listnb.jsp").forward(request, response);
					 }
					 else {
						 request.getRequestDispatcher("/hebei/query/querynb.jsp?id=0").forward(request, response);
					 }
				}
			}
			else
			{
				int vl=Integer.parseInt(value1);
				List<NianBao> nbs= querynb.searchall(vl,value2, value3, low, high);
				for(NianBao nb:nbs)
				{
					id=nb.getId();
					if(searchnb.exit(id)!=0)
					 {
					 List<Ptzr> pts=querynb.searchptzr(value2);
		           request.setAttribute("nbs", nbs);
		            request.setAttribute("pts",pts);
		          request.getRequestDispatcher("/hebei/list/listnb.jsp").forward(request, response);
					 }
					 else {
						 request.getRequestDispatcher("/hebei/query/querynb.jsp?id=0").forward(request, response);
					 }
				}
			}			
			 
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException 
	{
		doGet(request, response);
	}

}
