package com.learning.springaop.movierecommenderaop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class AccessCheckAspect {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Before("execution(* com.learning.springaop.movierecommenderaop.business.*.*(..))")
    //@Before("execution(String com.learning.springaop.movierecommenderaop..*.*(String))") -> calls using return type String and having a parameter String
    //@Before("execution(* com.learning.springaop.movierecommenderaop..*.*Filtering(..))") -> calls having the name 'Filtering' in them
    //@Before("execution(String com.learning.springaop.movierecommenderaop..*.*(..))") -> calls using return type of String
    //@Before("execution(* com.learning.springaop.movierecommenderaop.business.*.*(String,..))") -> calls with String as the first argument along with others
    //@Before("execution(* com.learning.springaop.movierecommenderaop..*.*Filtering(..)) ||
    //          execution(String com.learning.springaop.movierecommenderaop..*.*(..))") -> combining pointcut expressions
    public void before(JoinPoint joinPoint) {
        //	logger.info("Intercepted method call");
        logger.info("Intercepted call before execution of: {}", joinPoint);

        //access check logic
    }
}