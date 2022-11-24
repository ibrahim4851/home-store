package com.ibrahim.homestore.controller;


import com.ibrahim.homestore.entity.AppUser;
import com.ibrahim.homestore.service.AppUserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/users/")
@RequiredArgsConstructor
public class UserController {

    private AppUserService userService;

    @GetMapping("all")
    public List<AppUser> getAll(){
        return userService.findAll();
    }

}
