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
import dao.QueryNianBao;
import service.QueryNianBaoService;

@WebServlet("/hebei/query/SeachNbServlet")
public class SeachNbServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public SeachNbServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

    public int exit(int id)   //根据平台账号查询是否存在 如果存在返回id，不存在返回0
	  {
    	QueryNianBao querynb=new QueryNianBao();
	      return querynb.querynb(id)==null?0:id;
	  }
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException
	{
		request.setCharacterEncoding("utf-8");
		QueryNianBaoService querynb=new QueryNianBaoService();
		String select=request.getParameter("select");
		int id=0;
		if(select.equals("id"))
		{
		  String vl=request.getParameter("value");
		  if(vl==null||vl.length()==0)
		  {
			  id=-1;
			  request.getRequestDispatcher("/hebei/query/querynb.jsp?id=-1").forward(request, response);
		  }
		  else {
			  int value=Integer.parseInt(vl);
			  List<NianBao> nbs=querynb.querynb(value);
			  for(NianBao nb:nbs)
			  {
				  id=nb.getId();
				  if(exit(id)!=0)
					 {
					List<Ptzr> pts=querynb.queryptzr(value);
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
		else if(select.equals("ptzr"))
		{
		  String value=request.getParameter("value");
		  if(value==null||value.length()==0)
		  {
			  id=-1;
			  request.getRequestDispatcher("/hebei/query/querynb.jsp?id=-1").forward(request, response);
		  }
		  else {
			  List<Ptzr> pts=querynb.searchptzr(value);
			  for(Ptzr pt:pts)
			  {
					 id=pt.getId();	
					 if(exit(id)!=0)
					 {
					List<NianBao> nbs=querynb.querynianbao(id);
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
		else if(select.equals("ptmc"))
		{
		  String value=request.getParameter("value");
		  if(value==null||value.length()==0)
		  {
			  id=-1;
			  request.getRequestDispatcher("/hebei/query/querynb.jsp?id=-1").forward(request, response);
		  }
		  else {
			  List<NianBao> nbs=querynb.searchptmc(value);
			  for(NianBao nb:nbs)
			  {
				  id=nb.getId();
				  if(exit(id)!=0)
					 {
					List<Ptzr> pts=querynb.queryptzr(id);
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
		else if(select.equals("time"))
		{
			String low=request.getParameter("low_time");
			String high=request.getParameter("high_time");
			List<NianBao> nbs=querynb.searchptny(low, high);
			for(NianBao nb:nbs)
			{
				 id=nb.getId();	
				 if(exit(id)!=0)
				 {
				 List<Ptzr> pts=querynb.queryptzr(id);
	           request.setAttribute("nbs", nbs);
	            request.setAttribute("pts",pts);
	          request.getRequestDispatcher("/hebei/list/listnb.jsp").forward(request, response);
				 }
				 else
				 {
					 request.getRequestDispatcher("/hebei/query/querynb.jsp?id=0").forward(request, response);
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
