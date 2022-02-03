package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import bean.Login;
import bean.User;

public class AddUserBao 
{
	private static String DriverName="com.mysql.jdbc.Driver";
	private static String UName="root";
	private static String Upwd="1108.shjzh..sql.lq";
	private static String Url="jdbc:mysql://localhost:3306/hebeipt?useUnicode=true&characterEncoding=UTF-8";
	public boolean exit(int id)   //根据平台账号查询是否存在 如果存在返回true，不存在返回false
	  {
	      return query(id)==null?false:true;
	  }
	  public User query(int id)   //查询是否存在
	  {
	      User user=null;
	      Connection conn=null;
	      PreparedStatement pstmt=null;
	      ResultSet result=null;
	      try {
	          Class.forName(DriverName);
	          conn=DriverManager.getConnection(Url, UName, Upwd);
	          String sql="select * from user where id=?";
	          pstmt= conn.prepareStatement(sql);
	          pstmt.setInt(1, id);
	          result=pstmt.executeQuery();
	          if(result.next())
	          {
	             int idt=result.getInt("idt");
	             id=result.getInt("id");
	             String name=result.getString("name");
	             String sex=result.getString("sex");
	             String birth=result.getString("birth");
	             String xueli=result.getString("xueli");
	             String xuewei=result.getString("xuewei");
	             String biye=result.getString("biye");
	             String zhuanye=result.getString("zhuanye");
	             String cengci=result.getString("cengci");
	             String gud=result.getString("gud");
	             String xingzhi=result.getString("xingzhi");
	             String zhuangtai=result.getString("zhuangtai");
	             String szdw=result.getString("szdw");
	             user=new User(id, name, sex, birth, xueli, xuewei, biye, zhuanye, cengci, gud, xingzhi, zhuangtai, szdw);	             
	          }
	          return user;
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
