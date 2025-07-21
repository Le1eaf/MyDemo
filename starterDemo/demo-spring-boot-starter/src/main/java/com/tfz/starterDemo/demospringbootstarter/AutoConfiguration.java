package com.tfz.starterDemo.demospringbootstarter;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * AutoConfiguration 枚举/类/接口说明
 *
 * @author: tanfuzeng
 * @date: 2025/7/21 13:28
 * @version: v1.0.0
 * @since: 2025/7/21 13:28
 **/
@Configuration
public class AutoConfiguration {

    @Bean
    public ServiceBean serviceBean() {
        return new ServiceBean();
    }
}
