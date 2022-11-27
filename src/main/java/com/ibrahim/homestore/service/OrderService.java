package com.ibrahim.homestore.service;

import com.ibrahim.homestore.entity.ShopOrder;
import com.ibrahim.homestore.repo.ShopOrderRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
@Slf4j
public class OrderService {

    private final ShopOrderRepository orderRepository;

    public List<ShopOrder> findAll() {
        return orderRepository.findAll();
    }

    public ShopOrder create(){
        return new ShopOrder();
    }

}
