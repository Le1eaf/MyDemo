package org.straygedemo.strategy;

/**
 * AliPay 枚举/类/接口说明
 *
 * @author: tanfuzeng
 * @version: v1.0.0
 **/
public class AliPay implements Pay{
    @Override
    public void exec() {
        System.out.println("支付宝支付");
    }
}
