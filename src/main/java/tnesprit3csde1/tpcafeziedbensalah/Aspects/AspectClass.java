package tnesprit3csde1.tpcafeziedbensalah.Aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Component

@Aspect

public class AspectClass {
    // Logger SLF4J
    private static final Logger log = LoggerFactory.getLogger(AspectClass.class);


    @Before(
            "execution(* tnesprit3csde1.tpcafeziedbensalah.Services..*.*(..))"
    ) // pointcut ==> ou je veux appliquer l'advice
    // @Before @after @AfterReturning @AfterThrowing @Around ===> le type d advice
    public  void logMethodEntry(JoinPoint joinPoint){

       log.info("Entering method: " + joinPoint.getSignature().getName());
    }

}
