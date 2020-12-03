package com.yomyom.yocial.constant;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Sex {
    FEMALE("F")
    , MALE("M");

    private final String value;
}
