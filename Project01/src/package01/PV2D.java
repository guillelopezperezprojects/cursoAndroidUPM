package package01;

public class PV2D {
	double x, y;
	
	public PV2D(double x, double y) {
		super();
		this.setX(x);
		this.setY(y);
	}
	
	public PV2D(){
		this(0,0);
	};



	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}
	
	public double modulo(){
		return Math.sqrt(this.getX()*this.getX()+ this.getY()*this.getY());
	}
	
	public String imprimirPunto(){
		return "X: " + this.getX() + " Y: " + this.getY();	
	}
}


