package service;

import bean.YanjiuJiegou;
import dao.AddYanjou;

public class AddYanjiuService
{
   AddYanjou addyanjiu=new AddYanjou();
   public boolean addYanjiu(YanjiuJiegou yanjiu)
   {
      if(!addyanjiu.exit(yanjiu.getYjfx()))
      {
        addyanjiu.Add(yanjiu);
        return true;
      }
      else
      {
          System.out.println("此条记录已存在！");
           return false;
      }
   }
}
