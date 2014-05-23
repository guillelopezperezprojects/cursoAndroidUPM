package empresa;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestComercial {
	private String[] arrayDni = { "12345678A", "12345678B", "12345678C",
			"12345678D" };
	private int[] arrayHoras = { 10, 15, 20, 25 };
	private int[] arrayComisiones = { 2, 2, 2, 2 };
	private double[] arraySalarios = { 82, 122, 162, 202 };
	private final int LONGITUD_TEST = 4;

	private void testComercialStringIntDouble(String dni, int horas,
			double comision) {
		Comercial com1 = new Comercial(dni, horas, comision);
		assertEquals(com1.getDni(), dni);
		assertEquals(com1.getHoras(), horas);
		assertEquals(com1.getComision(), comision, 0.00001);

	}

	@Test
	public void testComercialStringIntDouble() {
		for (int i = 0; i < LONGITUD_TEST; i++) {
			this.testComercialStringIntDouble(this.arrayDni[i],
					this.arrayHoras[i], this.arraySalarios[i]);
		}
	}

	private void testComercialSalario(String dni, int horas, double salario,
			int comision) {
		Comercial adm1 = new Comercial(dni, horas, comision);
		assertEquals(adm1.salario(), salario, 0.00001);
	}

	@Test
	public void testComercialSalario() {
		for (int i = 0; i < LONGITUD_TEST; i++) {
			this.testComercialSalario(this.arrayDni[i], this.arrayHoras[i],
					this.arraySalarios[i], this.arrayComisiones[i]);
		}
	}

}
