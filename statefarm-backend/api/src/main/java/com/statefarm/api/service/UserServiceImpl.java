package com.statefarm.api.service;

import java.sql.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.statefarm.api.message.BaseResponse;
import com.statefarm.api.message.GetQuoteResponse;
import com.statefarm.api.message.GetUserNameResponse;
import com.statefarm.api.message.LoginCredentials;
import com.statefarm.api.message.RegisterUserRequest;
import com.statefarm.api.message.UserDetails;
import com.statefarm.api.model.Users;
import com.statefarm.api.repository.UsersRepository;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	UsersRepository repo;

	public BaseResponse addUser(RegisterUserRequest user) {
		BaseResponse response = new BaseResponse();
		try {
			Users userData = new Users(user.getFirstName(), user.getLastName(), user.getEmail(), user.getPhoneNumber(), user.getClaimNumber(), user.getUserPassword(), Date.valueOf(user.getDateOfBirth()));
			repo.saveAndFlush(userData);
			response.setResultcode(0);
			response.setResultDescription("Success");

		} catch (Exception e) {
			response.setResultcode(100);
			response.setResultDescription("Failed to create user");
		}
		return response;
	}

	public GetQuoteResponse getQuote(UserDetails details) {
		GetQuoteResponse response = new GetQuoteResponse();
		response.setValue(calculateQuote(details));
		response.setResultcode(0);
		response.setResultDescription("Success");
		return response;
	}

	public GetUserNameResponse getUsername(LoginCredentials credentials) {
		GetUserNameResponse response = new GetUserNameResponse();
		try {
			Users user = repo.findByEmailAndUserPassword(credentials.getUsername(), credentials.getPassword());
			String name = user.getFirstName() + user.getLastName();
			response.setUserName(name);
			response.setResultDescription("Login Success");
		} catch (Exception e) {
			response.setResultDescription("Login Failed");
		}

		response.setResultcode(0);

		return response;
	}

	private double calculateQuote(UserDetails details) {

		double monthlyPlan = details.getCoverageAmount()/(details.getCoverageTerm()*30);
		double age = 1.5*(2022 - Integer.parseInt(details.getDob().substring(0,4)));
		double sex = 0;
		if (details.getSex().equals("F")) {
			sex=0.15;
		}
		
		double bmi = details.getWeight()*10000/(details.getHeight()*details.getHeight());
		double idealBmi = 22.0;
		bmi = Math.abs(bmi - idealBmi)/idealBmi;
		double health = -0.5* Integer.parseInt(details.getHealth());
		double bias = 6.40;
		monthlyPlan = (monthlyPlan + age + sex + bmi + health + bias)/10;
		if (details.getIsSmoker().equals("yes")) {
			monthlyPlan+=3;
		}
		return monthlyPlan;
	}

}
