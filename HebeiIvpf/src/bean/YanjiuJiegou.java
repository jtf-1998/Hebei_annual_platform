package bean;

public class YanjiuJiegou
{
   private int pid;   //自增长
   private int id;  //平台编号
   private String yjfx;  //研究方向
   private String yjnr;  //研究内容
   private String gzjg;  //工作机构
   private String jcjg;  //检测机构
   private String jcdj;  //检测机构等级
   private String pdbm;  //等级评定部门
   private String zssc;  //中试生产线
   private String szdw;  //生产线所在单位
   private String fwxm;  //服务项目
   private String fwnr;  //服务内容
public YanjiuJiegou() {
	super();
}
public YanjiuJiegou(int id, String yjfx, String yjnr, String gzjg, String jcjg, String jcdj, String pdbm, String zssc,
		String szdw, String fwxm, String fwnr) {
	super();
	this.id = id;
	this.yjfx = yjfx;
	this.yjnr = yjnr;
	this.gzjg = gzjg;
	this.jcjg = jcjg;
	this.jcdj = jcdj;
	this.pdbm = pdbm;
	this.zssc = zssc;
	this.szdw = szdw;
	this.fwxm = fwxm;
	this.fwnr = fwnr;
}
public YanjiuJiegou(int pid, int id, String yjfx, String yjnr, String gzjg, String jcjg, String jcdj, String pdbm,
		String zssc, String szdw, String fwxm, String fwnr) {
	super();
	this.pid = pid;
	this.id = id;
	this.yjfx = yjfx;
	this.yjnr = yjnr;
	this.gzjg = gzjg;
	this.jcjg = jcjg;
	this.jcdj = jcdj;
	this.pdbm = pdbm;
	this.zssc = zssc;
	this.szdw = szdw;
	this.fwxm = fwxm;
	this.fwnr = fwnr;
}
public int getPid() {
	return pid;
}
public void setPid(int pid) {
	this.pid = pid;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getYjfx() {
	return yjfx;
}
public void setYjfx(String yjfx) {
	this.yjfx = yjfx;
}
public String getYjnr() {
	return yjnr;
}
public void setYjnr(String yjnr) {
	this.yjnr = yjnr;
}
public String getGzjg() {
	return gzjg;
}
public void setGzjg(String gzjg) {
	this.gzjg = gzjg;
}
public String getJcjg() {
	return jcjg;
}
public void setJcjg(String jcjg) {
	this.jcjg = jcjg;
}
public String getJcdj() {
	return jcdj;
}
public void setJcdj(String jcdj) {
	this.jcdj = jcdj;
}
public String getPdbm() {
	return pdbm;
}
public void setPdbm(String pdbm) {
	this.pdbm = pdbm;
}
public String getZssc() {
	return zssc;
}
public void setZssc(String zssc) {
	this.zssc = zssc;
}
public String getSzdw() {
	return szdw;
}
public void setSzdw(String szdw) {
	this.szdw = szdw;
}
public String getFwxm() {
	return fwxm;
}
public void setFwxm(String fwxm) {
	this.fwxm = fwxm;
}
public String getFwnr() {
	return fwnr;
}
public void setFwnr(String fwnr) {
	this.fwnr = fwnr;
}
public String toString()
{
	return this.yjfx;
}
}
