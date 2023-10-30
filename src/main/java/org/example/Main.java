package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context =
                new ClassPathXmlApplicationContext("context.xml");

        A a = context.getBean(A.class);
        B b = context.getBean(B.class);

        System.out.println(a);
        System.out.println(b);
    }
}