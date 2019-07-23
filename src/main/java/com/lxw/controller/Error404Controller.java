package com.lxw.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * description
 *
 * @author lxw 2019/07/22 19:14
 */
@RestController
public class Error404Controller {

    @RequestMapping("/404.do")
    public String error_404()
    {
        return "你访问的地址不存在呢~";
    }


}
