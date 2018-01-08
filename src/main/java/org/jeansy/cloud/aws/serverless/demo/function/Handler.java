package org.jeansy.cloud.aws.serverless.demo.function;

import org.jeansy.cloud.aws.serverless.demo.model.Bar;
import org.jeansy.cloud.aws.serverless.demo.model.Foo;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;


public class Handler implements RequestHandler<Foo, Bar> {


	@Override
	public Bar handleRequest(Foo foo, Context context) {
		
		Bar bar=new Bar("Fuck off "+foo.getValue());
		return bar;
	}
}