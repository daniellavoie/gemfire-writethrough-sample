package io.daniellavoie.gemfire.writethrough.service;

import io.daniellavoie.gemfire.writethrough.CustomerProfile;

public interface CustomerProfileService {
	void save(CustomerProfile customerProfile);
}
