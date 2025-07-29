package org.filterandinterceptor.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * TestController 枚举/类/接口说明
 *
 * @author: tanfuzeng
 * @date: 2025/7/29 13:25
 * @version: v1.0.0
 * @since: 2025/7/29 13:25
 **/
@Controller
@RequestMapping()
public class TestController {

    @RequestMapping("/test1")
    @ResponseBody
    public String test1(String a) {
        System.out.println("我是controller");
        return null;
    }
}
