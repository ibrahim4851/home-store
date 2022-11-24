package com.ibrahim.homestore.controller;

import com.ibrahim.homestore.repo.CartContentRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional
@Slf4j
public class CartController {

    private final CartContentRepository cartRepository;

}
