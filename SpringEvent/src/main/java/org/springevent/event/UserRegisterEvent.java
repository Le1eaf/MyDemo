package org.springevent.event;

import lombok.Getter;
import lombok.Setter;
import org.springframework.context.ApplicationEvent;

/**
 * UserRegisterEvebt 用户注册事件
 *
 * @author: tanfuzeng
 * @date: 2025/7/28 11:26
 * @version: v1.0.0
 * @since: 2025/7/28 11:26
 **/
// 1. 定义事件 - 用户注册事件
@Getter
@Setter
public class UserRegisterEvent extends ApplicationEvent {
    private String username;
    private String email;

    public UserRegisterEvent(Object source,String username, String email) {
        super(source);
        this.username = username;
        this.email = email;
    }
}
