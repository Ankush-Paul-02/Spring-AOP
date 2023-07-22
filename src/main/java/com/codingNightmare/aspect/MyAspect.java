package com.codingNightmare.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class MyAspect {
    //? Advices
    @Before("execution(* com.codingNightmare.service.PaymentServiceImpl.makePayment())")
    public void printBefore() {
        System.out.println("Payment started...");
    }

    //? Advices
    @After("execution(* com.codingNightmare.service.PaymentServiceImpl.makePayment())")
    public void printAfter() {
        System.out.println("Payment finished...");
    }

}
