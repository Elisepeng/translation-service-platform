package com.translation.translation.platform.controller;

import com.translation.translation.platform.service.TranslationOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class DashboardController {

    @Autowired
    private TranslationOrderService translationOrderService;

    @GetMapping("/dashboard")
    public Map<String,Object> dashboard(){

        Map<String,Object> map = new HashMap<>();

        map.put(
                "totalOrders",
                translationOrderService.totalOrders()
        );

        map.put(
                "finishedOrders",
                translationOrderService.finishedOrders()
        );

        map.put(
                "totalAmount",
                translationOrderService.totalAmount()
        );

        return map;
    }
}