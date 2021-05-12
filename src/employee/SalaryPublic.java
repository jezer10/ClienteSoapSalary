package employee;

import javax.xml.ws.Endpoint;

public class SalaryPublic {
	public static void main(String[] args) {
		Endpoint.publish("http://localhost:2121/soap/salary", new SalaryDaoImpl());
	}
}
