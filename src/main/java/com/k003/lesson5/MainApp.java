package com.k003.lesson5;

import com.k003.lesson5.model.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
        Person person = (Person) context.getBean("person");
        person.print();
        Person person1 = (Person) context.getBean("person2");
        person1.print();
    }
}
