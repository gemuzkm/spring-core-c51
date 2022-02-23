package org.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main( String[] args ) {
        AnnotationConfigApplicationContext container = new AnnotationConfigApplicationContext(RootConfiguration.class);
        System.out.println(container.getBean("cat"));
        System.out.println(container.getBean("dog"));
        System.out.println(container.getBean("user"));
        container.close();
    }
}
