package org.utildemo.config;

import org.redisson.Redisson;
import org.redisson.api.RedissonClient;
import org.redisson.config.Config;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RedissonConfig {

    @Value("${app.address:redis://117.72.188.81:6379}")
    private String redisAddress;

    @Bean
    public RedissonClient redissonClient() {

        // 创建默认配置
        Config config = new Config();
        // 使用从配置文件读取的地址
        config.useSingleServer()
                .setAddress(redisAddress)
                .setPassword("root")
                // 设置连接超时时间
                .setConnectTimeout(3000)
                // 设置连接池大小
                .setConnectionPoolSize(10)
                .setConnectionMinimumIdleSize(2);

        // 创建并返回RedissonClient实例
        return Redisson.create(config);
    }
}