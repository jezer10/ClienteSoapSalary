package soap;

public class ClienteService {
	public static void main(String[] args) {
		FactorialImplService fic = new FactorialImplService();
		FactorialDao fd = fic.getFactorialImplPort();
		
		System.out.println(fd.calcularFactorial(3));
	}

}
