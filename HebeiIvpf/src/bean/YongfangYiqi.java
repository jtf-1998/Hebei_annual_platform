package bean;

public class YongfangYiqi 
{ 
   private int pid;   //自增长
   private int id;   //平台编号
   private String jzmj;  //建筑面积合计
   private String jzbh;  //建筑面积变化面积
   private String kymj;  //科研面积合计
   private String kybh;  //科研面积变化面积
   private String bgmj;  //办公面积合计
   private String bgbh;  //办公面积变化面积
   private String qtmj;  //其他面积合计
   private String qtbh;  //其他面积变化面积
   private int yq;    //仪器总台数
   private String yqbh;  //仪器台数变化数
   private String yz;  //原值总数
   private String yzbh;  //原值变化数
public YongfangYiqi() {
	super();
}
public YongfangYiqi(int id, String jzmj, String jzbh, String kymj, String kybh, String bgmj, String bgbh, String qtmj,
		String qtbh, int yq, String yqbh, String yz, String yzbh) {
	super();
	this.id = id;
	this.jzmj = jzmj;
	this.jzbh = jzbh;
	this.kymj = kymj;
	this.kybh = kybh;
	this.bgmj = bgmj;
	this.bgbh = bgbh;
	this.qtmj = qtmj;
	this.qtbh = qtbh;
	this.yq = yq;
	this.yqbh = yqbh;
	this.yz = yz;
	this.yzbh = yzbh;
}
public YongfangYiqi(int pid, int id, String jzmj, String jzbh, String kymj, String kybh, String bgmj, String bgbh,
		String qtmj, String qtbh, int yq, String yqbh, String yz, String yzbh) {
	super();
	this.pid = pid;
	this.id = id;
	this.jzmj = jzmj;
	this.jzbh = jzbh;
	this.kymj = kymj;
	this.kybh = kybh;
	this.bgmj = bgmj;
	this.bgbh = bgbh;
	this.qtmj = qtmj;
	this.qtbh = qtbh;
	this.yq = yq;
	this.yqbh = yqbh;
	this.yz = yz;
	this.yzbh = yzbh;
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
public String getJzmj() {
	return jzmj;
}
public void setJzmj(String jzmj) {
	this.jzmj = jzmj;
}
public String getJzbh() {
	return jzbh;
}
public void setJzbh(String jzbh) {
	this.jzbh = jzbh;
}
public String getKymj() {
	return kymj;
}
public void setKymj(String kymj) {
	this.kymj = kymj;
}
public String getKybh() {
	return kybh;
}
public void setKybh(String kybh) {
	this.kybh = kybh;
}
public String getBgmj() {
	return bgmj;
}
public void setBgmj(String bgmj) {
	this.bgmj = bgmj;
}
public String getBgbh() {
	return bgbh;
}
public void setBgbh(String bgbh) {
	this.bgbh = bgbh;
}
public String getQtmj() {
	return qtmj;
}
public void setQtmj(String qtmj) {
	this.qtmj = qtmj;
}
public String getQtbh() {
	return qtbh;
}
public void setQtbh(String qtbh) {
	this.qtbh = qtbh;
}
public int getYq() {
	return yq;
}
public void setYq(int yq) {
	this.yq = yq;
}
public String getYqbh() {
	return yqbh;
}
public void setYqbh(String yqbh) {
	this.yqbh = yqbh;
}
public String getYz() {
	return yz;
}
public void setYz(String yz) {
	this.yz = yz;
}
public String getYzbh() {
	return yzbh;
}
public void setYzbh(String yzbh) {
	this.yzbh = yzbh;
}
}
