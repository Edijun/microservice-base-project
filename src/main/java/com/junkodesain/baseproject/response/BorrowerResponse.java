package com.junkodesain.baseproject.response;

import org.springframework.http.HttpStatus;

public class BorrowerResponse extends BaseResponse {
	
	public BorrowerResponse() {
		timestamp = System.currentTimeMillis() / 1000L;
	}

	public void setSucces(Object object) {
		timestamp = System.currentTimeMillis() / 1000L;
		status = HttpStatus.OK.value();
		data = object;
	}

	public void setSuccess() {
		timestamp = System.currentTimeMillis() / 1000L;
		status = HttpStatus.OK.value();
		data = null;
	}
}

