package com.ibrahim.homestore.controller;

import com.ibrahim.homestore.entity.ShopOrder;
import com.ibrahim.homestore.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/orders/")
@RequiredArgsConstructor
public class OrderController {

    @Autowired
    private OrderService orderService;

    @GetMapping("all")
    public List<ShopOrder> getAll(){
        return orderService.findAll();
    }



}
