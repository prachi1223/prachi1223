package com.demo.Appconfig;

import java.util.Arrays;

import javax.jms.ConnectionFactory;

import org.apache.activemq.ActiveMQConnectionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.messaging.converter.MessageConverter;
import org.springframework.messaging.converter.SimpleMessageConverter;

public class MessagingConfig {

	private static final String default_broker_url = "tcp://localhost:61616";
	private static final String Messag_Queue = "message_queue";

	// establish the connection for mq
	@Bean
	public ConnectionFactory connectionFactory() {

		ActiveMQConnectionFactory confactory = new ActiveMQConnectionFactory();

		confactory.setBrokerURL(default_broker_url);
		confactory.setTrustedPackages(Arrays.asList("com.demo"));

		return confactory;

	}

	@Bean
	public JmsTemplate jmsTemplate() {
		JmsTemplate t = new JmsTemplate();
		t.setConnectionFactory(connectionFactory());
		t.setDefaultDestinationName(Messag_Queue);

		return t;

	}

	@Bean
	MessageConverter conveter() {
		return new SimpleMessageConverter();

	}
}

