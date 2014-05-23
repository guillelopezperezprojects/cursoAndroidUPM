package package01;

public class Contador {
	private int maxKm;
	private final int ZERO = 0;
	private int km;
	
	public Contador(){
		this.setMaxKm(10000);
		this.setKm(ZERO);
	}
	
	public Contador(int km, int maxKm){
		this.setKm(km);
		this.setMaxKm(maxKm);
	}
	
	private int getMaxKm() {
		return maxKm;
	}

	private void setMaxKm(int maxKm) {
		this.maxKm = maxKm;
	}

	private int getKm() {
		return km;
	}

	private void setKm(int km) {
		this.km = km;
	}
	
	public void contarAscendente()
	{
		
	}
	
	public void contarDescendente()
	{
		
	}
	
}
