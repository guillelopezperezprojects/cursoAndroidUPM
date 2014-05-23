package empresa;

public class Administrador extends Empleado {

	private final int HORAS_ADMINISTRADOR = 10;

	public Administrador(String dni, int horas) {
		super(dni, horas);
		// TODO Auto-generated constructor stub
		horas = positivizar(horas);
	}

	@Override
	public double salario() {
		// TODO Auto-generated method stub
		return this.getHoras() * HORAS_ADMINISTRADOR;
	}
	
	public int positivizar(int valor){
		if(valor < 0) return 0;
		else return valor;
	}

}
