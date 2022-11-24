package com.ibrahim.homestore.service;

import com.ibrahim.homestore.entity.AppUser;
import com.ibrahim.homestore.repo.AppUserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
@Slf4j
public class AppUserService {

    private final AppUserRepository userRepository;

    public List<AppUser> findAll() {
        return userRepository.findAll();
    }
}
