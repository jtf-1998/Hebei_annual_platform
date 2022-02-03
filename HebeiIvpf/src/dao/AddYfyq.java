package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import bean.YongfangYiqi;

public class AddYfyq 
{
	private static String DriverName="com.mysql.jdbc.Driver";
	  private static String UName="root";
	  private static String Upwd="1108.shjzh..sql.lq";
	  private static String Url="jdbc:mysql://localhost:3306/hebeipt?useUnicode=true&characterEncoding=UTF-8";
	  public boolean Add(YongfangYiqi yfyq)   //添加用房面积和仪器数
	  {
	      Connection conn=null;
	      PreparedStatement pstmt=null;
	      try {
	          Class.forName(DriverName);
	          conn=DriverManager.getConnection(Url, UName, Upwd);
	          String sql="insert into yfyq(id,jzmj,jzbh,kymj,kybh,bgmj,bgbh,qtmj,qtbh,yq,yqbh,yz,yzbh) values(?,?,?,?,?,?,?,?,?,?,?,?,?)";
	          pstmt=conn.prepareStatement(sql);
          pstmt.setInt(1, yfyq.getId());
          pstmt.setString(2, yfyq.getJzmj());
          pstmt.setString(3, yfyq.getJzbh()); 
          pstmt.setString(4, yfyq.getKymj());
          pstmt.setString(5, yfyq.getKybh());
          pstmt.setString(6, yfyq.getBgmj());
          pstmt.setString(7, yfyq.getBgbh());
          pstmt.setString(8, yfyq.getQtmj());
          pstmt.setString(9, yfyq.getQtbh());
          pstmt.setInt(10, yfyq.getYq());
          pstmt.setString(11, yfyq.getYqbh());
          pstmt.setString(12, yfyq.getYz());
          pstmt.setString(13, yfyq.getYzbh());
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
