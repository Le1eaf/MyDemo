package org.factorydemo.Factory.abstractFactory;

import org.factorydemo.ProductType.Computor;
import org.factorydemo.ProductType.Phone;

/**
 * BrandFactory 枚举/类/接口说明
 *
 * @author: tanfuzeng
 * @date: 2025/8/20 15:24
 * @version: v1.0.0
 * @since: 2025/8/20 15:24
 **/
public interface BrandFactory {
    Phone createPhone();
    Computor createComputor();
}
