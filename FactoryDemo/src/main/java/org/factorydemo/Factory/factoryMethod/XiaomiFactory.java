package org.factorydemo.Factory.factoryMethod;


import org.factorydemo.BrandProduction.Xiaomi.phone.XiaomiPhn;
import org.factorydemo.ProductType.Phone;

/**
 * XiaomiFactory 枚举/类/接口说明
 *
 * @author: tanfuzeng
 * @date: 2025/8/20 14:58
 * @version: v1.0.0
 * @since: 2025/8/20 14:58
 **/
public class XiaomiFactory implements Factory {
    @Override
    public Phone createPhone() {
        return new XiaomiPhn();
    }
}
