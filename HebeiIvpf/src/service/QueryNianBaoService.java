package service;

import java.util.List;

import bean.NianBao;
import bean.Ptzr;
import dao.QueryNianBao;

public class QueryNianBaoService 
{
	NianBao nianbao=new NianBao();
	QueryNianBao querynianbao=new QueryNianBao();
	public NianBao querynianb(int id)
	{
		return querynianbao.querynianb(id);
	}
	public List<NianBao> querynianbao(int id)
	{
		return querynianbao.querynb(id);
	}
    public List<NianBao> querynb(int id)    //根据平台编号查询年报信息
    {
      
    	return  querynianbao.querynianbao(id);
    	
    }
    public List<NianBao> querynball(String value)    //根据平台编号查询年报信息
    {
      
    	return  querynianbao.querynianbaoall(value);
    	
    }
    public List<NianBao> searchptny(String low,String high)
    {
    	return querynianbao.searchptny(low, high);
    }
    public List<NianBao> searchptmc(String ptmc) //根据平台名称查询年报信息
    {
    	return querynianbao.searchnianbao(ptmc);
    }
    public Ptzr queryzr(int value)
    {
    	return querynianbao.queryzr(value);
    }
    public List<Ptzr> queryptzr(int value)    //根据平台编号查询平台主任信息
    {
    	return querynianbao.queryptzr(value);
    }
    public List<Ptzr> queryptzrall(String value)    
    {
    	return querynianbao.queryptzrall(value);
    }
    public List<Ptzr> searchptzr(String ptzr)  //根据平台主任姓名查询
    {
    	return querynianbao.searchptzr(ptzr);
    }
    public List<NianBao> searchall(int id,String ptzr,String ptmc,String low,String high)
    {
    	return querynianbao.searchall(id,ptzr, ptmc, low, high);
    }
}
