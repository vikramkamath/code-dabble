package com.syneren.activeMQ.spring.app;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SpringConsumer implements MessageListener{
	public SpringConsumer(){
		System.out.println("SpringConsumer loaded..");
	}
	
	public void onMessage(Message message) {
		// TODO Auto-generated method stub
		try {
			System.out.println("Text Message Received:"+ ((TextMessage) message).getText());
		} catch (JMSException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
