package org.factorydemo.Factory.abstractFactory;

import org.factorydemo.BrandProduction.Xiaomi.computor.XiaomiCmp;
import org.factorydemo.BrandProduction.Xiaomi.phone.XiaomiPhn;
import org.factorydemo.ProductType.Computor;
import org.factorydemo.ProductType.Phone;

/**
 * XiaomiBrandFactory 枚举/类/接口说明
 *
 * @author: tanfuzeng
 * @date: 2025/8/20 15:23
 * @version: v1.0.0
 * @since: 2025/8/20 15:23
 **/
public class XiaomiBrandFactory implements BrandFactory{
    @Override
    public Phone createPhone() {
        return new XiaomiPhn();
    }

    @Override
    public Computor createComputor() {
        return new XiaomiCmp();
    }
}
