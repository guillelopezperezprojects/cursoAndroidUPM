package empresa;

public class Nomina {

	public double totalNominas(Empleado[] empleados) {
		double nominaTotal = 0.0;
		for (Empleado emp : empleados) {
			nominaTotal += emp.salario();
		}

		return nominaTotal;
	}
}
