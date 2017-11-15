package application;

import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class Acordendpoint {
	
	private static final String NAMESPACE_URI = "http://ACORD.org/Standards/Life/2";
	
	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "getGreetingMessage")
	@ResponsePayload
	public String getGreetingMessage(@RequestPayload String name) {
		return("Hi" + name);
	}
}
