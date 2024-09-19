package com.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext context= new ClassPathXmlApplicationContext("configuration.xml");
        Employee E1 = (Employee) context.getBean("Tabish");
        System.out.println(E1);
        Employee E2 = (Employee) context.getBean("fatima");
        System.out.println(E2);
        Employee E3 = (Employee) context.getBean("fatima2");
        System.out.println(E3);
    }
}
