package org.factorydemo.Factory.simpleFactory;


import org.factorydemo.BrandProduction.Huawei.phone.HuaweiPhn;
import org.factorydemo.BrandProduction.Xiaomi.phone.XiaomiPhn;
import org.factorydemo.ProductType.Phone;

/**
 * simpleFactory 枚举/类/接口说明
 *
 * @author: tanfuzeng
 * @date: 2025/8/20 14:42
 * @version: v1.0.0
 * @since: 2025/8/20 14:42
 **/
public class simpleFactory {
    public Phone createPhone(String phoneType) {
        return switch (phoneType) {
            case "XIAOMI" -> new XiaomiPhn();
            case "HUAWEI" -> new HuaweiPhn();
            default -> throw new IllegalStateException("目前没有此类型的手机可供生产: " + phoneType);
        };
    }
}
