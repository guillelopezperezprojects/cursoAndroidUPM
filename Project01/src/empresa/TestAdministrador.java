package empresa;
import static org.junit.Assert.*;

import org.junit.Test;

public class TestAdministrador {
	private String[] arrayDni = {"12345678A", "12345678B","12345678C","12345678D"};
	private int [] arrayHoras = {10, 15, 20 , 25};
	private int [] arraySalarios = {100, 150, 200, 250};
	private final int LONGITUD_TEST = 4;
	
	private void testAdministradorStringInt(String dni, int horas){
		Administrador adm1 = new Administrador(dni, horas);
		assertEquals(adm1.getDni(), dni);
		assertEquals(adm1.getHoras(), horas);
	}
	
	@Test public void testAdministradorStringInt(){
		for(int i = 0; i < LONGITUD_TEST; i++){
			this.testAdministradorStringInt(this.arrayDni[i], this.arrayHoras[i]);
		}
	}
	
	private void testAdministradorSalario(String dni, int horas, int salario){
		Administrador adm1 = new Administrador(dni, horas);
		assertEquals(adm1.salario(), salario, 0.00001);
	}
	
	@Test public void testAdministradorSalario(){
		for(int i = 0; i < LONGITUD_TEST; i++){
			this.testAdministradorSalario(this.arrayDni[i], this.arrayHoras[i], this.arraySalarios[i]);
		}
	}
	
}
