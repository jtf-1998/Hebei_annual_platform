package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.NianBao;
import bean.Ptzr;
import dao.AddNianBao;
import dao.AddPtzr;

@WebServlet("/hebei/AddNianBaoServlet")
public class AddNianBaoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public AddNianBaoServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException 
	{
        request.setCharacterEncoding("utf-8");
		String name=request.getParameter("name");
		String idt=(String)request.getParameter("id");
		int id=new Integer(idt);
		String pzny=request.getParameter("pzny");
		int pzwh=new Integer(request.getParameter("pzwh"));
		String jsly=request.getParameter("jsly");
		String ptjb=request.getParameter("ptjb");
		String xq=request.getParameter("xq");
		String[] ptxtt=request.getParameterValues("ptxt1");
		String ptxt1="";
		if(ptxtt.length>0)
		{
			for(int i=0;i<ptxtt.length;i++)
			{
				ptxt1=ptxt1+ptxtt[i]+",";
			}
		}

		String ptxt2=request.getParameter("ptxt2");
		String ptxt3=request.getParameter("ptxt3");
		String wfhy1=request.getParameter("wfhy1");
		String wfhy2=request.getParameter("wfhy2");
		String wfhy3=request.getParameter("wfhy3");
		String wfhy=wfhy1+","+wfhy2+","+wfhy3;
		String ssxk1=request.getParameter("ssxk1");
		String ssxk2=request.getParameter("ssxk2");
		String ssxk3=request.getParameter("ssxk3");
		String ssxk=ssxk1+","+ssxk2+","+ssxk3;
		String ytdw=request.getParameter("ytdw");
		int ytdwdm=new Integer(request.getParameter("ytdwdm"));
		String ytdwfr=request.getParameter("ytdwfr");
		String bgdh=request.getParameter("bgdh");
		String ytdwlx=request.getParameter("ytdwlx");
		int nsdm=new Integer(request.getParameter("nsdm"));
		String gjdw1=request.getParameter("gjdw1");
		String gjdw2=request.getParameter("gjdw2");
		String gjdw3=request.getParameter("gjdw3");
		String gjdw4=request.getParameter("gjdw4");
		String gjdw=gjdw1+","+gjdw2+","+gjdw3+","+gjdw4;
		String ptwz=request.getParameter("ptwz");
		String wz=request.getParameter("wz");
		String pttxdz=request.getParameter("pttxdz");
		String ptzr=request.getParameter("ptzr");
		int yb=new Integer(request.getParameter("yb"));
		String sex=request.getParameter("sex");
		String birth=request.getParameter("birth");
		String zhichen=request.getParameter("zhichen");
		String zhuanye=request.getParameter("zhuanye");
		String xueli=request.getParameter("xueli");
		String xuewei=request.getParameter("xuewei");
		String bgphone=request.getParameter("bgphone");
		String phone=request.getParameter("phone");
		String email=request.getParameter("e-mail");
		NianBao nianbao=new NianBao(name, id, pzny, pzwh, jsly, ptjb, xq, ptxt1, ptxt2, ptxt3, wfhy, ssxk, ytdw, ytdwdm, ytdwfr, bgdh, ytdwlx, nsdm, gjdw, ptwz, wz, pttxdz, ptzr, yb);
		Ptzr ptzrbean=new Ptzr(id, ptzr, sex, birth, zhichen, zhuanye, xueli, xuewei, bgphone, phone, email);
		AddNianBao addniaobao=new AddNianBao();
		AddPtzr addptzr=new AddPtzr();
		addniaobao.Add(nianbao);
		addptzr.Add(ptzrbean);
	    request.getRequestDispatcher("index.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException 
	{
		doGet(request, response);
	}

}
