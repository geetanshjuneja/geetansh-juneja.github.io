package org.example;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(Config2.class, Config.class);
        String string = context.getBean(String.class);
        Integer i = context.getBean(Integer.class);
        context.getBean("stringBean");
        System.out.println(string + i);

    }
}