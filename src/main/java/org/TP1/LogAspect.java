package org.TP1;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Aspect
@Component
public class LogAspect {
    @Around("@annotation(Log)")
    public Object logExecutionTime(ProceedingJoinPoint joinPoint) throws Throwable{
        String get = joinPoint.getTarget().getClass().getName() + "." + joinPoint.getSignature().getName();
        System.out.println("DEBUT: " + get +"(" + Arrays.toString(joinPoint.getArgs()) + ")" );
        long startTime = System.nanoTime();
        Object proceed = joinPoint.proceed();
        long endTime = System.nanoTime();
        System.out.println("FIN: " + get + "()[" + (endTime - startTime) + "]" );
        return proceed;
    }
}
