package com.hundsun.eclp.biz.service;

import com.hundsun.eclp.biz.domain.auth.FuncRecheck;
import java.util.List;

public abstract interface FuncRecheckService
{
  public abstract Long insertOrUpdate(FuncRecheck paramFuncRecheck);

  public abstract int update(FuncRecheck paramFuncRecheck);

  public abstract FuncRecheck selectById(Long paramLong);

  public abstract List<FuncRecheck> selectAll();

  public abstract int deleteById(Long paramLong);

  public abstract FuncRecheck selectByFuncCode(String paramString);
}

/* Location:           E:\__安装归档\linquan-20161112\deploy15\eclp\webroot\WEB-INF\classes\
 * Qualified Name:     com.hundsun.eclp.biz.service.FuncRecheckService
 * JD-Core Version:    0.6.0
 */