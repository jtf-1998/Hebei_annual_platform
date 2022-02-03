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

@WebServlet("/hebei/query/SearchAllServlet")
public class SearchAllServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public SearchAllServlet() {
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
		String value=request.getParameter("value");
		List<NianBao> nbs=querynb.querynball(value);
		  for(NianBao nb:nbs)
		  {
			  int id=nb.getId();
			  if(exit(id)!=0)
			  {
				List<Ptzr> pts=querynb.queryptzrall(value);

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
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException 
	{
		doGet(request, response);
	}

}
