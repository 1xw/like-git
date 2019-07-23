package com.lxw.controller;

import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * description
 *
 * @author lxw 2019/07/23 14:28
 */
@RestController
public class RedisController {

        @Resource
        private RedisTemplate<String,String> redisTemplate;

        @RequestMapping("/redis")
        public String insertRedis()
        {
            ValueOperations<String,String> ops=redisTemplate.opsForValue();
          ops.set("12345","4321412");
           String value=ops.get("12345");
          return "插入成功"+value;
        }




}
