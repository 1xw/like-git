package com.lxw.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * description
 *
 * @author lxw 2019/07/22 19:32
 */
@Controller
public class TestThymeleafController {

    @RequestMapping("/testThymeleaf1")
    public String testThymeleaf(ModelMap modelMap,String name)
    {
        modelMap.addAttribute("name",name);
        return "testThymeleaf";
    }

}
