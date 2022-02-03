package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;

import bean.Login;

public class Query 
{
	  private static String DriverName="com.mysql.jdbc.Driver";
	  private static String UName="root";
	  private static String Upwd="1108.shjzh..sql.lq";
	  private static String Url="jdbc:mysql://localhost:3306/hebeipt";
	  public boolean exit(int id)   //根据平台账号查询是否存在 如果存在返回true，不存在返回false
	  {
	      return query(id)==null?false:true;
	  }
	  public Login query(int id)   //查询是否存在
	  {
	      Login login=null;
	      Connection conn=null;
	      PreparedStatement pstmt=null;
	      ResultSet result=null;
	      try {
	          Class.forName(DriverName);
	          conn=DriverManager.getConnection(Url, UName, Upwd);
	          String sql="select * from login where id=?";
	          pstmt= conn.prepareStatement(sql);
	          pstmt.setInt(1, id);
	          result=pstmt.executeQuery();
	          if(result.next())
	          {
	             int idt=result.getInt("id");
	             int password=result.getInt("password");
	             login=new Login(idt, password);
	          }
	          return login;
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
	  public static int LoginQuery(Login loginbean)   //查询输入信息是否正确
	  {
	      int  flag=-1;   //flag=1(登录成功)
	      Connection conn=null;
	      PreparedStatement pstmt=null;
	      ResultSet result=null;
	      int count=-1;
	      try {
	          Class.forName(DriverName);
	          conn=DriverManager.getConnection(Url, UName, Upwd);
	          String sql="select count(*) from login where id=? and password=?";
	          pstmt=conn.prepareStatement(sql);
	          pstmt.setInt(1, loginbean.getId());
	          pstmt.setInt(2, loginbean.getPassword());
	          
	          result=pstmt.executeQuery();
	          if(result.next())
	          {
	              count=result.getInt(1);
	          }
	          if(count>0)
	          {
	        	  
	              return 1;    //登录成功
	              
	          }
	          else
	          {
	
	              return -1;  //登录失败（用户名，密码有误）
	          }
	      }
	      catch(ClassNotFoundException  e)
	      {
	          e.printStackTrace();
	          
	          return -2;  //系统异常
	      }
	      catch(SQLException e)
	      {
	          e.printStackTrace();
	          return -2;
	      }
	      catch(Exception e)
	      {
	          e.printStackTrace();
	          return -2;
	      }
	      finally
	      {
	          try 
	          {
	              result.close();
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
