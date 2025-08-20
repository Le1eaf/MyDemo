package org.factorydemo.Factory.abstractFactory;

import org.factorydemo.BrandProduction.Huawei.computor.HuaweiCmp;
import org.factorydemo.BrandProduction.Huawei.phone.HuaweiPhn;
import org.factorydemo.ProductType.Computor;
import org.factorydemo.ProductType.Phone;

/**
 * HuaweiBrandFactory 枚举/类/接口说明
 *
 * @author: tanfuzeng
 * @date: 2025/8/20 15:22
 * @version: v1.0.0
 * @since: 2025/8/20 15:22
 **/
public class HuaweiBrandFactory implements BrandFactory{
    @Override
    public Phone createPhone() {
        return new HuaweiPhn();
    }

    @Override
    public Computor createComputor() {
        return new HuaweiCmp();
    }
}
