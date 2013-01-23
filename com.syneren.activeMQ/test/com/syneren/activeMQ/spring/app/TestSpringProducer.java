package com.syneren.activeMQ.spring.app;

import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-app.xml")
public class TestSpringProducer {
	@Autowired
	private ConfigurableApplicationContext context;

	@Test
	public void testMessageFlow() {
		ISpringProducer producer = (ISpringProducer) context.getBean("springProducer");
		String text = "THIS IS A STUPID TEXT MESSAGE";
		producer.springSendTextMessage(text);
	}
	
	@After
	public void tearDown(){
		context.close();
	}

}
