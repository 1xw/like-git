package com.lxw.controller;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * description
 *
 * @author lxw 2019/07/22 19:54
 */
@RestController
@RequestMapping("/swagger")
public class SwaggerController {

    @ApiOperation(value = "获取用户信息",notes="根据id来获取用户详细信息")
    @ApiImplicitParam(name="id",value = "用户ID",required = true,dataType = "String")
    @RequestMapping(value = "/{id}",method = RequestMethod.GET )
    public Map<String,String> getInfo(@PathVariable String id){
        Map<String,String> map=new HashMap<String,String>();
        map.put("name","lxw");
        map.put("age","44");
        return map;
    }

}
