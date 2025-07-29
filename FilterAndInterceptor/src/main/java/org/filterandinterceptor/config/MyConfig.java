package org.filterandinterceptor.config;

import jakarta.annotation.Resource;
import org.filterandinterceptor.interceptor.MyInterceptor;
import org.filterandinterceptor.interceptor.MyInterceptor1;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * MyConfig 自定义配置类
 *
 * @author: tanfuzeng
 * @date: 2025/7/29 13:19
 * @version: v1.0.0
 * @since: 2025/7/29 13:19
 **/
@Configuration
public class MyConfig implements WebMvcConfigurer {

    @Resource
    private MyInterceptor myInterceptor;
    @Resource
    private MyInterceptor1 myInterceptor1;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(myInterceptor).addPathPatterns("/**");
        registry.addInterceptor(myInterceptor1).addPathPatterns("/**");
    }
}
