package bean;

public class Usertj 
{
   private int id;    //平台编号
   private int nmrs;  //年末总人数
   private  int nmrsbh;  //年末总人数变化
   private int ldry;   //流动人员人数
   private int ldrybh;  //流动人员变化人数
   private int gdry;   //固定人员人数
   private int gdrybh;  //固定人员变化人数
   private String gdxwe; //固定人员学位
   private String gdzc;   //固定人员职称
   private String gdch;   //固定人员层次
public Usertj() {
	super();
}
public Usertj(int id, int nmrs, int nmrsbh, int ldry, int ldrybh, int gdry, int gdrybh, String gdxwe, String gdzc,
		String gdch) {
	super();
	this.id = id;
	this.nmrs = nmrs;
	this.nmrsbh = nmrsbh;
	this.ldry = ldry;
	this.ldrybh = ldrybh;
	this.gdry = gdry;
	this.gdrybh = gdrybh;
	this.gdxwe = gdxwe;
	this.gdzc = gdzc;
	this.gdch = gdch;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public int getNmrs() {
	return nmrs;
}
public void setNmrs(int nmrs) {
	this.nmrs = nmrs;
}
public int getNmrsbh() {
	return nmrsbh;
}
public void setNmrsbh(int nmrsbh) {
	this.nmrsbh = nmrsbh;
}
public int getLdry() {
	return ldry;
}
public void setLdry(int ldry) {
	this.ldry = ldry;
}
public int getLdrybh() {
	return ldrybh;
}
public void setLdrybh(int ldrybh) {
	this.ldrybh = ldrybh;
}
public int getGdry() {
	return gdry;
}
public void setGdry(int gdry) {
	this.gdry = gdry;
}
public int getGdrybh() {
	return gdrybh;
}
public void setGdrybh(int gdrybh) {
	this.gdrybh = gdrybh;
}
public String getGdxwe() {
	return gdxwe;
}
public void setGdxwe(String gdxwe) {
	this.gdxwe = gdxwe;
}
public String getGdzc() {
	return gdzc;
}
public void setGdzc(String gdzc) {
	this.gdzc = gdzc;
}
public String getGdch() {
	return gdch;
}
public void setGdch(String gdch) {
	this.gdch = gdch;
}
}
