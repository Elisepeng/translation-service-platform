package com.translation.translation.platform.service;

import com.translation.translation.platform.entity.TranslationOrder;
import com.translation.translation.platform.mapper.TranslationOrderMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TranslationOrderService {

    @Autowired
    private TranslationOrderMapper translationOrderMapper;

    public int add(TranslationOrder order){
        return translationOrderMapper.add(order);
    }

    public List<TranslationOrder> findAll(){
        return translationOrderMapper.findAll();
    }

    public int accept(Integer id){
        return translationOrderMapper.accept(id);
    }

    public int finish(Integer id){
        return translationOrderMapper.finish(id);
    }

    public Integer totalOrders(){
        return translationOrderMapper.totalOrders();
    }

    public Integer finishedOrders(){
        return translationOrderMapper.finishedOrders();
    }

    public Double totalAmount(){
        return translationOrderMapper.totalAmount();
    }

    public List<TranslationOrder> search(String keyword){
        return translationOrderMapper.search(keyword);
    }

    public int delete(Integer id){

        return translationOrderMapper.delete(id);
    }
}