package bean;

public class Ptzr 
{
  private int id;   //平台编号
  private String ptzr;  //平台主任姓名
  private String sex;   //性别
  private String birth;  //出生年月
  private String zhichen; //职称
  private String zhuanye; //专业
  private String xueli; //学历
  private String xuewei; //学位
  private String bgphone; //办公电话
  private String phone;  //电话
  private String email; //E-mail
  public Ptzr() {
	super();
}
  public Ptzr(int id) {
		super();
		this.id = id;
	}
public Ptzr(int id, String ptzr, String sex, String birth, String zhichen, String zhuanye, String xueli, String xuewei,
		String bgphone, String phone, String email) {
	super();
	this.id = id;
	this.ptzr = ptzr;
	this.sex = sex;
	this.birth = birth;
	this.zhichen = zhichen;
	this.zhuanye = zhuanye;
	this.xueli = xueli;
	this.xuewei = xuewei;
	this.bgphone = bgphone;
	this.phone = phone;
	this.email = email;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getPtzr() {
	return ptzr;
}
public void setPtzr(String ptzr) {
	this.ptzr = ptzr;
}
public String getSex() {
	return sex;
}
public void setSex(String sex) {
	this.sex = sex;
}
public String getBirth() {
	return birth;
}
public void setBirth(String birth) {
	this.birth = birth;
}
public String getZhichen() {
	return zhichen;
}
public void setZhichen(String zhichen) {
	this.zhichen = zhichen;
}
public String getZhuanye() {
	return zhuanye;
}
public void setZhuanye(String zhuanye) {
	this.zhuanye = zhuanye;
}
public String getXueli() {
	return xueli;
}
public void setXueli(String xueli) {
	this.xueli = xueli;
}
public String getXuewei() {
	return xuewei;
}
public void setXuewei(String xuewei) {
	this.xuewei = xuewei;
}
public String getBgphone() {
	return bgphone;
}
public void setBgphone(String bgphone) {
	this.bgphone = bgphone;
}
public String getPhone() {
	return phone;
}
public void setPhone(String phone) {
	this.phone = phone;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String toString()
{
	return this.getPtzr()+"---"+this.getBgphone();
}

}
