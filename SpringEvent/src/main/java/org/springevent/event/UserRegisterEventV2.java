package org.springevent.event;

import lombok.Getter;
import lombok.Setter;
import org.springframework.context.ApplicationEvent;

/**
 * UserRegisterEventV2 不继承 ApplicationEvent的事件类
 *
 * @author: tanfuzeng
 * @date: 2025/7/28 13:44
 * @version: v1.0.0
 * @since: 2025/7/28 13:44
 **/
@Getter
@Setter
public class UserRegisterEventV2 {
    private String username;
    private String email;

    public UserRegisterEventV2(String username, String email) {
        this.username = username;
        this.email = email;
    }
}
