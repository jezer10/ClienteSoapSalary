package soap;


import javax.jws.WebService;

@WebService(endpointInterface = "soap.FactorialDao")
public class FactorialImpl implements FactorialDao {

	@Override
	public int calcularFactorial(int numero) {
		int f=1;
		for (int i = 0; i < numero; i++) {
			f*=(i+1);
		}
		return f;
	}
	
}
