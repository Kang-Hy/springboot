package com.khy;

import com.khy.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Sb01ApplicationTests {

    @Autowired
    private UserService userService;

    @Value("${peoples.my-Name}")
    private String myname;


    @Test
    void contextLoads() {
        System.out.println(userService.getById(3));
        System.out.println(myname);
    }

}
