package com.swierzowski.aspekty.model;

import com.swierzowski.aspekty.UserAspect;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AdnotacjaAspect {

    @Autowired
    Message message;

    Logger log =
            LoggerFactory.getLogger(UserAspect.class);


    @Pointcut("@annotation(com.swierzowski.aspekty.annotation.Aspectable) ")
    public void mojaAdnotacja() {}





    @Before("mojaAdnotacja()" )
    public void przedAdnotacja(){
        log.info("przed moją adnotacja");
    }



}
