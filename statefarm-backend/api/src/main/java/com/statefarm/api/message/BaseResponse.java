package com.statefarm.api.message;

public class BaseResponse {
	int resultcode;
	String resultDescription;
	public int getResultcode() {
		return resultcode;
	}
	public void setResultcode(int resultcode) {
		this.resultcode = resultcode;
	}
	public String getResultDescription() {
		return resultDescription;
	}
	public void setResultDescription(String resultDescription) {
		this.resultDescription = resultDescription;
	}
	
	
}
