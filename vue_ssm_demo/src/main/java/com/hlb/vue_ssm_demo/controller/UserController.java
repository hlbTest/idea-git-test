package com.hlb.vue_ssm_demo.controller;

import com.hlb.vue_ssm_demo.pojo.User;
import com.hlb.vue_ssm_demo.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private IUserService userService;

    @GetMapping("/findAll")
    public List<User> findAll() {
        return  userService.findAll();
    }

    @GetMapping("/findUserById")
    public User findUserById(@RequestParam("id") int id) {
        return userService.findUserById(id);
    }


}
