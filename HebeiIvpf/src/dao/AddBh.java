package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import bean.Login;
import bean.NianBao;

public class AddBh 
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
	  public boolean Add(Login login)   //添加用户信息
	  {
	      Connection conn=null;
	      PreparedStatement pstmt=null;
	      try {
	          Class.forName(DriverName);
	          conn=DriverManager.getConnection(Url, UName, Upwd);
	          String sql="insert into login(id,password) values(?,?)";
	          pstmt=conn.prepareStatement(sql);
              pstmt.setInt(2, login.getPassword());
              pstmt.setInt(1, login.getId());

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
