package com.khy.controller;

import com.khy.pojo.User;
import com.khy.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@Slf4j
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService UserService;

    @GetMapping("/{id}")
    public User getById(@PathVariable Integer id){
        System.out.println("in getById...");
        System.out.println("in getById...2");
        System.out.println("in getById...3");
        log.error("error....");
        return UserService.getById(id);
    }




}
