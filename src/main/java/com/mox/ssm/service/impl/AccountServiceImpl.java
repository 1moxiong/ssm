package com.mox.ssm.service.impl;

import com.mox.ssm.domain.Account;
import com.mox.ssm.mapper.AccountMapper;
import com.mox.ssm.service.AccountService;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.io.IOException;
import java.io.InputStream;
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

    @Override
    public void save(Account account) {
        accountMapper.save(account);
    }

    @Override
    public List<Account> findAll() {
        List<Account> all = accountMapper.findAll();
        return all;
    }
}