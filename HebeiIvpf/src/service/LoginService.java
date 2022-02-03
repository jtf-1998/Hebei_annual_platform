package service;
import bean.Login;
import dao.AddBh;
import dao.Query;

public class LoginService 
{
	static Query query=new Query();
	static AddBh addbh=new AddBh();
    public static int Login(Login login)
    {
    	
    	int a=-3;
    	if(query.exit(login.getId())==true)  //如果平台编号存在
    	{
    		a=query.LoginQuery(login);
    		switch (a) 
    		{
			   case 1:  a=1;  break;  //如果输入信息准确
			   case -1:  a=-1;  break;//如果输入信息不正确 
			   case -2:  a=-2;  break; //如果系统异常
			   default:
			   break;
			}
    		
    	} 
    	else a=-3;   //如果平台编号不存在
    	return a;   
    	
    }
    public static int Register(Login login)
    {
    	
    	int a=-3;
    	if(addbh.exit(login.getId())!=true)  //如果平台编号存在
    	{
    		a=query.LoginQuery(login);
    		addbh.Add(login);
    		
    	} 
    	else a=-3;   //如果平台编号不存在
    	return a;   
    	
    }
    
}
