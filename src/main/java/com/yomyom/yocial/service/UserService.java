package com.yomyom.yocial.service;

import com.yomyom.yocial.dto.Member;
import com.yomyom.yocial.dto.TestDto;
import com.yomyom.yocial.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
@RequiredArgsConstructor
public class UserService {
    private final MemberRepository memberRepository;

    public void insert() {
        Member member = new Member();
        member.setMemberNum(1);
        member.setActivation("Y");
        member.setAddress("gangnam");
        member.setTel("010-7313-4620");
        member.setSex("M");
        member.setRegDt(new Date());
        member.setName("jang");
        member.setId("yyjjang");
        member.setBirth(new Date());
        member.setAge(10);


        memberRepository.insert(member);
    }

    public void test() {
        TestDto testDto = new TestDto();
        testDto.setId(1);
        testDto.setName("hihi");
        memberRepository.insert2(testDto);
    }

    public int get(int a) {
        return a * 10;
    }
}
