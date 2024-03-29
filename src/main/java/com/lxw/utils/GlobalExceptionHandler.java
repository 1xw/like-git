package com.lxw.utils;

import org.springframework.boot.web.server.ConfigurableWebServerFactory;
import org.springframework.boot.web.server.ErrorPage;
import org.springframework.boot.web.server.WebServerFactoryCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * description
 *
 * @author lxw 2019/07/22 18:56
 */
@ControllerAdvice
public class GlobalExceptionHandler {

        @ExceptionHandler(value = RuntimeException.class)
        @ResponseBody
        public Object defaultErrorHandler(HttpServletRequest req,Exception e) throws  Exception{

            e.printStackTrace();
            return "出现错误啦~";
        }


        @Bean
        public WebServerFactoryCustomizer<ConfigurableWebServerFactory> webServerFactoryCustomizer()
        {
            return (factory -> {
                ErrorPage error404Page=new ErrorPage(HttpStatus.NOT_FOUND,"/404.do");
                factory.addErrorPages(error404Page);
            });
        }

}
