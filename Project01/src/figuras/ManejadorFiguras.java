package figuras;

public class ManejadorFiguras {
	private Figura[] arrayFiguras;

	public ManejadorFiguras(Figura[] arrayFiguras) {
		super();
		this.arrayFiguras = arrayFiguras;
	}

	public ManejadorFiguras() {
		super();
	}

	public Figura mayor() {
		int mayor = 0;

		for (int i = 0; i < this.arrayFiguras.length; i++) {
			if (this.arrayFiguras[i].area() > this.arrayFiguras[mayor].area()) {
				mayor = i;
			}
		}

		return this.arrayFiguras[mayor];
	}

	public double areaTotal() {
		double area = 0;

		for (int i = 0; i < this.arrayFiguras.length; i++) {
			area += this.arrayFiguras[i].area();
		}

		return area;
	}

	public double ladosTotal() {
		double ladosTotales = 0;

		for (int i = 0; i < this.arrayFiguras.length; i++) {
			ladosTotales += this.arrayFiguras[i].numLados();
		}

		return ladosTotales;
	}

}
