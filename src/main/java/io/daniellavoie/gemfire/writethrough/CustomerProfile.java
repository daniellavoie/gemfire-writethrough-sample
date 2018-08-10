package io.daniellavoie.gemfire.writethrough;

import java.io.Serializable;

public class CustomerProfile implements Serializable {
	private static final long serialVersionUID = 1L;

	private long id;
	private String name;

	public CustomerProfile() {

	}

	public CustomerProfile(long id, String name) {
		this.id = id;
		this.name = name;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
