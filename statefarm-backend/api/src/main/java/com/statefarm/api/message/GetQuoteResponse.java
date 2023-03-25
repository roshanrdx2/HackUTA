package com.statefarm.api.message;

import org.springframework.web.bind.annotation.ResponseBody;

@ResponseBody
public class GetQuoteResponse extends BaseResponse{
	double value ;

	public double getValue() {
		return value;
	}

	public void setValue(double value) {
		this.value = value;
	}
}
