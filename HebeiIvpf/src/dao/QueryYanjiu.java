package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import bean.YanjiuJiegou;

public class QueryYanjiu 
{
	private static String DriverName="com.mysql.jdbc.Driver";
	  private static String UName="root";
	  private static String Upwd="1108.shjzh..sql.lq";
	  private static String Url="jdbc:mysql://localhost:3306/hebeipt?useUnicode=true&characterEncoding=UTF-8";
	public List<YanjiuJiegou> queryall()   //查询是否存在
	  {
		  List<YanjiuJiegou> yanjius=new ArrayList<>();
	      YanjiuJiegou yanjiu=null;
	      Connection conn=null;
	      PreparedStatement pstmt=null;
	      ResultSet result=null;
	      try {
	          Class.forName(DriverName);
	          conn=DriverManager.getConnection(Url, UName, Upwd);
	          String sql="select * from yjjg";
	          pstmt= conn.prepareStatement(sql);
	          result=pstmt.executeQuery();
	          while(result.next())
	          {
	            int pid=result.getInt("pid");
	             int id=result.getInt("id");
	             String yjfx=result.getString("yjfx");
	             String yjnr=result.getString("yjnr");
	             String gzjg=result.getString("gzjg");
	             String jcjg=result.getString("jcjg");
	             String jcdj=result.getString("jcdj");
	             String pdbm=result.getString("pdbm");
	             String zssc=result.getString("zssc");
	             String szdw=result.getString("szdw");
	             String fwxm=result.getString("fwxm");
	             String fwnr=result.getString("fwnr");             
	             yanjiu=new YanjiuJiegou(pid,id, yjfx, yjnr, gzjg, jcjg, jcdj, pdbm, zssc, szdw, fwxm, fwnr);
	             yanjius.add(yanjiu);
	          }
	          return yanjius;
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
