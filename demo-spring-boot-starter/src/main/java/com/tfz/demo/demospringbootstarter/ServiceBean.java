package com.tfz.demo.demospringbootstarter;

/**
 * ServiceBean 枚举/类/接口说明
 *
 * @author: tanfuzeng
 * @date: 2025/7/21 13:11
 * @version: v1.0.0
 * @since: 2025/7/21 13:11
 **/
public class ServiceBean {
    public String sayHello(String name){
        return String.format("Hello World, %s", name);
    }
}
