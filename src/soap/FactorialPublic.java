package soap;

import javax.xml.ws.Endpoint;

public class FactorialPublic {
	public static void main(String[] args) {
		Endpoint.publish("http://localhost:2121/soap/fact", new FactorialImpl());

	}

}
