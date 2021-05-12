package employee;



public class ClientService {
	public static void main(String[] args) {
		SalaryDaoImplService sis = new SalaryDaoImplService();
		SalaryDao sd = sis.getSalaryDaoImplPort();
		System.out.println(sd.calcularSalarioPorHoras(50, 20));
	}
	
	

}
