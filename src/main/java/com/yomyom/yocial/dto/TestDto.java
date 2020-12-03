package com.yomyom.yocial.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class TestDto {
    @Range(max = 10, min = 0)
    private int id;
    @Size(min = 2, max = 10)
    @NotBlank
    private String name;
}
