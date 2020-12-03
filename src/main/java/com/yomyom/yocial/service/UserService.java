package com.yomyom.yocial.service;

import com.yomyom.yocial.dto.Member;
import com.yomyom.yocial.dto.TestDto;
import com.yomyom.yocial.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;

@Service
@RequiredArgsConstructor
@Slf4j
@Validated
public class UserService {
    private final MemberRepository memberRepository;

    public void insert(Member member) {
        log.info("***inserted member : {}", member);
//        Member member = new Member();
//        member.setMemberNum(1);
//        member.setActivation("Y");
//        member.setAddress("gangnam");
//        member.setTel("010-7313-4620");
//        member.setSex("M");
//        member.setRegDt(new Date());
//        member.setName("jang");
//        member.setId("yyjjang");
//        member.setBirth(new Date());
//        member.setAge(10);

        //memberRepository.insert(member);
    }


    public int get(int a) {
        return a * 10;
    }
}
