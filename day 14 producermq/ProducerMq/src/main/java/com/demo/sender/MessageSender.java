package com.demo.sender;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;
import org.springframework.stereotype.Component;

@Component
public class MessageSender {
	 @Autowired
	 JmsTemplate jmstep;
	 
	 public void sendMessage(final String message) {
		 
		 jmstep.send(new MessageCreator() {
			
			@Override
			public Message createMessage(Session session) throws JMSException {
				
				Message objectMessage =  session.createObjectMessage(message);
			
				return objectMessage;
			}
		});
		 
	 }
	
	
	

}