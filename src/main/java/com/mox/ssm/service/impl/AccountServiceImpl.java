package com.mox.ssm.service.impl;

import com.mox.ssm.domain.Account;
import com.mox.ssm.mapper.AccountMapper;
import com.mox.ssm.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: ssm
 * 描述：
 * @author: MoXiong
 * @create: 2021-12-07 20:06
 **/
@Service(value = "accountService")
public class AccountServiceImpl implements AccountService {
    //使用spring来管理mybatis的工厂创建，直接注入使用（在spring的配置文件配置了sql创建）
    @Autowired
    private AccountMapper accountMapper;
    //查看一个用户的信息
    @Override
    public void save(Account account) {
        accountMapper.save(account);
    }
    //查找所有 的用户
    @Override
    public List<Account> findAll() {
        return accountMapper.findAll();
    }
}