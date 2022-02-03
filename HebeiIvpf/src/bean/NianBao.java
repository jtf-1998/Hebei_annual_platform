package bean;

public class NianBao 
{
	private String name;   //平台名称
	private int id;    //平台编号
	private String pzny; //批准年月
	private int pzwh;   //批准文号
	private String jsly;  //技术领域
	private String ptjb;  //平台级别
	private String xq;   //所在县区
	private String ptxt1; //平台组织形态1
	private String ptxt2;  //平台组织形态2
	private String ptxt3;  //平台组织形态3
	private String wfhy;  //服务主要行业
	private String ssxk;   //服务的主要学科
	private String ytdw;  //依托单位名称
	private int ytdwdm;  //依托单位代码
	private String ytdwfr;  //依托单选法人
	private String bgdh;  //依托单位办公电话
	private String ytdwlx;  //依托单位类型
	private int nsdm;    //依托单位纳税代码
    private String gjdw;  //共建单位
	private String ptwz;   //平台网站名称
	private String wz;   //平台网址
	private String pttxdz;  //平台通讯地址
	private String ptzr;   //平台主任
	private int yb;   //邮编
	public NianBao() {
		super();
	}
	public NianBao(int id) {
		super();
		this.id = id;
	}
	public NianBao(String name, int id, String pzny, int pzwh, String jsly, String ptjb, String xq, String ptxt1,
			String ptxt2, String ptxt3, String wfhy, String ssxk, String ytdw, int ytdwdm, String ytdwfr, String bgdh,
			String ytdwlx, int nsdm, String gjdw, String ptwz, String wz, String pttxdz, String ptzr, int yb) {
		super();
		this.name = name;
		this.id = id;
		this.pzny = pzny;
		this.pzwh = pzwh;
		this.jsly = jsly;
		this.ptjb = ptjb;
		this.xq = xq;
		this.ptxt1 = ptxt1;
		this.ptxt2 = ptxt2;
		this.ptxt3 = ptxt3;
		this.wfhy = wfhy;
		this.ssxk = ssxk;
		this.ytdw = ytdw;
		this.ytdwdm = ytdwdm;
		this.ytdwfr = ytdwfr;
		this.bgdh = bgdh;
		this.ytdwlx = ytdwlx;
		this.nsdm = nsdm;
		this.gjdw = gjdw;
		this.ptwz = ptwz;
		this.wz = wz;
		this.pttxdz = pttxdz;
		this.ptzr = ptzr;
		this.yb = yb;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPzny() {
		return pzny;
	}
	public void setPzny(String pzny) {
		this.pzny = pzny;
	}
	public int getPzwh() {
		return pzwh;
	}
	public void setPzwh(int pzwh) {
		this.pzwh = pzwh;
	}
	public String getJsly() {
		return jsly;
	}
	public void setJsly(String jsly) {
		this.jsly = jsly;
	}
	public String getPtjb() {
		return ptjb;
	}
	public void setPtjb(String ptjb) {
		this.ptjb = ptjb;
	}
	public String getXq() {
		return xq;
	}
	public void setXq(String xq) {
		this.xq = xq;
	}
	public String getPtxt1() {
		return ptxt1;
	}
	public void setPtxt1(String ptxt1) {
		this.ptxt1 = ptxt1;
	}
	public String getPtxt2() {
		return ptxt2;
	}
	public void setPtxt2(String ptxt2) {
		this.ptxt2 = ptxt2;
	}
	public String getPtxt3() {
		return ptxt3;
	}
	public void setPtxt3(String ptxt3) {
		this.ptxt3 = ptxt3;
	}
	public String getWfhy() {
		return wfhy;
	}
	public void setWfhy(String wfhy) {
		this.wfhy = wfhy;
	}
	public String getSsxk() {
		return ssxk;
	}
	public void setSsxk(String ssxk) {
		this.ssxk = ssxk;
	}
	public String getYtdw() {
		return ytdw;
	}
	public void setYtdw(String ytdw) {
		this.ytdw = ytdw;
	}
	public int getYtdwdm() {
		return ytdwdm;
	}
	public void setYtdwdm(int ytdwdm) {
		this.ytdwdm = ytdwdm;
	}
	public String getYtdwfr() {
		return ytdwfr;
	}
	public void setYtdwfr(String ytdwfr) {
		this.ytdwfr = ytdwfr;
	}
	public String getBgdh() {
		return bgdh;
	}
	public void setBgdh(String bgdh) {
		this.bgdh = bgdh;
	}
	public String getYtdwlx() {
		return ytdwlx;
	}
	public void setYtdwlx(String ytdwlx) {
		this.ytdwlx = ytdwlx;
	}
	public int getNsdm() {
		return nsdm;
	}
	public void setNsdm(int nsdm) {
		this.nsdm = nsdm;
	}
	public String getGjdw() {
		return gjdw;
	}
	public void setGjdw(String gjdw) {
		this.gjdw = gjdw;
	}
	public String getPtwz() {
		return ptwz;
	}
	public void setPtwz(String ptwz) {
		this.ptwz = ptwz;
	}
	public String getWz() {
		return wz;
	}
	public void setWz(String wz) {
		this.wz = wz;
	}
	public String getPttxdz() {
		return pttxdz;
	}
	public void setPttxdz(String pttxdz) {
		this.pttxdz = pttxdz;
	}
	public String getPtzr() {
		return ptzr;
	}
	public void setPtzr(String ptzr) {
		this.ptzr = ptzr;
	}
	public int getYb() {
		return yb;
	}
	public void setYb(int yb) {
		this.yb = yb;
	}
	public String toString()
	{
		return this.getName()+"---"+this.getPtxt1()+"---"+this.getId();
	}
	
}
