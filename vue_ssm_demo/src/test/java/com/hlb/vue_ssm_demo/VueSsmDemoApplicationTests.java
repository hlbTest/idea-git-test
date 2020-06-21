package com.hlb.vue_ssm_demo;

import com.hlb.vue_ssm_demo.dao.UserDao;
import com.hlb.vue_ssm_demo.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class VueSsmDemoApplicationTests {


    @Autowired
    private UserDao userDao;

    @Test
    void contextLoads() {
        System.out.println("asdfs");
    }

    @Test
    void findAll() {
        List<User> users = userDao.findAll();
        users.forEach(user -> System.out.println(user));
    }

    @Test
    void findUserById() {
        User user = userDao.findUserById(2);
        System.out.println(user);
    }

}
