package com.lxw.utils;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.Enumeration;

/**
 * description
 *
 * @author lxw 2019/07/23 13:53
 */
@Aspect
@Component
public class GlobalLogHandler {


    private static final Logger logger= LoggerFactory.getLogger(GlobalLogHandler.class);

    @Pointcut("execution(public * com.lxw.controller.*.*(..))")
    public void pointCut()
    {}

    @Before("pointCut()")
    public void beforeHandler()
    {
          ServletRequestAttributes attributes= (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
          HttpServletRequest request=attributes.getRequest();
          String requestUrl=request.getRequestURI();
          String ip= request.getRemoteHost();
          String method=request.getMethod();
          logger.info("请求路径:"+requestUrl);
          logger.info("请求IP:"+ip);
          logger.info("请求方法:"+method);
          Enumeration<String>  enums=request.getParameterNames();
          while(enums.hasMoreElements())
          {
              String name=enums.nextElement();
              logger.info("请求参数名:"+name+",请求参数:"+request.getParameter(name));
          }
    }

    @AfterReturning(value = "pointCut()",returning = "ret")
    public void handlerReturningAfter(Object ret)
    {
        logger.info("response:"+ret);
    }











}
