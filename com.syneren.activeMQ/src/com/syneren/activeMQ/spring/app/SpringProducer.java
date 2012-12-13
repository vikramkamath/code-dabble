package com.syneren.activeMQ.spring.app;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;
import javax.jms.TextMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;
import org.springframework.stereotype.Service;

@Service
public class SpringProducer implements ISpringProducer {
	
	@Autowired
	private JmsTemplate template;
	
	public SpringProducer(){
		System.out.println("SpringProducer loaded...");
	}
	
	public void springSendTextMessage(String text) {
		// TODO Auto-generated method stub
		for (int i = 0; i < 10 ; i++)
		template.send(
				new MessageCreator() {
			
					public Message createMessage(Session session) throws JMSException {
						TextMessage txtMessage = session.createTextMessage();
						long rnd = new java.util.Random().nextLong();
						txtMessage.setText("This is a text message#: "+ rnd);
						System.out.println("Sending msg#:"+rnd);
						return txtMessage;
					}
				});
		System.out.println("All messages sent");
		
	}

}
