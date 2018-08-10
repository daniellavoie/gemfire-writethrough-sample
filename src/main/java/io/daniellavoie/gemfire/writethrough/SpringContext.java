package io.daniellavoie.gemfire.writethrough;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public enum SpringContext {
	INSTANCE;

	private ConfigurableApplicationContext context;

	private SpringContext() {
		context = new AnnotationConfigApplicationContext(WritethroughApplication.class);
	}

	public ConfigurableApplicationContext getContext() {
		return context;
	}
}
