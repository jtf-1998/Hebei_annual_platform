package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.YongfangYiqi;
import dao.AddYfyq;

@WebServlet("/hebei/AddYfyqServlet")
public class AddYfyqServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public AddYfyqServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException
	{
		request.setCharacterEncoding("utf-8");
		int id=Integer.parseInt(request.getParameter("id"));
		String jzmj=request.getParameter("jzmj");
		String jzbh=request.getParameter("jzbh");
		String kymj=request.getParameter("kymj");
		String kybh=request.getParameter("kybh");
		String bgmj=request.getParameter("bgmj");
		String bgbh=request.getParameter("bgbh");
		String qtmj=request.getParameter("qtmj");
		String qtbh=request.getParameter("qtbh");
		int yq=Integer.parseInt(request.getParameter("yq"));
		String yqbh=request.getParameter("yqbh");
		String yz=request.getParameter("yz");
		String yzbh=request.getParameter("yzbh");
		YongfangYiqi yfyq=new YongfangYiqi(id, jzmj, jzbh, kymj, kybh, bgmj, bgbh, qtmj, qtbh, yq, yqbh, yz, yzbh);
		AddYfyq add=new AddYfyq();
		boolean result= add.Add(yfyq);
		if(result==true)   request.getRequestDispatcher("index.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException
	{
		doGet(request, response);
	}

}
