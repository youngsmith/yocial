package com.yomyom.yocial.controller;

import com.yomyom.yocial.dto.Member;
import com.yomyom.yocial.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/member")
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @GetMapping("/insert")
    public void insert() {
        userService.insert();
    }

    @GetMapping("/test")
    public String test() {
        userService.test();
        return "hi";
    }
}
