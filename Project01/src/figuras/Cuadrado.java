package figuras;

public class Cuadrado extends Figura{
	
	
	private double lado;
	private final int LAD_CUADRADO = 4;
	
	public Cuadrado(String descripcion, double lado) {
		super(descripcion);
		this.setLado(lado);
		// TODO Auto-generated constructor stub
	}
	
	public Cuadrado(String descripcion) {
		super(descripcion);
		// TODO Auto-generated constructor stub
	}
	
	
	@Override
	public double area() {
		// TODO Auto-generated method stub
		return this.getLado()*this.getLado();
	}
	
	
	public double getLado() {
		return lado;
	}


	public void setLado(double lado) {
		this.lado = positivizar(lado);
	}


	@Override
	public int numLados() {
		// TODO Auto-generated method stub
		return LAD_CUADRADO;
	}
	
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Cuadrado";
	}

	private double positivizar(double valor){
		if(valor < 0) return 0;
		else return valor;
	}

}
