package com.ibrahim.homestore.service;

import com.ibrahim.homestore.entity.AppUser;
import com.ibrahim.homestore.entity.Product;
import com.ibrahim.homestore.entity.SellerProduct;
import com.ibrahim.homestore.repo.CartRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional
@Slf4j
public class CartService {

    private final CartRepository repository;


}
