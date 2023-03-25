package com.statefarm.api.message;

import java.util.List;

import org.springframework.web.bind.annotation.ResponseBody;

import com.statefarm.api.model.Agents;

@ResponseBody
public class FetchAgentsResponse extends BaseResponse{
	public List<Agents> getList() {
		return list;
	}

	public void setList(List<Agents> list) {
		this.list = list;
	}

	List<Agents> list ;
}
