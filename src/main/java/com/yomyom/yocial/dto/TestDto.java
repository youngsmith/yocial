package com.yomyom.yocial.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "test")
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class TestDto {
    @Id
    private int id;
    private String name;
}
