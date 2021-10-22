package com.code.SpringBoot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.code.beans.Mundo;

/**
 * Hello world!
 *
 */
// Practica 4
public class App {
	
	public static void main(String[] args) {
		ApplicationContext appContext = new ClassPathXmlApplicationContext("com/code/xml/bean.xml");
		Mundo m = (Mundo) appContext.getBean("mundo");
		System.out.println(m.getSaludo());
	}
}
