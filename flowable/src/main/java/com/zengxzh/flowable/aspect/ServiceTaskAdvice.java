//package com.zengxzh.flowable.aspect;
//
//import com.alibaba.fastjson.JSON;
//import org.aspectj.lang.ProceedingJoinPoint;
//import org.aspectj.lang.annotation.Around;
//import org.aspectj.lang.annotation.Aspect;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.stereotype.Component;
//
///**
// * ServiceTask 调用切面
// *
// * @author zengxzh@yonyou.com
// * @version V1.0.0
// * @date 2018/01/02
// */
//@Aspect
//@Component
//public class ServiceTaskAdvice {
//
//    private Logger logger = LoggerFactory.getLogger(ServiceTaskAdvice.class);
//
//    @Around("execution(* com.zengxzh.flowable.controller.FlowableController.*(..))")
//    public Object doAround(ProceedingJoinPoint joinPoint) throws Throwable {
//
//        String methodName = joinPoint.getSignature().getName();
//        Object[] args = joinPoint.getArgs();
//        logger.info("method={} | type=before | params={}", methodName, JSON.toJSONString(args));
//
//        Object result;
//        try {
//            result = joinPoint.proceed();
//        } catch (Exception e) {
//            logger.error("method={}", methodName, e);
//            throw e;
//        }
//
//        logger.info("method={} | type=after | result={}", methodName, JSON.toJSONString(result));
//        return result;
//    }
//
//}
