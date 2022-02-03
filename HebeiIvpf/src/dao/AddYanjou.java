package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import bean.YanjiuJiegou;

public class AddYanjou
{
	private static String DriverName="com.mysql.jdbc.Driver";
	  private static String UName="root";
	  private static String Upwd="1108.shjzh..sql.lq";
	  private static String Url="jdbc:mysql://localhost:3306/hebeipt?useUnicode=true&characterEncoding=UTF-8";
	  public boolean exit(String yjfx)   //根据研究方向查询是否存在 如果存在返回true，不存在返回false
	  {
	      return query(yjfx)==null?false:true;
	  }
	  public YanjiuJiegou query(String yjfx)   //查询是否存在
	  {
	      YanjiuJiegou yanjiu=null;
	      Connection conn=null;
	      PreparedStatement pstmt=null;
	      ResultSet result=null;
	      try {
	          Class.forName(DriverName);
	          conn=DriverManager.getConnection(Url, UName, Upwd);
	          String sql="select * from yjjg where yjfx=?";
	          pstmt= conn.prepareStatement(sql);
	          pstmt.setString(1, yjfx);
	          result=pstmt.executeQuery();
	          if(result.next())
	          {
	             int id=result.getInt("id");
	             String yjnr=result.getString("yjnr");
	             String gzjg=result.getString("gzjg");
	             String jcjg=result.getString("jcjg");
	             String jcdj=result.getString("jcdj");
	             String pdbm=result.getString("pdbm");
	             String zssc=result.getString("zssc");
	             String szdw=result.getString("szdw");
	             String fwxm=result.getString("fwxm");
	             String fwnr=result.getString("fwnr");
	             
	             yanjiu=new YanjiuJiegou(id, yjfx, yjnr, gzjg, jcjg, jcdj, pdbm, zssc, szdw, fwxm, fwnr);
	          }
	          return yanjiu;
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
	  public boolean Add(YanjiuJiegou yanjiu)   //添加研究方向和机构信息
	  {
	      Connection conn=null;
	      PreparedStatement pstmt=null;
	      try {
	          Class.forName(DriverName);
	          conn=DriverManager.getConnection(Url, UName, Upwd);
	          String sql="insert into yjjg(id,yjfx,yjnr,gzjg,jcjg,jcdj,pdbm,zssc,szdw,fwxm,fwnr) values(?,?,?,?,?,?,?,?,?,?,?)";
	          pstmt=conn.prepareStatement(sql);
            pstmt.setInt(1, yanjiu.getId());
            pstmt.setString(2, yanjiu.getYjfx());
            pstmt.setString(3, yanjiu.getYjnr()); 
            pstmt.setString(4, yanjiu.getGzjg());
            pstmt.setString(5, yanjiu.getJcjg());
            pstmt.setString(6, yanjiu.getJcdj());
            pstmt.setString(7, yanjiu.getPdbm());
            pstmt.setString(8, yanjiu.getZssc());
            pstmt.setString(9, yanjiu.getSzdw());
            pstmt.setString(10, yanjiu.getFwxm());
            pstmt.setString(11, yanjiu.getFwnr());
	          int connt=pstmt.executeUpdate();
	          if(connt>0)  return true;
	          else return false;
	      }
	      catch(ClassNotFoundException  e)
	      {
	          e.printStackTrace();
	          
	          return false;  //系统异常
	      }
	      catch(SQLException e)
	      {
	          e.printStackTrace();
	          return false;
	      }
	      catch(Exception e)
	      {
	          e.printStackTrace();
	          return false;
	      }
	      finally
	      {
	          try 
	          {
	              pstmt.close();
	              conn.close();
	          }
	          catch(SQLException e)
	          {
	              e.printStackTrace();
	          }
	          catch(Exception e)
	          {
	              e.printStackTrace();
	          }
	      }
	      
	  }
}
