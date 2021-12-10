package com.mox.ssm.controller;

import com.mox.ssm.domain.Account;
import com.mox.ssm.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * @program: ssm
 * 描述：
 * @author: MoXiong
 * @create: 2021-12-07 20:07
 **/
@Controller
@RequestMapping(value = "/account")
public class AccountController {
    @Autowired
    private AccountService accountService;

    @RequestMapping(value = "/save",produces = "text/html;charset=UTF-8")
    @ResponseBody
    public String save(Account account){
        accountService.save(account);
        System.out.println(account);
        return "成功";
    }

    @RequestMapping(value = "/findAll")
    public ModelAndView findAll(){
        ModelAndView modelAndView = new ModelAndView();
        List<Account> all = accountService.findAll();
        modelAndView.addObject("accountList",all);
        //设置要返回的视图
        modelAndView.setViewName("AccountList");
        return modelAndView;
    }
}