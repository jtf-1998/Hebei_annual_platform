package bean;

public class User
{
   private int idt;      //自增长
   private int id;      //平台编号
   private String name;   //人才姓名
   private String sex;   //人才性别
   private String birth;  //人才出生年月
   private String xueli;  //人才学历
   private String xuewei;  //人才学位
   private String biye;   //人才毕业院校
   private String zhuanye; //人才专业
   private String cengci;  //人才层次
   private String gud;    //人才固定/流动
   private String xingzhi;  //工作性质
   private String zhuangtai;  //人员状态
   private String szdw;    //人事关系所在单位
   public User()
   {
	super();
    }
public User(int id, String name, String sex, String birth, String xueli, String xuewei, String biye, String zhuanye,
		String cengci, String gud, String xingzhi, String zhuangtai, String szdw) {
	super();
	this.id = id;
	this.name = name;
	this.sex = sex;
	this.birth = birth;
	this.xueli = xueli;
	this.xuewei = xuewei;
	this.biye = biye;
	this.zhuanye = zhuanye;
	this.cengci = cengci;
	this.gud = gud;
	this.xingzhi = xingzhi;
	this.zhuangtai = zhuangtai;
	this.szdw = szdw;
}
public User(int idt, int id, String name, String sex, String birth, String xueli, String xuewei, String biye,
		String zhuanye, String cengci, String gud, String xingzhi, String zhuangtai, String szdw) {
	super();
	this.idt = idt;
	this.id = id;
	this.name = name;
	this.sex = sex;
	this.birth = birth;
	this.xueli = xueli;
	this.xuewei = xuewei;
	this.biye = biye;
	this.zhuanye = zhuanye;
	this.cengci = cengci;
	this.gud = gud;
	this.xingzhi = xingzhi;
	this.zhuangtai = zhuangtai;
	this.szdw = szdw;
}
public int getIdt() {
	return idt;
}
public void setIdt(int idt) {
	this.idt = idt;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
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
public String getBiye() {
	return biye;
}
public void setBiye(String biye) {
	this.biye = biye;
}
public String getZhuanye() {
	return zhuanye;
}
public void setZhuanye(String zhuanye) {
	this.zhuanye = zhuanye;
}
public String getCengci() {
	return cengci;
}
public void setCengci(String cengci) {
	this.cengci = cengci;
}
public String getGud() {
	return gud;
}
public void setGud(String gud) {
	this.gud = gud;
}
public String getXingzhi() {
	return xingzhi;
}
public void setXingzhi(String xingzhi) {
	this.xingzhi = xingzhi;
}
public String getZhuangtai() {
	return zhuangtai;
}
public void setZhuangtai(String zhuangtai) {
	this.zhuangtai = zhuangtai;
}
public String getSzdw() {
	return szdw;
}
public void setSzdw(String szdw) {
	this.szdw = szdw;
}
}
