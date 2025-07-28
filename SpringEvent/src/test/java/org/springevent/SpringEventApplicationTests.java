package org.springevent;

import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.springevent.event.UserRegisterEvent;
import org.springevent.event.UserRegisterEventV2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationEventPublisher;

@SpringBootTest
class SpringEventApplicationTests {
    @Resource
    private ApplicationEventPublisher publisher;

    @Test
    void contextLoads() {
        System.out.println("现在开始注册用户V1");
        String userName = "谭富增";
        String userEmail = "1485413742@qq.com";
        UserRegisterEvent event = new UserRegisterEvent(this,userName,userEmail);

        publisher.publishEvent(event);
    }

    @Test
    void contextLoadsV2() {
        System.out.println("现在开始注册用户V2");
        String userName = "谭富增";
        String userEmail = "1485413742@qq.com";
        UserRegisterEventV2 event = new UserRegisterEventV2(userName,userEmail);

        publisher.publishEvent(event);
    }

}
