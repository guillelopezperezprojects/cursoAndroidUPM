package package01;

public class Angulo {
	private PV2D vertice;
	private int angGrados ;
	
	public Angulo(PV2D vertice, int angGrados) {
		super();
		this.setVertice(vertice);
		this.setAngGrados(angGrados);
	}
	
	public Angulo(){
		PV2D verticeAngulo = new PV2D(0,0);
		this.setVertice(verticeAngulo);
		this.setAngGrados(0);
	}
	
	public PV2D getVertice() {
		return vertice;
	}
	
	public void setVertice(PV2D vertice) {
		this.vertice = vertice;
	}
	
	public double getAngGrados() {
		return angGrados;
	}
	
	public void setAngGrados(int angGrados) {
		this.angGrados = positivizar(angGrados);
	}
	
	private int positivizar(int valor){
		if(valor<0) return valor%360;
		else return valor;
	}
	
	private int valorIntervalo0a360(int valor){
		return valor % 360;
	}
	
	
	public void suma(int grado)
	{
		int suma = (( grado %360) + this.angGrados)%360;
	}
	
	public void restarAngulos(int grado)
	{
		int resta = (( grado %360) - this.angGrados)%360;
	}
	
	public double conversorGradRad(double angGrados){
		double angRadianes = Math.toRadians(angGrados);
	
		return angRadianes;
	}
	
	public double conversorRadGrad(double angRadianes){
		double angGrados = Math.toDegrees(angRadianes);
		
		return angGrados;
	}
	
}
