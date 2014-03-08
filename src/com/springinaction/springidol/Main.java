package com.springinaction.springidol;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.springinaction.springidol.exceptions.PerformanceException;
import com.springinaction.springidol.interfaces.Performer;

public class Main
{

    public static void main (String[] args) throws PerformanceException
    {
        ApplicationContext ctx = new ClassPathXmlApplicationContext(new String[]
        		{	"com/springinaction/springidol/concrete/performers/performers.xml",
        			"com/springinaction/springidol/concrete/instruments/instruments.xml",
        			"com/springinaction/springidol/concrete/poems/poems.xml",
        		});
//        ApplicationContext ctx = new FileSystemXmlApplicationContext(
//        		new String[] {""});
        		
        Performer performer = (Performer) ctx.getBean("hank");
        performer.perform();
        
//        Instrumentalist instrumentalist = (Instrumentalist) ctx.getBean("kenny");
//        instrumentalist.perform();

    }

}
