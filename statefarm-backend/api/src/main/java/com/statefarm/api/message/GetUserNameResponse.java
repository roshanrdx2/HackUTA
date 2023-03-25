package com.statefarm.api.message;

import org.springframework.web.bind.annotation.ResponseBody;

@ResponseBody
public class GetUserNameResponse extends BaseResponse{
	String userName;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
}
