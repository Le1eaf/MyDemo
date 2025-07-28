package org.springevent.listener;

import jakarta.annotation.Nonnull;
import org.springevent.event.UserRegisterEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * UserRegisterListener 接口版监听器
 *
 * @author: tanfuzeng
 * @date: 2025/7/28 11:28
 * @version: v1.0.0
 * @since: 2025/7/28 11:28
 **/
@Component
public class UserRegisterListener implements ApplicationListener<UserRegisterEvent> {
    @Override
    public void onApplicationEvent(UserRegisterEvent event) {
        String username = event.getUsername();
        String email = event.getEmail();
        System.out.println("用户注册监听器V1");
        System.out.println("用户注册成功，用户名：" + username + "，邮箱：" + email);
    }
}
