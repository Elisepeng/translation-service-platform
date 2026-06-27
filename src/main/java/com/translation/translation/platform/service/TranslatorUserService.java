package com.translation.translation.platform.service;

import com.translation.translation.platform.entity.TranslatorUser;
import com.translation.translation.platform.mapper.TranslatorUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TranslatorUserService {

    @Autowired
    private TranslatorUserMapper translatorUserMapper;

    public List<TranslatorUser> findAll(){
        return translatorUserMapper.findAll();
    }

    public TranslatorUser login(
            String username,
            String password
    ){
        return translatorUserMapper.login(
                username,
                password
        );
    }

    public int delete(Integer id){
        return translatorUserMapper.delete(id);
    }

    public int add(TranslatorUser user){
        return translatorUserMapper.add(user);
    }
}