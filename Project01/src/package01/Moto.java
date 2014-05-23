package package01;

public class Moto {
	private int cilindrada, numBastidor;
	private String marca, modelo;
	double precio;
	
	
	
	public Moto(int cilindrada, int numBastidor, String marca, String modelo,
			double precio) {
		super();
		this.cilindrada = cilindrada;
		this.numBastidor = numBastidor;
		this.marca = marca;
		this.modelo = modelo;
		this.precio = precio;
	}
	
	
	private int getCilindrada() {
		return cilindrada;
	}
	private void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}
	private int getNumBastidor() {
		return numBastidor;
	}
	private void setNumBastidor(int numBastidor) {
		this.numBastidor = numBastidor;
	}
	private String getMarca() {
		return marca;
	}
	private void setMarca(String marca) {
		this.marca = marca;
	}
	private String getModelo() {
		return modelo;
	}
	private void setModelo(String modelo) {
		this.modelo = modelo;
	}
	private double getPrecio() {
		return precio;
	}
	private void setPrecio(double precio) {
		this.precio = precio;
	}
	
}
