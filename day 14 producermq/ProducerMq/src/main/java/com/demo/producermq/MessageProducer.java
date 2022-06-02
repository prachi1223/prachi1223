package com.demo.producermq;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.demo.Appconfig.AppConfig;
import com.demo.sender.MessageSender;

public class MessageProducer {
	public static void main(String ar[]) {

		AbstractApplicationContext con = new AnnotationConfigApplicationContext(AppConfig.class);

		MessageSender messageSender = con.getBean(MessageSender.class);
		try {
			messageSender.sendMessage(" hi mini how are you");
		} catch (Exception e) {

			e.printStackTrace();
		}
		System.out.println("Message send successfully..");

		con.close();

	}

}
