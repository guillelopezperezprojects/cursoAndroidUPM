package figuras;

public class Triangulo extends Figura{

	private double base;
	private double altura;
	private final int LAD_TRIANGULO = 4;
	
	public Triangulo(String descripcion, double base, double altura){
		super(descripcion);
		this.setBase(base);
		this.setAltura(altura);
	}
	
	public Triangulo(String descripcion){
		super(descripcion);
		this.setBase(0);
		this.setAltura(0);
	}
	
	
	
	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = positivizar(base);
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = positivizar(altura);
	}
	
	
	@Override
	public double area() {
		// TODO Auto-generated method stub
		return (this.base*this.altura)/2;
	}

	@Override
	public int numLados() {
		// TODO Auto-generated method stub
		return LAD_TRIANGULO;
	}
	
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Triangulo";
	}

	private double positivizar(double valor){
		if(valor < 0) return 0;
		else return valor;
	}


}
