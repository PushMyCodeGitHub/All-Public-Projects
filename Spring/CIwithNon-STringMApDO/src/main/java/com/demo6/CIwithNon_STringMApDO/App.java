package com.demo6.CIwithNon_STringMApDO;

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
        ApplicationContext context = new ClassPathXmlApplicationContext("contex.xml");
        Actore a1=(Actore)context.getBean("obj3");
        
         System.out.println(a1);
        
    }
}
