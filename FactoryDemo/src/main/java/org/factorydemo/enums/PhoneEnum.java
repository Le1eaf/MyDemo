package org.factorydemo.enums;

/**
 * PhoneEnum 枚举/类/接口说明
 *
 * @author: tanfuzeng
 * @date: 2025/8/20 14:41
 * @version: v1.0.0
 * @since: 2025/8/20 14:41
 **/
public enum PhoneEnum {
    XIAOMI("XIAOMI", "小米"),
    HUAWEI("HUAWEI", "华为");

    private String code;
    private String desc;


    PhoneEnum(String code, String desc) {
    }
}
