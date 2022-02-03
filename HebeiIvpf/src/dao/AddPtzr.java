package dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import bean.Ptzr;

public class AddPtzr 
{
	private static String DriverName="com.mysql.jdbc.Driver";
	  private static String UName="root";
	  private static String Upwd="1108.shjzh..sql.lq";
	  private static String Url="jdbc:mysql://localhost:3306/hebeipt?useUnicode=true&characterEncoding=UTF-8";
	  
	  public boolean Add(Ptzr ptzrbean)   //添加年报信息
	  {
	      Connection conn=null;
	      PreparedStatement pstmt=null;
	      try {
	          Class.forName(DriverName);
	          conn=DriverManager.getConnection(Url, UName, Upwd);
	          String sql="insert into ptzr(id,ptzr,sex,birth,zhichen,zhuanye,xueli,xuewei,bgphone,phone,email) values(?,?,?,?,?,?,?,?,?,?,?)";
	          pstmt=conn.prepareStatement(sql);
              pstmt.setInt(1, ptzrbean.getId());
              pstmt.setString(2, ptzrbean.getPtzr());
              pstmt.setString(3, ptzrbean.getSex()); 
              pstmt.setString(4, ptzrbean.getBirth());
              pstmt.setString(5, ptzrbean.getZhichen());
              pstmt.setString(6, ptzrbean.getZhuanye());
              pstmt.setString(7, ptzrbean.getXueli());
              pstmt.setString(8, ptzrbean.getXuewei());
              pstmt.setString(9, ptzrbean.getBgphone());
              pstmt.setString(10, ptzrbean.getPhone());
              pstmt.setString(11, ptzrbean.getEmail());
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

