package org.proxydemo.dynamicProxyByCGLIBDemo;

import lombok.Getter;
import lombok.Setter;

/**
 * Student 枚举/类/接口说明
 *
 * @author: tanfuzeng
 * @date: 2025/7/30 11:17
 * @version: v1.0.0
 * @since: 2025/7/30 11:17
 **/
@Getter
@Setter
public class StudentV2 implements PersonV2 {
    private String name;
    
    // 添加无参构造函数以解决CGLIB代理问题
    public StudentV2() {
        this.name = "默认学生";
    }
    
    public StudentV2(String name){
        this.name = name;
    }

    @Override
    public void giveMoney() {
        try {
            //假设数钱花了一秒时间
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(name + "上交班费50元");
    }
}
