package com.yomyom.yocial.constant;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum Activation {
    ACTIVE("Y")
    , INACTIVE("N");

    private final String value;
}
