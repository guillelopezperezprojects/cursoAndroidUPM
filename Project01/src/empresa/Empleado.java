package empresa;

public abstract class Empleado {
	private String dni;
	private int horas;

	public Empleado(String dni, int horas) {
		this.dni = dni;
		this.horas = horas;
	}

	public String getDni() {
		return this.dni;
	}

	public int getHoras() {
		return this.horas;
	}

	public abstract double salario();
}
