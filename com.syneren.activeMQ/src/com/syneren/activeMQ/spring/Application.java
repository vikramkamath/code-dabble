package com.syneren.activeMQ.spring;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.syneren.activeMQ.spring.app.ISpringProducer;
import com.syneren.activeMQ.spring.app.SpringConsumer;
import com.syneren.activeMQ.spring.app.SpringProducer;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-app.xml");
		ISpringProducer producer = (ISpringProducer) context.getBean("springProducer");
		String text = "THIS IS A STUPID TEXT MESSAGE";
		producer.springSendTextMessage(text);
	}

}
