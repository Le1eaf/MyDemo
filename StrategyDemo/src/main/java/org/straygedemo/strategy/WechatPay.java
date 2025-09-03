package org.straygedemo.strategy;

/**
 * WechatPay 枚举/类/接口说明
 *
 * @author: tanfuzeng
 * @version: v1.0.0
 **/
public class WechatPay implements Pay{
    @Override
    public void exec() {
        System.out.println("微信支付");
    }
}
