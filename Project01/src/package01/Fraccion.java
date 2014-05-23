package package01;

public class Fraccion {
	private int numerador, denominador;
	
	public Fraccion(){
		
	}

	public Fraccion(int numerador, int denominador) {
		super();
		this.numerador = numerador;
		this.denominador = denominador;
	}

	public int getNumerador() {
		return numerador;
	}

	public void setNumerador(int numerador) {
		this.numerador = numerador;
	}

	public int getDenominador() {
		return denominador;
	}

	public void setDenominador(int denominador) {
		this.denominador = denominador;
	}

	public double devResultadoFraccion() {
		double resultado = this.numerador / this.denominador;
		return resultado;
	}
	
	public void sumarFraccion(Fraccion fraccionSuma){
		
	}
	
	public void restarFraccion(Fraccion fraccionResta){
		
	}
	
	public void multiplicarFraccion(Fraccion fraccionMult){
		
	}



}
