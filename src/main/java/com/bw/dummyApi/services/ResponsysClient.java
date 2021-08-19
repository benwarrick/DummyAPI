package com.bw.dummyApi.services;

import com.bw.dummyApi.api.DummyEntity;
import com.bw.dummyApi.api.EmailRequest2;
import com.bw.dummyApi.api.ResponsysRequest;

public interface ResponsysClient {
	public DummyEntity postEmail(EmailRequest2 request);
}
