package package01;

public class PV3D extends PuntoTiempo{

	private double z;
	public PV3D(double x, double y, double z, double t) {
		super(x, y, t);
		// TODO Auto-generated constructor stub
		this.setZ(z);	
	}
	
	public double getZ() {
		return z;
	}
	public void setZ(double z) {
		this.z = z;
	}

	@Override 
	public String imprimirPunto(){
		return "X: " + this.getX() + " Y: " + this.getY() + " Z: "+ this.getZ() + " T: " + this.getT();	
	}
	
	@Override
	public double modulo() {
		// TODO Auto-generated method stub
		return Math.sqrt(this.getX()*this.getX() + this.getY()*this.getY() + this.z*this.z);
	}
	
	
}
