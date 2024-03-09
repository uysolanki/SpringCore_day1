package com.gl.app;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.gl.model.Player;

public class DriverApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext beanFactory = new ClassPathXmlApplicationContext("resources/application-context.xml");
		System.out.println("hi");
//		Car myCar=beanFactory.getBean("c1", Car.class);
//		System.out.println(myCar);
		
		Player myPlayer1=(Player)beanFactory.getBean("p1");
		Player myPlayer2=(Player)beanFactory.getBean("p1");
		
		System.out.println(myPlayer1==myPlayer2);  //false
		
		AbstractApplicationContext abs=(AbstractApplicationContext) beanFactory;
		abs.registerShutdownHook();

		
	}

}
