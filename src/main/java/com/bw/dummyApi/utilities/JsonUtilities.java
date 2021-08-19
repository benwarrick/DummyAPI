package com.bw.dummyApi.utilities;

import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonUtilities {

	public static Map<String, JsonToken> jsonToStringMap(String json) throws JsonProcessingException {
		ObjectMapper objectMapper = new ObjectMapper();
	    Map<String, JsonToken> map = objectMapper.readValue(json, new TypeReference<>() {});
	    return map; 
	}

	
}
