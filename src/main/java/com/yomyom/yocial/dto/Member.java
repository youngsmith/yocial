package com.yomyom.yocial.dto;

import lombok.*;
import org.hibernate.validator.constraints.Range;

import javax.persistence.*;
import javax.validation.constraints.*;
import java.util.Date;

@Entity
@Table(name = "member")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Member {
    @Id
    @Column(name = "member_num")
    private int memberNum;
    @Size(min = 2, max = 10)
    @NotBlank
    private String name;
    @NotBlank
    private String tel;
    @Range(min = 0, max = 120)
    private int age;
    @NotBlank
    @Size(min = 3, max = 20)
    private String id;
    @Column(name = "reg_dt")
    @Null
    private Date regDt;
    @NotBlank
    @Size(min = 1, max = 1)
    private String activation;
    @NotBlank
    @Size(min = 5, max = 45)
    private String address;
    @NotBlank
    private Date birth;
    @NotBlank
    @Size(min = 1, max = 1)
    private String sex;
}
