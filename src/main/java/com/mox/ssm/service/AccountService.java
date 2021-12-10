package com.mox.ssm.service;

import com.mox.ssm.domain.Account;

import java.util.List;

public interface AccountService {
    //保存的方法
    public void save(Account account);
    //查找全部的方法
    public List<Account> findAll();
}
