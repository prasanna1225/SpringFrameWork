package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main( String[] args )
    {
      // the object that created here will go to bean and create the object
      ApplicationContext context= new ClassPathXmlApplicationContext("spring.xml");
      Alien alien= (Alien) context.getBean("alien");
     //we only creating object here
      alien.code();
    }
}
