package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import bean.Login;
import bean.NianBao;

public class AddNianBao 
{
	private static String DriverName="com.mysql.jdbc.Driver";
	  private static String UName="root";
	  private static String Upwd="1108.shjzh..sql.lq";
	  private static String Url="jdbc:mysql://localhost:3306/hebeipt?useUnicode=true&characterEncoding=UTF-8";
	  
	  public boolean Add(NianBao nianbaobean)   //添加年报信息
	  {
	      Connection conn=null;
	      PreparedStatement pstmt=null;
	      try {
	          Class.forName(DriverName);
	          conn=DriverManager.getConnection(Url, UName, Upwd);
	          String sql="insert into nbtj(name,id,pzny,pzwh,jsly,ptjb,xq,ptxt1,ptxt2,ptxt3,wfhy,ssxk,ytdw,ytdwdm,ytdwfr,bgdh,ytdwlx,nsdm,gjdw,ptwz,wz,pttxdz,ptzr,yb) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
	          pstmt=conn.prepareStatement(sql);
              pstmt.setString(1, nianbaobean.getName());
              pstmt.setInt(2, nianbaobean.getId());
              pstmt.setString(3,nianbaobean.getPzny());
              pstmt.setInt(4, nianbaobean.getPzwh());
              pstmt.setString(5, nianbaobean.getJsly());
              pstmt.setString(6, nianbaobean.getPtjb());
              pstmt.setString(7, nianbaobean.getXq());       
              pstmt.setString(8, nianbaobean.getPtxt1());
              pstmt.setString(9, nianbaobean.getPtxt2());
              pstmt.setString(10, nianbaobean.getPtxt3());
              pstmt.setString(11, nianbaobean.getWfhy());
              pstmt.setString(12, nianbaobean.getSsxk());
              pstmt.setString(13, nianbaobean.getYtdw());
              pstmt.setInt(14, nianbaobean.getYtdwdm());
              pstmt.setString(15, nianbaobean.getYtdwfr());
              pstmt.setString(16, nianbaobean.getBgdh());
              pstmt.setString(17, nianbaobean.getYtdwlx());
              pstmt.setInt(18, nianbaobean.getNsdm());
              pstmt.setString(19, nianbaobean.getGjdw());
              pstmt.setString(20, nianbaobean.getPtwz());
              pstmt.setString(21, nianbaobean.getWz());
              pstmt.setString(22, nianbaobean.getPttxdz());
              pstmt.setString(23, nianbaobean.getPtzr());
              pstmt.setInt(24, nianbaobean.getYb());

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
