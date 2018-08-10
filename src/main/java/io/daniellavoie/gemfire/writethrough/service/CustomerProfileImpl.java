package io.daniellavoie.gemfire.writethrough.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import io.daniellavoie.gemfire.writethrough.CustomerProfile;

@Service
public class CustomerProfileImpl implements CustomerProfileService {
	private static final Logger LOGGER = LoggerFactory.getLogger(CustomerProfileImpl.class);

	@Override
	public void save(CustomerProfile customerProfile) {
		LOGGER.info("Saving " + customerProfile + ".");
	}

}
