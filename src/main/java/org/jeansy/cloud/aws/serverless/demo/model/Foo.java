package org.jeansy.cloud.aws.serverless.demo.model;

public class Foo {
	
	private String value;

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public Foo() {};
	
	public Foo(String value) {
		super();
		this.value = value;
	}

}
