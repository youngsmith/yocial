package com.yomyom.yocial;

import com.yomyom.yocial.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class YocialApplicationTests {
    @Autowired
    UserService userService;

    @Test
    void contextLoads() {
        int p = userService.get(100);
        assertTrue(p == 1000);
    }

}
