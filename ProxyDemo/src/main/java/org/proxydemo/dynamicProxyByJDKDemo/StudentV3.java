package org.proxydemo.dynamicProxyByJDKDemo;

/**
 * Student 枚举/类/接口说明
 *
 * @author: tanfuzeng
 * @date: 2025/7/30 11:17
 * @version: v1.0.0
 * @since: 2025/7/30 11:17
 **/
public class StudentV3 implements PersonV3 {
    private String name;
    public StudentV3(String name){
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
