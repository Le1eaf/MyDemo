package org.utildemo.util;

import lombok.RequiredArgsConstructor;
import org.redisson.api.RAtomicLong;
import org.redisson.api.RedissonClient;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.TimeUnit;

/**
 * GenerateOrderNoUtil 枚举/类/接口说明
 *
 * @author: tanfuzeng
 * @date: 2025/7/30 14:01
 * @version: v1.0.0
 * @since: 2025/7/30 14:01
 **/
@Component
@RequiredArgsConstructor
public class GenerateOrderNoUtil {

    private static final DateTimeFormatter DATE_FORMATTER = DateTimeFormatter.ofPattern("yyyyMMdd");
    private static final long KEY_EXPIRATION_SECONDS = 24 * 60 * 60; // 24 hours
    private static final int MAX_NUMBER = 9999;

    private final RedissonClient redissonClient;

    /**
     * 获取单据编码
     *
     * @return
     */
    public String getOrderNo(String prefixKey) throws Exception {

        try {
            LocalDate currentDate = LocalDate.now();
            String dateStr = currentDate.format(DATE_FORMATTER);
            String redisKey = prefixKey + dateStr;
            // 获取或创建计数器
            RAtomicLong counter = redissonClient.getAtomicLong(redisKey);
            // 原子递增
            long count = counter.incrementAndGet();
            // 如果是第一次递增，设置过期时间
            if (count == 1) {
                counter.expire(KEY_EXPIRATION_SECONDS, TimeUnit.SECONDS);
            }
            // 检查计数器是否超过4位数上限
            if (count > MAX_NUMBER) {
                throw new Exception("Daily code limit (9999) reached for date: " + dateStr);
            }
            // 格式化编码
            return String.format("%s%s%04d", prefixKey, dateStr, count);
        } catch (Exception e) {
            throw new Exception("Failed to generate code: Redis error - " + e.getMessage());
        }
    }
}
