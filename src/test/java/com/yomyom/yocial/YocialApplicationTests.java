package com.yomyom.yocial;

import com.yomyom.yocial.repository.MemberRepository;
import com.yomyom.yocial.service.UserService;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;


import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

@SpringBootTest
class YocialApplicationTests {
    @Mock
    private MemberRepository memberRepository;


    @Test
    void contextLoads() {
        UserService userService = new UserService(memberRepository);
        assertThat(userService.get(10), equalTo(1001));
    }


}
