package com.statefarm.api.service;

import com.statefarm.api.message.BaseResponse;
import com.statefarm.api.message.GetQuoteResponse;
import com.statefarm.api.message.GetUserNameResponse;
import com.statefarm.api.message.LoginCredentials;
import com.statefarm.api.message.RegisterUserRequest;
import com.statefarm.api.message.UserDetails;
import com.statefarm.api.model.Users;


public interface UserService {
	public BaseResponse addUser(RegisterUserRequest newUser);
	public GetQuoteResponse getQuote(UserDetails details);
	public GetUserNameResponse getUsername(LoginCredentials credentials);
}
