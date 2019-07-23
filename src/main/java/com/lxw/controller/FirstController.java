package com.lxw.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * description
 *
 * @author lxw 2019/07/22 18:01
 */

@RestController
public class FirstController {


    @RequestMapping("/hello")
    public String helloWorld(){
        return "咋我也不知道呀 压抑sadasello world";
    }
}
