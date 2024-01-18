package com.learning.springaop.movierecommenderaop.aspect;

import org.aspectj.lang.annotation.Pointcut;

public class JoinPointConfig {

    @Pointcut("execution(* com.learning.springaop.movierecommenderaop.data.*.*(..))")
    public void dataLayerPointcut() {
    }

    @Pointcut("execution(* com.learning.springaop.movierecommenderaop.business.*.*(..))")
    public void businessLayerPointcut() {
    }

    //to intercept method calls for both layers:
    @Pointcut("com.learning.springaop.movierecommenderaop.aspect.JoinPointConfig.dataLayerPointcut() || "
            + "com.learning.springaop.movierecommenderaop.aspect.JoinPointConfig.businessLayerPointcut()")
    public void allLayersPointcut() {
    }

    //for a particular bean
    @Pointcut("bean(movie*)")
    public void movieBeanPointcut() {
    }

    //custom aspect annotation
    @Pointcut("@annotation(com.learning.springaop.movierecommenderaop.aspect.MeasureTime)")
    public void measureTimeAnnotation() {}
}