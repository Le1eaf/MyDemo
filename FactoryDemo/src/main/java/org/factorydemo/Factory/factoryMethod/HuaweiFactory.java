package org.factorydemo.Factory.factoryMethod;


import org.factorydemo.BrandProduction.Huawei.phone.HuaweiPhn;
import org.factorydemo.ProductType.Phone;

/**
 * HuaweiFactory 枚举/类/接口说明
 *
 * @author: tanfuzeng
 * @date: 2025/8/20 14:57
 * @version: v1.0.0
 * @since: 2025/8/20 14:57
 **/
public class HuaweiFactory implements Factory {
    @Override
    public Phone createPhone() {
        return new HuaweiPhn();
    }
}
