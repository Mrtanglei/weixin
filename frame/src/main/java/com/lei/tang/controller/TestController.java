package com.lei.tang.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author tanglei
 * @date 18/11/22
 */
@RestController
@RequestMapping("test")
public class TestController {

    @RequestMapping(path = "/aa")
    public String test(){
        return "hello";
    }
}
