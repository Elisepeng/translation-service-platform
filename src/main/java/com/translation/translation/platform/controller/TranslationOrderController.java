package com.translation.translation.platform.controller;

import com.translation.translation.platform.entity.TranslationOrder;
import com.translation.translation.platform.service.TranslationOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@RestController
public class TranslationOrderController {

    @Autowired
    private TranslationOrderService translationOrderService;

    @GetMapping("/translationOrder/add")
    public String add(){

        TranslationOrder order = new TranslationOrder();

        order.setTitle("中译英合同翻译");
        order.setContent("请翻译合同文件");

        order.setSourceLanguage("中文");
        order.setTargetLanguage("英文");

        order.setPrice(new BigDecimal("500"));

        order.setStatus("待接单");

        order.setUserId(2);

        order.setCreateTime(LocalDateTime.now());

        translationOrderService.add(order);

        return "订单创建成功";
    }

    @GetMapping("/translationOrder/list")
    public Object list(){

        return translationOrderService.findAll();
    }

    @GetMapping("/translationOrder/accept/{id}")
    public String accept(@PathVariable Integer id){

        translationOrderService.accept(id);

        return "接单成功";
    }

    @GetMapping("/translationOrder/finish/{id}")
    public String finish(@PathVariable Integer id){

        translationOrderService.finish(id);

        return "完成成功";
    }

    @PostMapping("/translationOrder/save")
    public String save(@RequestBody TranslationOrder order){

        order.setStatus("待接单");

        order.setCreateTime(LocalDateTime.now());

        translationOrderService.add(order);

        return "发布成功";
    }

    @PostMapping("/translationOrder/create")
    public String create(
            @RequestBody TranslationOrder order){

        order.setStatus("待接单");

        order.setUserId(2);

        order.setCreateTime(LocalDateTime.now());

        translationOrderService.add(order);

        return "订单发布成功";
    }

    @GetMapping("/translationOrder/search")
    public Object search(String keyword){

        return translationOrderService.search(keyword);
    }

    @GetMapping("/translationOrder/delete/{id}")
    public String delete(
            @PathVariable Integer id){

        translationOrderService.delete(id);

        return "删除成功";
    }
}