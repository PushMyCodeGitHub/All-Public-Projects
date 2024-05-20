package com.demo7.setterInjectWithCollection;

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
     
        ApplicationContext contex =new ClassPathXmlApplicationContext("contex.xml");

          Employee e1=(Employee) contex.getBean("obj");
        System.out.println(e1);
    }
}
