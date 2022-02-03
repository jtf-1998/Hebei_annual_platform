package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import bean.NianBao;
import bean.Ptzr;
public class QueryNianBao 
{
	  private static String DriverName="com.mysql.jdbc.Driver";
	  private static String UName="root";
	  private static String Upwd="1108.shjzh..sql.lq";
	  private static String Url="jdbc:mysql://localhost:3306/hebeipt?useUnicode=true&characterEncoding=UTF-8";  
	  public List<NianBao> searchall(int id ,String ptzr,String name,String low,String high)   //根据平台编号，平台名称，批准年月的范围多条件查询
	  {
		  List<NianBao> nianbaos=new ArrayList<NianBao>();
		  NianBao nianbao=null;
	      Connection conn=null;
	      PreparedStatement pstmt=null;
	      ResultSet result=null;
	      try {
	          Class.forName(DriverName);
	          conn=DriverManager.getConnection(Url, UName, Upwd);
	          if(id!=0&&low!=""&&high!="")
	          {
	        	  String sql="SELECT * FROM nbtj WHERE name like ? and  id=? and ptzr like ?  and pzny BETWEEN ? AND ? ";
		          pstmt= conn.prepareStatement(sql);
		          pstmt.setString(1,"%"+name+"%");

			      pstmt.setInt(2,id);
		          pstmt.setString(3,"%"+ptzr+"%");

		          pstmt.setString(4,low);
		          pstmt.setString(5,high);
		          result=pstmt.executeQuery();
		             while(result.next())
		             {
		        	     name=result.getString("name"); //平台名称
		        	     id=result.getInt("id");   //平台编号   
		        		 String pzny=result.getString("pzny"); //批准年月
		        		 int pzwh=result.getInt("pzwh");   //批准文号
		        		 String jsly=result.getString("jsly");  //技术领域
		        		 String ptjb=result.getString("ptjb");  //平台级别
		        		 String xq=result.getString("xq");   //所在县区
		        		 String ptxt1=result.getString("ptxt1"); //平台组织形态1
		        		 String ptxt2=result.getString("ptxt2");  //平台组织形态2
		        		 String ptxt3=result.getString("ptxt3");  //平台组织形态3
		        		 String wfhy=result.getString("wfhy");  //服务主要行业
		        		 String ssxk=result.getString("ssxk");   //服务的主要学科
		        		 String ytdw=result.getString("ytdw");  //依托单位名称
		        		 int ytdwdm=result.getInt("ytdwdm");  //依托单位代码
		        		 String ytdwfr=result.getString("ytdwfr");  //依托单选法人
		        		 String bgdh=result.getString("bgdh");  //依托单位办公电话
		        		 String ytdwlx=result.getString("ytdwlx");  //依托单位类型
		        		 int nsdm=result.getInt("nsdm");    //依托单位纳税代码
		        	     String gjdw=result.getString("gjdw");  //共建单位
		        		 String ptwz=result.getString("ptwz");   //平台网站名称
		        		 String wz=result.getString("wz");   //平台网址
		        		 String pttxdz=result.getString("pttxdz");  //平台通讯地址
		        		  ptzr=result.getString("ptzr");   //平台主任
		        		 int yb=result.getInt("yb"); 
		                 nianbao=new NianBao(name, id, pzny, pzwh, jsly, ptjb, xq, ptxt1, ptxt2, ptxt3, wfhy, ssxk, ytdw, ytdwdm, ytdwfr, bgdh, ytdwlx, nsdm, gjdw, ptwz, wz, pttxdz, ptzr, yb);
		                 nianbaos.add(nianbao);
		             }
	          }
	          else if(id==0&&low!=""&&high!="")
	          {
	        	  String sql="SELECT * FROM nbtj WHERE name like ?  and ptzr like ?  and pzny BETWEEN ? AND ? ";
		          pstmt= conn.prepareStatement(sql);
		          pstmt.setString(1,"%"+name+"%");

		          pstmt.setString(2,"%"+ptzr+"%");

		          pstmt.setString(3,low);
		          pstmt.setString(4,high);
		          result=pstmt.executeQuery();
		             while(result.next())
		             {
		        	     name=result.getString("name"); //平台名称
		        	     id=result.getInt("id");   //平台编号   
		        		 String pzny=result.getString("pzny"); //批准年月
		        		 int pzwh=result.getInt("pzwh");   //批准文号
		        		 String jsly=result.getString("jsly");  //技术领域
		        		 String ptjb=result.getString("ptjb");  //平台级别
		        		 String xq=result.getString("xq");   //所在县区
		        		 String ptxt1=result.getString("ptxt1"); //平台组织形态1
		        		 String ptxt2=result.getString("ptxt2");  //平台组织形态2
		        		 String ptxt3=result.getString("ptxt3");  //平台组织形态3
		        		 String wfhy=result.getString("wfhy");  //服务主要行业
		        		 String ssxk=result.getString("ssxk");   //服务的主要学科
		        		 String ytdw=result.getString("ytdw");  //依托单位名称
		        		 int ytdwdm=result.getInt("ytdwdm");  //依托单位代码
		        		 String ytdwfr=result.getString("ytdwfr");  //依托单选法人
		        		 String bgdh=result.getString("bgdh");  //依托单位办公电话
		        		 String ytdwlx=result.getString("ytdwlx");  //依托单位类型
		        		 int nsdm=result.getInt("nsdm");    //依托单位纳税代码
		        	     String gjdw=result.getString("gjdw");  //共建单位
		        		 String ptwz=result.getString("ptwz");   //平台网站名称
		        		 String wz=result.getString("wz");   //平台网址
		        		 String pttxdz=result.getString("pttxdz");  //平台通讯地址
		        		  ptzr=result.getString("ptzr");   //平台主任
		        		 int yb=result.getInt("yb"); 
		                 nianbao=new NianBao(name, id, pzny, pzwh, jsly, ptjb, xq, ptxt1, ptxt2, ptxt3, wfhy, ssxk, ytdw, ytdwdm, ytdwfr, bgdh, ytdwlx, nsdm, gjdw, ptwz, wz, pttxdz, ptzr, yb);
		                 nianbaos.add(nianbao);
		             }
	          }
	          else if(id==0&&low==""&&high=="")
	          {
	        	  String sql="SELECT * FROM nbtj WHERE name like ?  and ptzr like ? ";
		          pstmt= conn.prepareStatement(sql);
		          pstmt.setString(1,"%"+name+"%");
		          pstmt.setString(2,"%"+ptzr+"%");
		          result=pstmt.executeQuery();
		             while(result.next())
		             {
		        	     name=result.getString("name"); //平台名称
		        	     id=result.getInt("id");   //平台编号   
		        		 String pzny=result.getString("pzny"); //批准年月
		        		 int pzwh=result.getInt("pzwh");   //批准文号
		        		 String jsly=result.getString("jsly");  //技术领域
		        		 String ptjb=result.getString("ptjb");  //平台级别
		        		 String xq=result.getString("xq");   //所在县区
		        		 String ptxt1=result.getString("ptxt1"); //平台组织形态1
		        		 String ptxt2=result.getString("ptxt2");  //平台组织形态2
		        		 String ptxt3=result.getString("ptxt3");  //平台组织形态3
		        		 String wfhy=result.getString("wfhy");  //服务主要行业
		        		 String ssxk=result.getString("ssxk");   //服务的主要学科
		        		 String ytdw=result.getString("ytdw");  //依托单位名称
		        		 int ytdwdm=result.getInt("ytdwdm");  //依托单位代码
		        		 String ytdwfr=result.getString("ytdwfr");  //依托单选法人
		        		 String bgdh=result.getString("bgdh");  //依托单位办公电话
		        		 String ytdwlx=result.getString("ytdwlx");  //依托单位类型
		        		 int nsdm=result.getInt("nsdm");    //依托单位纳税代码
		        	     String gjdw=result.getString("gjdw");  //共建单位
		        		 String ptwz=result.getString("ptwz");   //平台网站名称
		        		 String wz=result.getString("wz");   //平台网址
		        		 String pttxdz=result.getString("pttxdz");  //平台通讯地址
		        		  ptzr=result.getString("ptzr");   //平台主任
		        		 int yb=result.getInt("yb"); 
		                 nianbao=new NianBao(name, id, pzny, pzwh, jsly, ptjb, xq, ptxt1, ptxt2, ptxt3, wfhy, ssxk, ytdw, ytdwdm, ytdwfr, bgdh, ytdwlx, nsdm, gjdw, ptwz, wz, pttxdz, ptzr, yb);
		                 nianbaos.add(nianbao);
		             }
	          }
	          else if(id!=0&&low==""&&high=="")
	          {
	        	  String sql="SELECT * FROM nbtj WHERE name like ? and  id=? and ptzr like ?   ";
		          pstmt= conn.prepareStatement(sql);
		          pstmt.setString(1,"%"+name+"%");
		          if(id==0)
		          {
		        	  String idt=null;
		        	  pstmt.setString(2, idt);
		          }
		          else
		          {
			          pstmt.setInt(2,id);
		          }
		          pstmt.setString(3,"%"+ptzr+"%");
		          result=pstmt.executeQuery();
		             while(result.next())
		             {
		        	     name=result.getString("name"); //平台名称
		        	     id=result.getInt("id");   //平台编号   
		        		 String pzny=result.getString("pzny"); //批准年月
		        		 int pzwh=result.getInt("pzwh");   //批准文号
		        		 String jsly=result.getString("jsly");  //技术领域
		        		 String ptjb=result.getString("ptjb");  //平台级别
		        		 String xq=result.getString("xq");   //所在县区
		        		 String ptxt1=result.getString("ptxt1"); //平台组织形态1
		        		 String ptxt2=result.getString("ptxt2");  //平台组织形态2
		        		 String ptxt3=result.getString("ptxt3");  //平台组织形态3
		        		 String wfhy=result.getString("wfhy");  //服务主要行业
		        		 String ssxk=result.getString("ssxk");   //服务的主要学科
		        		 String ytdw=result.getString("ytdw");  //依托单位名称
		        		 int ytdwdm=result.getInt("ytdwdm");  //依托单位代码
		        		 String ytdwfr=result.getString("ytdwfr");  //依托单选法人
		        		 String bgdh=result.getString("bgdh");  //依托单位办公电话
		        		 String ytdwlx=result.getString("ytdwlx");  //依托单位类型
		        		 int nsdm=result.getInt("nsdm");    //依托单位纳税代码
		        	     String gjdw=result.getString("gjdw");  //共建单位
		        		 String ptwz=result.getString("ptwz");   //平台网站名称
		        		 String wz=result.getString("wz");   //平台网址
		        		 String pttxdz=result.getString("pttxdz");  //平台通讯地址
		        		  ptzr=result.getString("ptzr");   //平台主任
		        		 int yb=result.getInt("yb"); 
		                 nianbao=new NianBao(name, id, pzny, pzwh, jsly, ptjb, xq, ptxt1, ptxt2, ptxt3, wfhy, ssxk, ytdw, ytdwdm, ytdwfr, bgdh, ytdwlx, nsdm, gjdw, ptwz, wz, pttxdz, ptzr, yb);
		                 nianbaos.add(nianbao);
		             }
	          }
	         
	          
	          return nianbaos;
	      }
	      catch(ClassNotFoundException e)
	      {
	          e.printStackTrace();
	          return null;
	      } 
	      catch (SQLException e) 
	      {
	        e.printStackTrace();
	        return null;
	    }
	      catch(Exception e)
	      {
	          e.printStackTrace();
	          return null;
	      }
	      finally {
	          try {
	              if(result!=null) result.close();
	              if(pstmt!=null) pstmt.close();
	              if(conn!=null) conn.close();
	          }
	          catch(SQLException e)
	          {
	              e.printStackTrace();
	          }
	      }
	  }
	  public List<NianBao> searchptny(String low,String high)  //根据批准年月的范围查询
	  {
		  List<NianBao>nianbaos=new ArrayList<NianBao>();
		  NianBao nianbao=null;
	      Connection conn=null;
	      PreparedStatement pstmt=null;
	      ResultSet result=null;
	      try {
	          Class.forName(DriverName);
	          conn=DriverManager.getConnection(Url, UName, Upwd);
	          String sql="SELECT * FROM nbtj WHERE pzny BETWEEN ? AND ?";
	          pstmt= conn.prepareStatement(sql);
	          pstmt.setString(1,low);
	          pstmt.setString(2,high);
	          result=pstmt.executeQuery();
	        	  while(result.next())
	        	  {
	        	     String name=result.getString("name"); //平台名称
	        	     int id=result.getInt("id");   //平台编号   
	        		 String pzny=result.getString("pzny"); //批准年月
	        		 int pzwh=result.getInt("pzwh");   //批准文号
	        		 String jsly=result.getString("jsly");  //技术领域
	        		 String ptjb=result.getString("ptjb");  //平台级别
	        		 String xq=result.getString("xq");   //所在县区
	        		 String ptxt1=result.getString("ptxt1"); //平台组织形态1
	        		 String ptxt2=result.getString("ptxt2");  //平台组织形态2
	        		 String ptxt3=result.getString("ptxt3");  //平台组织形态3
	        		 String wfhy=result.getString("wfhy");  //服务主要行业
	        		 String ssxk=result.getString("ssxk");   //服务的主要学科
	        		 String ytdw=result.getString("ytdw");  //依托单位名称
	        		 int ytdwdm=result.getInt("ytdwdm");  //依托单位代码
	        		 String ytdwfr=result.getString("ytdwfr");  //依托单选法人
	        		 String bgdh=result.getString("bgdh");  //依托单位办公电话
	        		 String ytdwlx=result.getString("ytdwlx");  //依托单位类型
	        		 int nsdm=result.getInt("nsdm");    //依托单位纳税代码
	        	     String gjdw=result.getString("gjdw");  //共建单位
	        		 String ptwz=result.getString("ptwz");   //平台网站名称
	        		 String wz=result.getString("wz");   //平台网址
	        		 String pttxdz=result.getString("pttxdz");  //平台通讯地址
	        		 String ptzr=result.getString("ptzr");   //平台主任
	        		 int yb=result.getInt("yb"); 
	                 nianbao=new NianBao(name, id, pzny, pzwh, jsly, ptjb, xq, ptxt1, ptxt2, ptxt3, wfhy, ssxk, ytdw, ytdwdm, ytdwfr, bgdh, ytdwlx, nsdm, gjdw, ptwz, wz, pttxdz, ptzr, yb); 
	                 nianbaos.add(nianbao);
	        	  }
	          return nianbaos;
	      }
	      catch(ClassNotFoundException e)
	      {
	          e.printStackTrace();
	          return null;
	      } 
	      catch (SQLException e) 
	      {
	        e.printStackTrace();
	        return null;
	    }
	      catch(Exception e)
	      {
	          e.printStackTrace();
	          return null;
	      }
	      finally {
	          try {
	              if(result!=null) result.close();
	              if(pstmt!=null) pstmt.close();
	              if(conn!=null) conn.close();
	          }
	          catch(SQLException e)
	          {
	              e.printStackTrace();
	          }
	      }
	  }
	  public List<NianBao> searchnianbao(String name)   //根据平台名称查询平台年报
	  {
		  List<NianBao> nianbaos=new ArrayList<NianBao>();
		  NianBao nianbao=null;
	      Connection conn=null;
	      PreparedStatement pstmt=null;
	      ResultSet result=null;
	      try {
	          Class.forName(DriverName);
	          conn=DriverManager.getConnection(Url, UName, Upwd);
	          String sql="select * from nbtj where name like ?";
	          pstmt= conn.prepareStatement(sql);
	          pstmt.setString(1, "%"+name+"%");
	          result=pstmt.executeQuery();
	        	  while(result.next())
	        	  {
	        	     name=result.getString("name");
	        	     int id=result.getInt("id");   //平台编号   
	        		 String pzny=result.getString("pzny"); //批准年月
	        		 int pzwh=result.getInt("pzwh");   //批准文号
	        		 String jsly=result.getString("jsly");  //技术领域
	        		 String ptjb=result.getString("ptjb");  //平台级别
	        		 String xq=result.getString("xq");   //所在县区
	        		 String ptxt1=result.getString("ptxt1"); //平台组织形态1
	        		 String ptxt2=result.getString("ptxt2");  //平台组织形态2
	        		 String ptxt3=result.getString("ptxt3");  //平台组织形态3
	        		 String wfhy=result.getString("wfhy");  //服务主要行业
	        		 String ssxk=result.getString("ssxk");   //服务的主要学科
	        		 String ytdw=result.getString("ytdw");  //依托单位名称
	        		 int ytdwdm=result.getInt("ytdwdm");  //依托单位代码
	        		 String ytdwfr=result.getString("ytdwfr");  //依托单选法人
	        		 String bgdh=result.getString("bgdh");  //依托单位办公电话
	        		 String ytdwlx=result.getString("ytdwlx");  //依托单位类型
	        		 int nsdm=result.getInt("nsdm");    //依托单位纳税代码
	        	     String gjdw=result.getString("gjdw");  //共建单位
	        		 String ptwz=result.getString("ptwz");   //平台网站名称
	        		 String wz=result.getString("wz");   //平台网址
	        		 String pttxdz=result.getString("pttxdz");  //平台通讯地址
	        		 String ptzr=result.getString("ptzr");   //平台主任
	        		 int yb=result.getInt("yb"); 
	                 nianbao=new NianBao(name, id, pzny, pzwh, jsly, ptjb, xq, ptxt1, ptxt2, ptxt3, wfhy, ssxk, ytdw, ytdwdm, ytdwfr, bgdh, ytdwlx, nsdm, gjdw, ptwz, wz, pttxdz, ptzr, yb); 
	                 nianbaos.add(nianbao);
	        	  }
	          return nianbaos;
	      }
	      catch(ClassNotFoundException e)
	      {
	          e.printStackTrace();
	          return null;
	      } 
	      catch (SQLException e) 
	      {
	        e.printStackTrace();
	        return null;
	    }
	      catch(Exception e)
	      {
	          e.printStackTrace();
	          return null;
	      }
	      finally {
	          try {
	              if(result!=null) result.close();
	              if(pstmt!=null) pstmt.close();
	              if(conn!=null) conn.close();
	          }
	          catch(SQLException e)
	          {
	              e.printStackTrace();
	          }
	      }
	  }
	  public List<NianBao> querynb(int id)   //查询平台信息
	  {
		  List<NianBao> nianbaos=new ArrayList<NianBao>();
	      NianBao nianbao=null;
	      Connection conn=null;
	      PreparedStatement pstmt=null;
	      ResultSet result=null;
	      try {
	          Class.forName(DriverName);
	          conn=DriverManager.getConnection(Url, UName, Upwd);
	          String sql="select * from nbtj where id=?";
	          pstmt= conn.prepareStatement(sql);
	          pstmt.setInt(1, id);
	          result=pstmt.executeQuery();
	          if(result.next())
	          {
	        	     String name=result.getString("name");   //平台名称   
	        		 String pzny=result.getString("pzny"); //批准年月
	        		 int pzwh=result.getInt("pzwh");   //批准文号
	        		 String jsly=result.getString("jsly");  //技术领域
	        		 String ptjb=result.getString("ptjb");  //平台级别
	        		 String xq=result.getString("xq");   //所在县区
	        		 String ptxt1=result.getString("ptxt1"); //平台组织形态1
	        		 String ptxt2=result.getString("ptxt2");  //平台组织形态2
	        		 String ptxt3=result.getString("ptxt3");  //平台组织形态3
	        		 String wfhy=result.getString("wfhy");  //服务主要行业
	        		 String ssxk=result.getString("ssxk");   //服务的主要学科
	        		 String ytdw=result.getString("ytdw");  //依托单位名称
	        		 int ytdwdm=result.getInt("ytdwdm");  //依托单位代码
	        		 String ytdwfr=result.getString("ytdwfr");  //依托单选法人
	        		 String bgdh=result.getString("bgdh");  //依托单位办公电话
	        		 String ytdwlx=result.getString("ytdwlx");  //依托单位类型
	        		 int nsdm=result.getInt("nsdm");    //依托单位纳税代码
	        	     String gjdw=result.getString("gjdw");  //共建单位
	        		 String ptwz=result.getString("ptwz");   //平台网站名称
	        		 String wz=result.getString("wz");   //平台网址
	        		 String pttxdz=result.getString("pttxdz");  //平台通讯地址
	        		 String ptzr=result.getString("ptzr");   //平台主任
	        		 int yb=result.getInt("yb"); 
	                 nianbao=new NianBao(name, id, pzny, pzwh, jsly, ptjb, xq, ptxt1, ptxt2, ptxt3, wfhy, ssxk, ytdw, ytdwdm, ytdwfr, bgdh, ytdwlx, nsdm, gjdw, ptwz, wz, pttxdz, ptzr, yb);
	        	     nianbaos.add(nianbao);
	          }
	          else 
	          {
	        	  id=0;
	        	  nianbao=new NianBao(id);
	        	  nianbaos.add(nianbao);
	          }
	        	  
	          return nianbaos;
	      }
	      catch(ClassNotFoundException e)
	      {
	          e.printStackTrace();
	          return null;
	      } 
	      catch (SQLException e) 
	      {
	        e.printStackTrace();
	        return null;
	    }
	      catch(Exception e)
	      {
	          e.printStackTrace();
	          return null;
	      }
	      finally {
	          try {
	              if(result!=null) result.close();
	              if(pstmt!=null) pstmt.close();
	              if(conn!=null) conn.close();
	          }
	          catch(SQLException e)
	          {
	              e.printStackTrace();
	          }
	      }
	  }
	  public NianBao querynianb(int id)   //查询平台信息
	  {
	      NianBao nianbao=null;
	      Connection conn=null;
	      PreparedStatement pstmt=null;
	      ResultSet result=null;
	      try {
	          Class.forName(DriverName);
	          conn=DriverManager.getConnection(Url, UName, Upwd);
	          String sql="select * from nbtj where id=?";
	          pstmt= conn.prepareStatement(sql);
	          pstmt.setInt(1, id);
	          result=pstmt.executeQuery();
	          if(result.next())
	          {
	        	     String name=result.getString("name");   //平台名称   
	        		 String pzny=result.getString("pzny"); //批准年月
	        		 int pzwh=result.getInt("pzwh");   //批准文号
	        		 String jsly=result.getString("jsly");  //技术领域
	        		 String ptjb=result.getString("ptjb");  //平台级别
	        		 String xq=result.getString("xq");   //所在县区
	        		 String ptxt1=result.getString("ptxt1"); //平台组织形态1
	        		 String ptxt2=result.getString("ptxt2");  //平台组织形态2
	        		 String ptxt3=result.getString("ptxt3");  //平台组织形态3
	        		 String wfhy=result.getString("wfhy");  //服务主要行业
	        		 String ssxk=result.getString("ssxk");   //服务的主要学科
	        		 String ytdw=result.getString("ytdw");  //依托单位名称
	        		 int ytdwdm=result.getInt("ytdwdm");  //依托单位代码
	        		 String ytdwfr=result.getString("ytdwfr");  //依托单选法人
	        		 String bgdh=result.getString("bgdh");  //依托单位办公电话
	        		 String ytdwlx=result.getString("ytdwlx");  //依托单位类型
	        		 int nsdm=result.getInt("nsdm");    //依托单位纳税代码
	        	     String gjdw=result.getString("gjdw");  //共建单位
	        		 String ptwz=result.getString("ptwz");   //平台网站名称
	        		 String wz=result.getString("wz");   //平台网址
	        		 String pttxdz=result.getString("pttxdz");  //平台通讯地址
	        		 String ptzr=result.getString("ptzr");   //平台主任
	        		 int yb=result.getInt("yb"); 
	                 nianbao=new NianBao(name, id, pzny, pzwh, jsly, ptjb, xq, ptxt1, ptxt2, ptxt3, wfhy, ssxk, ytdw, ytdwdm, ytdwfr, bgdh, ytdwlx, nsdm, gjdw, ptwz, wz, pttxdz, ptzr, yb);

	          }
	          else 
	          {
	        	  id=0;
	        	  nianbao=new NianBao(id);

	          }
	        	  
	          return nianbao;
	      }
	      catch(ClassNotFoundException e)
	      {
	          e.printStackTrace();
	          return null;
	      } 
	      catch (SQLException e) 
	      {
	        e.printStackTrace();
	        return null;
	    }
	      catch(Exception e)
	      {
	          e.printStackTrace();
	          return null;
	      }
	      finally {
	          try {
	              if(result!=null) result.close();
	              if(pstmt!=null) pstmt.close();
	              if(conn!=null) conn.close();
	          }
	          catch(SQLException e)
	          {
	              e.printStackTrace();
	          }
	      }
	  }
	  public List<NianBao> querynianbao(int id)   //查询平台信息
	  {
		  List<NianBao> nianbaos=new ArrayList<NianBao>();
	      NianBao nianbao=null;
	      Connection conn=null;
	      PreparedStatement pstmt=null;
	      ResultSet result=null;
	      try {
	          Class.forName(DriverName);
	          conn=DriverManager.getConnection(Url, UName, Upwd);
	          String sql="select * from nbtj where id=?";
	          pstmt= conn.prepareStatement(sql);
	          pstmt.setInt(1, id);
	          result=pstmt.executeQuery();
	        	  while(result.next())
	        	  {
	        	     String name=result.getString("name");   //平台名称   
	        		 String pzny=result.getString("pzny"); //批准年月
	        		 int pzwh=result.getInt("pzwh");   //批准文号
	        		 String jsly=result.getString("jsly");  //技术领域
	        		 String ptjb=result.getString("ptjb");  //平台级别
	        		 String xq=result.getString("xq");   //所在县区
	        		 String ptxt1=result.getString("ptxt1"); //平台组织形态1
	        		 String ptxt2=result.getString("ptxt2");  //平台组织形态2
	        		 String ptxt3=result.getString("ptxt3");  //平台组织形态3
	        		 String wfhy=result.getString("wfhy");  //服务主要行业
	        		 String ssxk=result.getString("ssxk");   //服务的主要学科
	        		 String ytdw=result.getString("ytdw");  //依托单位名称
	        		 int ytdwdm=result.getInt("ytdwdm");  //依托单位代码
	        		 String ytdwfr=result.getString("ytdwfr");  //依托单选法人
	        		 String bgdh=result.getString("bgdh");  //依托单位办公电话
	        		 String ytdwlx=result.getString("ytdwlx");  //依托单位类型
	        		 int nsdm=result.getInt("nsdm");    //依托单位纳税代码
	        	     String gjdw=result.getString("gjdw");  //共建单位
	        		 String ptwz=result.getString("ptwz");   //平台网站名称
	        		 String wz=result.getString("wz");   //平台网址
	        		 String pttxdz=result.getString("pttxdz");  //平台通讯地址
	        		 String ptzr=result.getString("ptzr");   //平台主任
	        		 int yb=result.getInt("yb"); 
	                 nianbao=new NianBao(name, id, pzny, pzwh, jsly, ptjb, xq, ptxt1, ptxt2, ptxt3, wfhy, ssxk, ytdw, ytdwdm, ytdwfr, bgdh, ytdwlx, nsdm, gjdw, ptwz, wz, pttxdz, ptzr, yb);
	                 nianbaos.add(nianbao);
	        	  }
	        	  
	          return nianbaos;
	      }
	      catch(ClassNotFoundException e)
	      {
	          e.printStackTrace();
	          return null;
	      } 
	      catch (SQLException e) 
	      {
	        e.printStackTrace();
	        return null;
	    }
	      catch(Exception e)
	      {
	          e.printStackTrace();
	          return null;
	      }
	      finally {
	          try {
	              if(result!=null) result.close();
	              if(pstmt!=null) pstmt.close();
	              if(conn!=null) conn.close();
	          }
	          catch(SQLException e)
	          {
	              e.printStackTrace();
	          }
	      }
	  }
	  public  boolean isNumber(String value)
	  {  
	        String reg = "^[0-9]+(.[0-9]+)?$";  
	        return value.matches(reg);  
	    }  
	  public List<NianBao> querynianbaoall(String value)   //查询平台信息
	  {
		  List<NianBao> nianbaos=new ArrayList<NianBao>();
	      NianBao nianbao=null;
	      Connection conn=null;
	      PreparedStatement pstmt=null;
	      ResultSet result=null;
	      QueryNianBao query=new QueryNianBao();
	      try {
	          Class.forName(DriverName);
	          conn=DriverManager.getConnection(Url, UName, Upwd);
	          String sql="select * from nbtj where id like ? or name like ? or pzny like ? or pzwh like ? or jsly like ? or ptjb like ? or xq like ? or ptxt1 like ? or ptxt2 like ? "
	          		+ " or ptxt3 like ? or wfhy like ? or ssxk like ?  or ytdw like ? or ytdwdm like ? or ytdwfr like ? or bgdh like ? or ytdwlx like ?"
	          		+ " or gjdw like ? or ptwz like ? or wz like ? or pttxdz like ? or ptzr like ? or yb like ?";
	          pstmt= conn.prepareStatement(sql);
	          pstmt.setString(1, "%"+value+"%");
	          pstmt.setString(2, "%"+value+"%");
	          pstmt.setString(3, "%"+value+"%");
	          pstmt.setString(4, "%"+value+"%");
	          pstmt.setString(5, "%"+value+"%");
	          pstmt.setString(6, "%"+value+"%");
	          pstmt.setString(7, "%"+value+"%");
	          pstmt.setString(8, "%"+value+"%");
	          pstmt.setString(9, "%"+value+"%");
	          pstmt.setString(10, "%"+value+"%");
	          pstmt.setString(11, "%"+value+"%");
	          pstmt.setString(12, "%"+value+"%");
	          pstmt.setString(13, "%"+value+"%");
	          pstmt.setString(14, "%"+value+"%");
	          pstmt.setString(15, "%"+value+"%");
	          pstmt.setString(16, "%"+value+"%");
	          pstmt.setString(17, "%"+value+"%");
	          pstmt.setString(18, "%"+value+"%");
	          pstmt.setString(19, "%"+value+"%");
	          pstmt.setString(20, "%"+value+"%");
	          pstmt.setString(21, "%"+value+"%");
	          pstmt.setString(22, "%"+value+"%");
	          pstmt.setString(23, "%"+value+"%");
	          result=pstmt.executeQuery();
	        	  while(result.next())
	        	  {
	        		  int id=result.getInt("id");
	        	     String name=result.getString("name");   //平台名称   
	        		 String pzny=result.getString("pzny"); //批准年月
	        		 int pzwh=result.getInt("pzwh");   //批准文号
	        		 String jsly=result.getString("jsly");  //技术领域
	        		 String ptjb=result.getString("ptjb");  //平台级别
	        		 String xq=result.getString("xq");   //所在县区
	        		 String ptxt1=result.getString("ptxt1"); //平台组织形态1
	        		 String ptxt2=result.getString("ptxt2");  //平台组织形态2
	        		 String ptxt3=result.getString("ptxt3");  //平台组织形态3
	        		 String wfhy=result.getString("wfhy");  //服务主要行业
	        		 String ssxk=result.getString("ssxk");   //服务的主要学科
	        		 String ytdw=result.getString("ytdw");  //依托单位名称
	        		 int ytdwdm=result.getInt("ytdwdm");  //依托单位代码
	        		 String ytdwfr=result.getString("ytdwfr");  //依托单选法人
	        		 String bgdh=result.getString("bgdh");  //依托单位办公电话
	        		 String ytdwlx=result.getString("ytdwlx");  //依托单位类型
	        		 int nsdm=result.getInt("nsdm");    //依托单位纳税代码
	        	     String gjdw=result.getString("gjdw");  //共建单位
	        		 String ptwz=result.getString("ptwz");   //平台网站名称
	        		 String wz=result.getString("wz");   //平台网址
	        		 String pttxdz=result.getString("pttxdz");  //平台通讯地址
	        		 String ptzr=result.getString("ptzr");   //平台主任
	        		 int yb=result.getInt("yb"); 
	                 nianbao=new NianBao(name, id, pzny, pzwh, jsly, ptjb, xq, ptxt1, ptxt2, ptxt3, wfhy, ssxk, ytdw, ytdwdm, ytdwfr, bgdh, ytdwlx, nsdm, gjdw, ptwz, wz, pttxdz, ptzr, yb);
	                 nianbaos.add(nianbao);
	        	  }
	        	  
	          return nianbaos;
	      }
	      catch(ClassNotFoundException e)
	      {
	          e.printStackTrace();
	          return null;
	      } 
	      catch (SQLException e) 
	      {
	        e.printStackTrace();
	        return null;
	    }
	      catch(Exception e)
	      {
	          e.printStackTrace();
	          return null;
	      }
	      finally {
	          try {
	              if(result!=null) result.close();
	              if(pstmt!=null) pstmt.close();
	              if(conn!=null) conn.close();
	          }
	          catch(SQLException e)
	          {
	              e.printStackTrace();
	          }
	      }
	  }
	  public List<Ptzr> searchptzr(String ptzr)
	  {
		  List<Ptzr> ptzrbeans=new ArrayList<Ptzr>();
		  Ptzr ptzrbean=null;
	      Connection conn=null;
	      PreparedStatement pstmt=null;
	      ResultSet result=null;
	      try {
	          Class.forName(DriverName);
	          conn=DriverManager.getConnection(Url, UName, Upwd);
	          String sql="select * from ptzr where ptzr like ?";
	          pstmt= conn.prepareStatement(sql);
	          pstmt.setString(1, "%"+ptzr+"%");
	          result=pstmt.executeQuery();
	        	 while(result.next())
	        	 {
	        	   int id=result.getInt("id");  //平台编号
	        	   ptzr=result.getString("ptzr");
	        	   String sex=result.getString("sex");   //性别
	        	   String birth=result.getString("birth");  //出生年月
	        	   String zhichen=result.getString("zhichen"); //职称
	        	   String zhuanye=result.getString("zhuanye"); //专业
	        	   String xueli=result.getString("xueli"); //学历
	        	   String xuewei=result.getString("xuewei"); //学位
	        	   String bgphone=result.getString("bgphone"); //办公电话
	        	   String phone=result.getString("phone");  //电话
	        	   String email=result.getString("email"); //E-mail
	        	   ptzrbean=new Ptzr(id, ptzr, sex, birth, zhichen, zhuanye, xueli, xuewei, bgphone, phone, email) ;
	        	   ptzrbeans.add(ptzrbean);
	        	  }
       	   return ptzrbeans;
	      }
	      catch(ClassNotFoundException e)
	      {
	          e.printStackTrace();
	          return null;
	      } 
	      catch (SQLException e) 
	      {
	        e.printStackTrace();
	        return null;
	    }
	      catch(Exception e)
	      {
	          e.printStackTrace();
	          return null;
	      }
	      finally {
	          try {
	              if(result!=null) result.close();
	              if(pstmt!=null) pstmt.close();
	              if(conn!=null) conn.close();
	          }
	          catch(SQLException e)
	          {
	              e.printStackTrace();
	          }
	      } 
	  }
	  public Ptzr queryzr(int id)
	  {
		  Ptzr ptzrbean=null;
	      Connection conn=null;
	      PreparedStatement pstmt=null;
	      ResultSet result=null;
	      try {
	          Class.forName(DriverName);
	          conn=DriverManager.getConnection(Url, UName, Upwd);
	          String sql="select * from ptzr where id=?";
	          pstmt= conn.prepareStatement(sql);
	          pstmt.setInt(1, id);
	          result=pstmt.executeQuery();
	          if(result.next())
	          {
	        	   String ptzr=result.getString("ptzr");  //平台主任姓名
	        	   String sex=result.getString("sex");   //性别
	        	   String birth=result.getString("birth");  //出生年月
	        	   String zhichen=result.getString("zhichen"); //职称
	        	   String zhuanye=result.getString("zhuanye"); //专业
	        	   String xueli=result.getString("xueli"); //学历
	        	   String xuewei=result.getString("xuewei"); //学位
	        	   String bgphone=result.getString("bgphone"); //办公电话
	        	   String phone=result.getString("phone");  //电话
	        	   String email=result.getString("email"); //E-mail
	        	   ptzrbean=new Ptzr(id, ptzr, sex, birth, zhichen, zhuanye, xueli, xuewei, bgphone, phone, email) ;
 	          }
	          else
	          {
	        	  id=0;
	        	  ptzrbean=new Ptzr(id);
	          }
       	   return ptzrbean;
	      }
	      catch(ClassNotFoundException e)
	      {
	          e.printStackTrace();
	          return null;
	      } 
	      catch (SQLException e) 
	      {
	        e.printStackTrace();
	        return null;
	    }
	      catch(Exception e)
	      {
	          e.printStackTrace();
	          return null;
	      }
	      finally {
	          try {
	              if(result!=null) result.close();
	              if(pstmt!=null) pstmt.close();
	              if(conn!=null) conn.close();
	          }
	          catch(SQLException e)
	          {
	              e.printStackTrace();
	          }
	      }
	  }
	  public List<Ptzr> queryptzr(int id)   //查询平台主任信息
	  {
		  List<Ptzr> ptzrbeans=new ArrayList<Ptzr>();
		  Ptzr ptzrbean=null;
	      Connection conn=null;
	      PreparedStatement pstmt=null;
	      ResultSet result=null;
	      try {
	          Class.forName(DriverName);
	          conn=DriverManager.getConnection(Url, UName, Upwd);
	          String sql="select * from ptzr where id=?";
	          pstmt= conn.prepareStatement(sql);
	          pstmt.setInt(1, id);
	          result=pstmt.executeQuery();
	        	 while(result.next())
	        	 {
	        	   String ptzr=result.getString("ptzr");  //平台主任姓名
	        	   String sex=result.getString("sex");   //性别
	        	   String birth=result.getString("birth");  //出生年月
	        	   String zhichen=result.getString("zhichen"); //职称
	        	   String zhuanye=result.getString("zhuanye"); //专业
	        	   String xueli=result.getString("xueli"); //学历
	        	   String xuewei=result.getString("xuewei"); //学位
	        	   String bgphone=result.getString("bgphone"); //办公电话
	        	   String phone=result.getString("phone");  //电话
	        	   String email=result.getString("email"); //E-mail
	        	   ptzrbean=new Ptzr(id, ptzr, sex, birth, zhichen, zhuanye, xueli, xuewei, bgphone, phone, email) ;
	        	   ptzrbeans.add(ptzrbean);
	        	 }

       	   return ptzrbeans;
	      }
	      catch(ClassNotFoundException e)
	      {
	          e.printStackTrace();
	          return null;
	      } 
	      catch (SQLException e) 
	      {
	        e.printStackTrace();
	        return null;
	    }
	      catch(Exception e)
	      {
	          e.printStackTrace();
	          return null;
	      }
	      finally {
	          try {
	              if(result!=null) result.close();
	              if(pstmt!=null) pstmt.close();
	              if(conn!=null) conn.close();
	          }
	          catch(SQLException e)
	          {
	              e.printStackTrace();
	          }
	      }
	  }
	  public List<Ptzr> queryptzrall(String value)   //查询平台主任信息
	  {
		  List<Ptzr> ptzrbeans=new ArrayList<Ptzr>();
		  Ptzr ptzrbean=null;
	      Connection conn=null;
	      PreparedStatement pstmt=null;
	      ResultSet result=null;
	      try {
	          Class.forName(DriverName);
	          conn=DriverManager.getConnection(Url, UName, Upwd);
	          String sql="select * from ptzr where ptzr like ? or sex like ? or birth like ? or zhichen like ? or zhuanye like ? or xueli like ? "
	          		+ "or xuewei like ? or bgphone like ? or phone like ? or email like ?";
	          pstmt= conn.prepareStatement(sql);
	          pstmt.setString(1, "%"+value+"%");
	          pstmt.setString(2, "%"+value+"%");
	          pstmt.setString(3, "%"+value+"%");
	          pstmt.setString(4, "%"+value+"%");
	          pstmt.setString(5, "%"+value+"%");
	          pstmt.setString(6, "%"+value+"%");
	          pstmt.setString(7, "%"+value+"%");
	          pstmt.setString(8, "%"+value+"%");
	          pstmt.setString(9, "%"+value+"%");
	          pstmt.setString(10, "%"+value+"%");
	          result=pstmt.executeQuery();
	        	 while(result.next())
	        	 {
	        		 int id=result.getInt("id");
	        	   String ptzr=result.getString("ptzr");  //平台主任姓名
	        	   String sex=result.getString("sex");   //性别
	        	   String birth=result.getString("birth");  //出生年月
	        	   String zhichen=result.getString("zhichen"); //职称
	        	   String zhuanye=result.getString("zhuanye"); //专业
	        	   String xueli=result.getString("xueli"); //学历
	        	   String xuewei=result.getString("xuewei"); //学位
	        	   String bgphone=result.getString("bgphone"); //办公电话
	        	   String phone=result.getString("phone");  //电话
	        	   String email=result.getString("email"); //E-mail
	        	   ptzrbean=new Ptzr(id, ptzr, sex, birth, zhichen, zhuanye, xueli, xuewei, bgphone, phone, email) ;
	        	   ptzrbeans.add(ptzrbean);
	        	 }

       	   return ptzrbeans;
	      }
	      catch(ClassNotFoundException e)
	      {
	          e.printStackTrace();
	          return null;
	      } 
	      catch (SQLException e) 
	      {
	        e.printStackTrace();
	        return null;
	    }
	      catch(Exception e)
	      {
	          e.printStackTrace();
	          return null;
	      }
	      finally {
	          try {
	              if(result!=null) result.close();
	              if(pstmt!=null) pstmt.close();
	              if(conn!=null) conn.close();
	          }
	          catch(SQLException e)
	          {
	              e.printStackTrace();
	          }
	      }
	  }
}
