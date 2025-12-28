package tnesprit3csde1.tpcafeziedbensalah.Aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Component

@Aspect

public class AspectClass {

    @Before("execution(* org.example.tpcafechaimasammoud.Services.*.*(..))") // l'expression : JoinPoint (voir cours)
    // JoinPoint + type d'advice -> Pointcut
    public void logMethodEntry(JoinPoint joinPoint) {
        log.info("Hello from here "+joinPoint.getSignature().getName());
    }

    @After("execution(* org.example.tpcafechaimasammoud.Services.*.*(..))") // l'expression : JoinPoint (voir cours)
    // JoinPoint + type d'advice -> Pointcut
    public void logMethodOut(JoinPoint joinPoint) {
        log.info("Byyyye from here "+joinPoint.getSignature().getName());
    }

    @Before("execution(* org.example.tpcafechaimasammoud.Services.*.*(..))")
    public void logServiceMethodEntry(JoinPoint joinPoint) {
        log.info("Bienvenue à l'un des services de l'application Boycott : Service -->"+joinPoint.getSignature().getDeclaringType().getSimpleName()+" Method -->"+joinPoint.getSignature().getName());
    }

    @Before("execution(* org.example.tpcafechaimasammoud.restControllers.*.ajouter*(..))")
    public void logBeforeAjouterMethod(JoinPoint joinPoint) {
        String packageName = joinPoint.getSignature().getDeclaringType().getPackage().getName();
        String className = joinPoint.getSignature().getDeclaringType().getSimpleName();
        String methodName = joinPoint.getSignature().getName();

        log.info("=== AVANT EXÉCUTION ===");
        log.info("Package: {}", packageName);
        log.info("Classe: {}", className);
        log.info("Méthode: {}", methodName);
        log.info("======================");
    }
    //

    @AfterReturning("execution(* org.example.tpcafechaimasammoud.restControllers.*.ajouter*(..))")
    public void logAfterAjouterMethod(JoinPoint joinPoint) {
        String packageName = joinPoint.getSignature().getDeclaringType().getPackage().getName();
        String className = joinPoint.getSignature().getDeclaringType().getSimpleName();
        String methodName = joinPoint.getSignature().getName();

        log.info("=== APRÈS EXÉCUTION (SUCCÈS) ===");
        log.info("Package: {}", packageName);
        log.info("Classe: {}", className);
        log.info("Méthode: {}", methodName);
        log.info("==============================");
    }
}
