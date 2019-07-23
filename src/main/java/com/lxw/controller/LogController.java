package com.lxw.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * description
 *
 * @author lxw 2019/07/23 13:32
 */

@RestController
public class LogController {


    private final Logger logger= LoggerFactory.getLogger(LogController.class);

    @RequestMapping("/hello22")
    public String getLogger()
    {
        logger.debug("dddsadasdsadas的健康傻得可怜");
        return "dsadas";
    }

}
