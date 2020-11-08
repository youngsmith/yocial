package com.yomyom.yocial.dto;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "member")
public class Member {
    @Id
    @GeneratedValue()
    @Column(name = "member_num")
    private int memberNum;
    private String name;
    private String tel;
    private int age;
    private String id;
    @Column(name = "reg_dt")
    private Date regDt;
    private String activation;
    private String address;
    private Date birth;
    private String sex;
}
