package package01;

public class PuntoTiempo extends PV2D{
	private double t;
	
	public PuntoTiempo(double x, double y, double t){
		super(x, y);
		this.setT(t);
	}

	public double getT() {
		return t;
	}

	public void setT(double t) {
		this.t = t;
	}
	
	public double velocidad(){
		return this.modulo()/this.getT();
	}
	
	@Override 
	public String imprimirPunto(){
		return "X: " + this.getX() + " Y: " + this.getY() + " T: " + this.getT();	
	}
}
