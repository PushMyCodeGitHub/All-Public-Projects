package com.demo2.Sample2;

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
        ApplicationContext contex =new ClassPathXmlApplicationContext("contex.xml");

    
        Employee e1 =(Employee)contex.getBean("obj");
        System.out.println(e1);
    }
}
