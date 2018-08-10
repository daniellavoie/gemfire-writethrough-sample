package io.daniellavoie.gemfire.writethrough;

import org.apache.geode.cache.CacheListener;
import org.apache.geode.cache.EntryEvent;
import org.apache.geode.cache.RegionEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import io.daniellavoie.gemfire.writethrough.service.CustomerProfileService;

public class SpringCacheListener implements CacheListener<String, CustomerProfile> {
	private static final Logger LOGGER = LoggerFactory.getLogger(SpringCacheListener.class);

	private CustomerProfileService customerProfileService;

	public static void main(String[] args) {
		new SpringCacheListener();
	}

	public SpringCacheListener() {
		try {
			LOGGER.info("Initializing SpringCacheListener.");

			customerProfileService = SpringContext.INSTANCE.getContext().getBean(CustomerProfileService.class);

			LOGGER.info("SpringCacheListener initializating completed.");
		} catch (Throwable ex) {
			LOGGER.error("Error while initializing SpringCacheListner", ex);
		}
	}

	public SpringCacheListener(CustomerProfileService customerProfileService) {
		this.customerProfileService = customerProfileService;
	}

	@Override
	public void close() {

	}

	@Override
	public void afterCreate(EntryEvent<String, CustomerProfile> event) {
		LOGGER.info("Processing customer profile creation.");

		customerProfileService.save(event.getNewValue());
	}

	@Override
	public void afterUpdate(EntryEvent<String, CustomerProfile> event) {
		customerProfileService.save(event.getNewValue());
	}

	@Override
	public void afterInvalidate(EntryEvent<String, CustomerProfile> event) {

	}

	@Override
	public void afterDestroy(EntryEvent<String, CustomerProfile> event) {

	}

	@Override
	public void afterRegionInvalidate(RegionEvent<String, CustomerProfile> event) {

	}

	@Override
	public void afterRegionDestroy(RegionEvent<String, CustomerProfile> event) {

	}

	@Override
	public void afterRegionClear(RegionEvent<String, CustomerProfile> event) {

	}

	@Override
	public void afterRegionCreate(RegionEvent<String, CustomerProfile> event) {

	}

	@Override
	public void afterRegionLive(RegionEvent<String, CustomerProfile> event) {

	}

}
