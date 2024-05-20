package com.demo7.setterInjectWithCollection2;

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
     
        ApplicationContext contex =new ClassPathXmlApplicationContext("contex2.xml");

          Employee e1=(Employee) contex.getBean("e1");
        System.out.println(e1);
    }
}
