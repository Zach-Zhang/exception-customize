package com.zach.exception.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Classname CustomizeController
 * @Description:
 * @Date 2020/5/4 11:14
 * @Created by Zach
 */
@RestController
@RequestMapping("/customize")
public class CustomizeController {

    @RequestMapping("/test")
    public Object test(@RequestParam int param) {
        return param;
    }
}
