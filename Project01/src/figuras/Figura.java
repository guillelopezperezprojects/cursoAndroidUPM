package figuras;

public abstract class Figura {
	private String descripcion;

	public Figura(String descripcion) {
		super();
		this.descripcion = descripcion;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public abstract double area();

	public abstract int numLados();

}
