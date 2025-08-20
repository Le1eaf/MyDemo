package org.factorydemo.BrandProduction.Xiaomi.computor;

import org.factorydemo.ProductType.Computor;

/**
 * XiaomiCmp 枚举/类/接口说明
 *
 * @author: tanfuzeng
 * @date: 2025/8/20 15:35
 * @version: v1.0.0
 * @since: 2025/8/20 15:35
 **/
public class XiaomiCmp implements Computor {
    @Override
    public void getBrand() {
        System.out.println("Xiaomi电脑");
    }
}
