package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.YanjiuJiegou;
import service.AddYanjiuService;

@WebServlet("/hebei/AddYanjiuServlet")
public class AddYanjiuServlet extends HttpServlet 
{
	private static final long serialVersionUID = 1L;

    public AddYanjiuServlet() 
    {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException
	{
		request.setCharacterEncoding("utf-8");
		int id=Integer.parseInt(request.getParameter("id"));
        String yjfx=request.getParameter("yjfx");
        String yjnr=request.getParameter("yjnr");
        String gzjg=request.getParameter("gzjg");
        String jcjg=request.getParameter("jcjg");
        String jcdj=request.getParameter("jcdj");
        String pdbm=request.getParameter("pdbm");
        String zssc=request.getParameter("zssc");
        String szdw=request.getParameter("szdw");
        String fwxm=request.getParameter("fwxm");
        String fwnr=request.getParameter("fwnr");
  	   YanjiuJiegou yanjiu=new YanjiuJiegou(id, yjfx, yjnr, gzjg, jcjg, jcdj, pdbm, zssc, szdw, fwxm, fwnr);
  	   AddYanjiuService add=new AddYanjiuService();
  	   boolean result=add.addYanjiu(yanjiu);
  	   if(result)  request.getRequestDispatcher("index.jsp").forward(request, response);
  	   else   response.sendRedirect("yanjiu.jsp?result=-1");
  	  
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException 
	{
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
