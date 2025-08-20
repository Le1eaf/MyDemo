package org.factorydemo.BrandProduction.Huawei.computor;

import org.factorydemo.ProductType.Computor;

/**
 * HuaweiCmp 枚举/类/接口说明
 *
 * @author: tanfuzeng
 * @date: 2025/8/20 15:35
 * @version: v1.0.0
 * @since: 2025/8/20 15:35
 **/
public class HuaweiCmp implements Computor {
    @Override
    public void getBrand() {
        System.out.println("Huawei电脑");
    }
}
