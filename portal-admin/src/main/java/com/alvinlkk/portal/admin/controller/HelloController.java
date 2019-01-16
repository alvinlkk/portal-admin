package com.alvinlkk.portal.admin.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author alvinkk
 * @create 2019-01-15 20:15
 **/
@RestController
public class HelloController {

    @GetMapping("/hello")
    public Object hello() {
        return "Hello Kitty!";
    }
}
