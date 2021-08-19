package com.bw.dummyApi;

import java.util.Map;
import java.util.Map.Entry;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import com.bw.dummyApi.utilities.JsonUtilities;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.JsonProcessingException;

@Component
public class EmailQueueListener {
	
	@JmsListener(destination="D365.Utilities.Email.Send.Topic::D365.Utilities.Email.Boomi.Queue")
	public void receive(String msg) {
		try {
			Map<String,JsonToken> JsonMap = JsonUtilities.jsonToStringMap(msg);
			
			for (Map.Entry<String,JsonToken> entry : JsonMap.entrySet()) {
				System.out.println(entry.getKey() + " : " + entry.getValue());
			}
			
		} catch (JsonProcessingException je) {
			System.out.println(je); 
		}
	}
	
}
