package empresa;

public class Comercial extends Empleado {

	private double comision;

	public Comercial(String dni, int horas, double comision) {
		super(dni, horas);
		this.setComision(comision);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double salario() {
		// TODO Auto-generated method stub
		return this.getComision() + this.getHoras() * 8;
	}

	public double getComision() {
		return comision;
	}

	public void setComision(double comision) {
		this.comision = comision;
	}

}
