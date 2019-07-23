package com.lxw;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

/**
 * description
 *
 * @author lxw 2019/07/22 18:02
 */

@Configurable
@EnableAutoConfiguration
@ComponentScan("com.lxw")
@MapperScan("com.lxw.mapper")
public class App {


    public static void main(String[] args) {
        SpringApplication.run(App.class);

    }
}
