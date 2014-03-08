package com.springinaction.springidol;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.springinaction.springidol.exceptions.PerformanceException;
import com.springinaction.springidol.interfaces.Performer;

@SuppressWarnings("unused")
public class Main {

	private static ApplicationContext ctx;

	public static void main(String[] args) throws PerformanceException {
		ctx = new ClassPathXmlApplicationContext(
				new String[] {
						"com/springinaction/springidol/concrete/performers/performers.xml",
						"com/springinaction/springidol/concrete/instruments/instruments.xml",
						"com/springinaction/springidol/concrete/poems/poems.xml", });

		Performer performer = (Performer) ctx.getBean("carl");
		performer.perform();
	}

}
