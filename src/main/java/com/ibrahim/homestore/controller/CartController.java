package com.ibrahim.homestore.controller;

import com.ibrahim.homestore.repo.CartContentRepository;
import com.ibrahim.homestore.service.CartService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor@RestController
@RequestMapping("/api/cart/")
public class CartController {

    private final CartService cartService;

}
