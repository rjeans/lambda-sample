package org.jeansy.cloud.aws.serverless.demo.model;

public class Bar {
	
	private String value;

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
	
	public Bar() {}

	public Bar(String value) {
		super();
		this.value = value;
	}

}
