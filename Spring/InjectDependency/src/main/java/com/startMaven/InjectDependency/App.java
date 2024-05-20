package com.startMaven.InjectDependency;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        ApplicationContext context= new ClassPathXmlApplicationContext("context.xml");
          
        
        Employee e4=(Employee) context.getBean("obj4");
        System.out.println(e4);
    }
}
