package com.translation.translation.platform.controller;

import com.translation.translation.platform.entity.TranslatorUser;
import com.translation.translation.platform.entity.TranslatorUser;
import com.translation.translation.platform.service.TranslatorUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@RestController
public class TranslatorUserController {

    @Autowired
    private TranslatorUserService translatorUserService;

    @GetMapping("/user/list")
    public Object list(){
        return translatorUserService.findAll();
    }

    @GetMapping("/login")
    public Object login(
            String username,
            String password
    ){

        TranslatorUser user =
                translatorUserService.login(
                        username,
                        password
                );

        if(user==null){
            return "用户名或密码错误";
        }

        return user;
    }

    @GetMapping("/user/delete/{id}")
    public String delete(@PathVariable Integer id){

        translatorUserService.delete(id);

        return "删除成功";
    }

    @GetMapping("/user/add")
    public String add(
            String username,
            String password,
            String role
    ){

        TranslatorUser user =
                new TranslatorUser();

        user.setUsername(username);
        user.setPassword(password);
        user.setRole(role);

        translatorUserService.add(user);

        return "新增成功";
    }
}