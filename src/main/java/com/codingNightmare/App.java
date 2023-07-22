package com.codingNightmare;

import com.codingNightmare.service.PaymentService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main( String[] args ) {

        ApplicationContext context = new ClassPathXmlApplicationContext("Config.xml");
        PaymentService paymentService = context.getBean("payment", PaymentService.class);
        paymentService.makePayment();

    }
}
