package com.swierzowski.aspekty.model;

import com.swierzowski.aspekty.UserAspect;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;

@Aspect
@Component
public class CompanyAspect {

    @Autowired
    Company company;

    Logger log =
            LoggerFactory.getLogger(UserAspect.class);

    @Pointcut("execution(* com.swierzowski.aspekty.model.CompanyService.set*(..))")
    public void setters() {

    }

    @Pointcut("execution(* com.swierzowski.aspekty.model.Company.get*(..))")
    public void getters() {

    }

    @Before("setters()")
    public void beforeSetter(JoinPoint joinPoint){

        log.info("Przed wykonaniem settera z klasy : Company  z argumentami dla :"+ joinPoint.getSignature().getName()+" :"+ joinPoint.getArgs()[0]);
    }

    @AfterReturning(pointcut = "getters()", returning = "result")
    public void retruningName(JoinPoint joinPoint,
                              String result) {
        log.info("Zwrócono: {} dla metody : {}", result, joinPoint.toLongString());
    }





}
