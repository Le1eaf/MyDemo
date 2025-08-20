package org.factorydemo.BrandProduction.Huawei.phone;

import org.factorydemo.ProductType.Phone;

/**
 * Huawei 枚举/类/接口说明
 *
 * @author: tanfuzeng
 * @date: 2025/8/20 14:27
 * @version: v1.0.0
 * @since: 2025/8/20 14:27
 **/
public class HuaweiPhn implements Phone {
    @Override
    public void getBrand() {
        System.out.println("Huawei手机");
    }
}
