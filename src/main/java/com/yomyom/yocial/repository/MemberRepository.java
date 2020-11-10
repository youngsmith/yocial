package com.yomyom.yocial.repository;

import com.yomyom.yocial.dto.Member;
import com.yomyom.yocial.dto.TestDto;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@Repository
public class MemberRepository {
    @PersistenceContext
    EntityManager entityManager;

    @Transactional
    public void insert(Member member) {
        System.out.println("hi");
        entityManager.persist(member);
    }

    @Transactional
    public void insert2(TestDto testDto) {
        entityManager.persist(testDto);
    }
}
