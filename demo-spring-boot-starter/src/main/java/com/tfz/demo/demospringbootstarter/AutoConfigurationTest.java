package com.tfz.demo.demospringbootstarter;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * AutoConfigurationTest 枚举/类/接口说明
 *
 * @author: tanfuzeng
 * @date: 2025/7/21 13:10
 * @version: v1.0.0
 * @since: 2025/7/21 13:10
 **/
@Configuration
public class AutoConfigurationTest {

    @Bean
    public ServiceBean serviceBean() {
        return new ServiceBean();
    }
}
