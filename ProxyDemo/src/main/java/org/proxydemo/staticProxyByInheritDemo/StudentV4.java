package org.proxydemo.staticProxyByInheritDemo;

import lombok.Getter;
import lombok.Setter;

/**
 * Student 枚举/类/接口说明
 *
 * @author: tanfuzeng
 * @date: 2025/8/1 9:46
 * @version: v1.0.0
 * @since: 2025/8/1 9:46
 **/
@Getter
@Setter
public class StudentV4 {
    private String name;

    public StudentV4(String name){
        this.name = name;
    }

    public void giveMoney() {
        System.out.println(name + "上交班费50元");
    }
}
