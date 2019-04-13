package com.swierzowski.aspekty;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.stereotype.Component;

@Aspect
@Component
public class UserAspect {

    Logger log =
            LoggerFactory.getLogger(UserAspect.class);

    @Before("upperPointcut()")// execution do metody / klasy
    public void beforeUpper() {
        log.info(("Przed metodą upper"));
    }

    @AfterReturning(pointcut = "upperPointcut()", returning = "result") //returning tworzy zmienanna wynikowa- tak nazwać argument metody !!! NIE WYKONA SIE PRZY BLEDZIE
    public void retruningName(JoinPoint joinPoint,
                              String result) {
        log.info("Zwrócono: {} dla metody : {}", result, joinPoint.toLongString());// {} działa jak + w sout;
    }

    @Around("upperPointcut()") // lepiej nie używać bo może przerwać wykonanie programu , lepij użyć after before ...
    public Object aroundName(ProceedingJoinPoint point){
        log.info("Przed");
        Object object = null;
        try {
             object = point.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        finally {
            log.info("po");
            return object;
        }
    }

    @Pointcut("execution( public String getUpperName() )")
    public void upperPointcut() {

    }


    @AfterThrowing(
            pointcut = "execution(* com.swierzowski.aspekty.UserService.*(..))"
            , throwing = "e")
    public void afterThrow(Throwable e) {
        log.error("Wystąpił błąd", e );
    }

}
