package com.junkodesain.baseproject.response;

public class BaseResponse {
	public long timestamp;
	public int status;
	public String error = "";
	public String message = "";
	public Object data;

	public void setError(int aStatus, String aError, String aMessage) {
		status = aStatus;
		error = aError;
		message = aMessage;
	}
}
