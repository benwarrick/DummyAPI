package com.bw.dummyApi.jms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;
import org.springframework.jms.support.converter.MappingJackson2MessageConverter;
import org.springframework.jms.support.converter.MessageConverter;
import org.springframework.jms.support.converter.MessageType;

@Component
public class Messenger {

	@Autowired
	private JmsTemplate jmsTemplate;

	public void send(String queue, String msg) {
		jmsTemplate.setPubSubDomain(true);
		jmsTemplate.setTimeToLive(5000);
		jmsTemplate.convertAndSend(queue, msg, m -> {
			//m.setJMSType(JMSType);
			return m; 
		});

	}

	/*@Bean // Serialize message content to json using TextMessage
	public MessageConverter jacksonJmsMessageConverter() {
		MappingJackson2MessageConverter converter = new MappingJackson2MessageConverter();
		converter.setTargetType(MessageType.TEXT);
		converter.setTypeIdPropertyName("_type");
		return converter;
	}*/
}
