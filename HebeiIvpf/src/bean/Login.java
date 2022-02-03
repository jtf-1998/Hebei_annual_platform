package bean;

public class Login
{
  private int id;
  private int password;
  public Login(int id, int password) 
  {
	super();
	this.id = id;
	this.password = password;
  }
  public Login() 
  {
	super();
  }
  public int getId() 
  {
	return id;
  }
  public void setId(int id) 
  {
	this.id = id;
  }
  public int getPassword()
  {
	return password;
  }
  public void setPassword(int password) 
  {
	this.password = password;
  }
}
