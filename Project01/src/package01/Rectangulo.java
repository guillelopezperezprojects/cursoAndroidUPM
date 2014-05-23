package package01;

import upm.jbb.IO;

public class Rectangulo {
	private PV2D p1;
	private double height, base;
	

	// int esquinaInferiorIzquierda (X,Y)
	public Rectangulo(PV2D p1, int base, int heigth) {
		super();
		this.setP1(p1); 
		this.setBase(base);
		this.setHeight(heigth);	
	}
	
	public Rectangulo(){
		PV2D pInicial = new PV2D(0,0);
		this.setP1(pInicial);
		this.setBase(0);
		this.setHeight(0);
	}
	
	private double positivo(double valor){
		if(valor<0) return 0;
		else return valor;
	}

	public PV2D getP1() {
		return p1;
	}

	public void setP1(PV2D p1) {
		this.p1 = p1;
	}


	public double getHeight() {
		return this.height;
	}


	public void setHeight(int height) {
		this.height = positivo(height);
	}


	public double getBase() {
		return base;
	}


	public void setBase(int base) {
		this.base = positivo(base);
	}

	



	
	public double areaRectangle()
	{
		return this.getBase() * this.getHeight();
	}
	
	public double perimeterRentagle(){
		return 2*this.getBase() + 2*this.getHeight();
	}
	
	public void paintRectangle(){
		IO.out.println("("+ this.getP1().getX() + "," + this.getP1().getY());
	}
	

}
