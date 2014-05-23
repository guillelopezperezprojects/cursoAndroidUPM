package package01;

public class RectanguloUnit {
	private int base;
	private int altura;
	
	
	public RectanguloUnit(){
		this.setAltura(0);
		this.setBase(0);
	}
	
	public RectanguloUnit(int base, int altura){
		this.setBase(base);
		this.setAltura(altura);
	}
	
	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = positivizar(base);
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = positivizar(altura);
	}

	private int positivizar(int valor){
		if(valor<0) return 0;
		else return valor;
	}
	
	public double area(){
		return this.getBase()*this.getAltura();
	}
	
	public void area(int base, int altura, double area){
		area = base*altura;
	}
	
	public double perimetro()
	{
		return this.getBase()*2 + this.getAltura()*2;
	} 
	
}
