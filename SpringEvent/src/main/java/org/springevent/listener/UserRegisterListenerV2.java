package org.springevent.listener;

import org.springevent.event.UserRegisterEventV2;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

/**
 * UserRegisterListenerV2 注解版监听器
 *
 * @author: tanfuzeng
 * @date: 2025/7/28 11:44
 * @version: v1.0.0
 * @since: 2025/7/28 11:44
 **/
@Component
public class UserRegisterListenerV2{

    @EventListener(UserRegisterEventV2.class)
    public void getUserInfo(UserRegisterEventV2 event){
        String username = event.getUsername();
        String email = event.getEmail();
        System.out.println("用户注册监听器V2");
        System.out.println("用户注册成功，用户名：" + username + "，邮箱：" + email);
    }
}
