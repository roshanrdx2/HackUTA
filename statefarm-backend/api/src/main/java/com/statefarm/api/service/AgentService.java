package com.statefarm.api.service;

import com.statefarm.api.message.FetchAgentsResponse;

public interface AgentService {
	public FetchAgentsResponse getAgents(Integer zipcode);
}
