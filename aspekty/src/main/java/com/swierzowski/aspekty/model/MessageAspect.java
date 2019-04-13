package com.swierzowski.aspekty.model;

import com.swierzowski.aspekty.UserAspect;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

@Aspect
public class MessageAspect {

    @Autowired
    Message message;

    Logger log =
            LoggerFactory.getLogger(UserAspect.class);

//    @Pointcut("execution(* com.swierzowski.aspekty.rest.CompanyController.*(..))")
//    public void pointcutReq() {
//
//    }
//    @Pointcut("execution(* com.swierzowski.aspekty.rest.CompanyController.*(..))")
//    public void pointcutResp() {
//
//    }


    @Pointcut("@annotation(org.springframework.web.bind.annotation.GetMapping) ")
    public void logResponseMapping() {}


    @Pointcut("@annotation(org.springframework.web.bind.annotation.PostMapping) ")
    public void logRequestMapping() {}


    @Before("logResponseMapping()" )
    public void beforeResponse(JoinPoint joinPoint){
        log.info("przed response");
    }
    @Before("logRequestMapping()")
    public void beforeRequest(JoinPoint joinPoint){
        log.info("przed request");
    }

}
