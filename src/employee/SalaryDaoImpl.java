package employee;

import javax.jws.WebService;

@WebService(endpointInterface = "employee.SalaryDao")
public class SalaryDaoImpl implements SalaryDao {

	@Override
	public double calcularSalarioPorHoras(int horas, double salarioHora) {
		double salarioBruto=0;
		double salarioNormal=0;
		int horasNormales=(40-(40-horas));
		if (horasNormales<0){
			salarioNormal=horasNormales*salarioHora;
			salarioBruto+=salarioNormal;
		}
		else if(horas>40) {
			salarioNormal=salarioHora*40;
			salarioBruto+=salarioNormal;
			System.out.println("Tienes un salario de horas normales de: "+salarioNormal);
			int horasExtras=horas-40;
			double salarioExtra=horasExtras*(salarioHora*1.5);
			salarioBruto+=salarioExtra;
			System.out.println("Tu salario extra es "+salarioExtra);
		}
		System.out.println("Tu salario bruto es "+salarioBruto);
		return salarioBruto;
	}



}
