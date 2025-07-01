package ru.project.spring_study;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {

        BeanFactory factory = new ClassPathXmlApplicationContext("spring.xml");

        Alien obj = factory.getBean("alien", Alien.class);

        obj.code();

    }
}
