package com.yomyom.yocial.controller;

import com.yomyom.yocial.dto.Member;
import com.yomyom.yocial.dto.TestDto;
import com.yomyom.yocial.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/member")
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @PostMapping("/insert")
    public void insert(@Valid @RequestBody Member member) {
        userService.insert(member);
    }

    @GetMapping("/test")
    public String test(@Valid @RequestBody TestDto testDto) {
        System.out.println(testDto);
        return "hi";
    }
}
