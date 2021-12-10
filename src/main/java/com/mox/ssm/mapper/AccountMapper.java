package com.mox.ssm.mapper;

import com.mox.ssm.domain.Account;

import java.util.List;

/**
 * @program: ssm
 * 描述：
 * @author: MoXiong
 * @create: 2021-12-07 20:02
 **/

public interface AccountMapper {
    //保存的方法
    public void save(Account account);
    //查找全部的方法
    public List<Account> findAll();
}