package com.yomyom.yocial.configuration.db.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Properties;

@Component
@ConfigurationProperties(prefix = "jpa.properties")
public class JpaProperties extends Properties {
}
