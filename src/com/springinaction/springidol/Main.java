package com.springinaction.springidol;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.springinaction.springidol.exceptions.PerformanceException;
import com.springinaction.springidol.interfaces.Performer;

public class Main
{

    public static void main (String[] args) throws PerformanceException
    {
//        ApplicationContext ctx = new ClassPathXmlApplicationContext(
//                "com/springinaction/springidol/spring-idol.xml");
        ApplicationContext ctx = new FileSystemXmlApplicationContext(
                "spring-idol.xml");
        Performer performer = (Performer) ctx.getBean("duke");
        performer.perform();

    }

}
