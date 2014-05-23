package empresa;

import upm.jbb.IO;

public class MainEmpleados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Empleado[] arrayEmpleados = new Empleado[5];
		arrayEmpleados[0] = new Administrador("11111111A", 15);
		arrayEmpleados[1] = new Administrador("11111111B", 15);
		arrayEmpleados[2] = new Administrador("11111111C", 15);
		arrayEmpleados[3] = new Comercial("11111111D", 15, 200);
		arrayEmpleados[4] = new Comercial("11111111E", 15, 300);

		Nomina nomina1 = new Nomina();
		IO.out.println("Total de nominas: "
				+ nomina1.totalNominas(arrayEmpleados));

	
		TestAdministrador testAdm = new TestAdministrador();
		testAdm.testAdministradorStringInt();
		testAdm.testAdministradorSalario();
	
	}
	

}
