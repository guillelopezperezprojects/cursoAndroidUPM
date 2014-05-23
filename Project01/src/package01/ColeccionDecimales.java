package package01;

public class ColeccionDecimales {
	double[] arrayDecimales;

	public ColeccionDecimales(int sizeArray) {
		
		 if(sizeArray<1){ 
			 this.arrayDecimales = new double[10];
		 }
		 

		this.arrayDecimales = new double[sizeArray];
	}

	public ColeccionDecimales(double[] arrayDecimales) {
		super();
		this.arrayDecimales = arrayDecimales;
	}

	public double[] getArrayDecimales() {
		return arrayDecimales;
	}

	public void setArrayDecimales(double[] arrayDecimales) {
		this.arrayDecimales = arrayDecimales;
	}

	public void sumarNumElementosArray(double numSuma, int posicion) {
		this.arrayDecimales[posicion] += numSuma;

	}

	public double getDecimal(int pos) {
		return this.arrayDecimales[pos];
	}

	public double sumaTotalElementosArray() {
		double total = 0;

		for (int i = 0; i < this.arrayDecimales.length; i++) {
			total = total + this.getDecimal(i);
		}

		return total;
	}

	public double devuelveMaximoArray() {
		double maxElementArray = 0;

		return maxElementArray;

	}

	public void ordenacionArray() {

	}

	public double metodoMayorArray() {
		double mayor = 0;

		if (this.isEmptyArray()) {
			// empty array
			return -1;
		} else {

			int i = 0;
			mayor = this.getDecimal(i);

			while (i < arrayDecimales.length) {
				if (this.getDecimal(i) > mayor) {
					mayor = this.getDecimal(i);
				}
				i++;
			}
			return mayor;
		}

	}

	public double metodoMenorArray() {
		double menor = 0;

		if (this.isEmptyArray()) {
			// empty array
			return -1;
		} else {

			menor = this.getDecimal(0);

			for (int i = 0; i < this.arrayDecimales.length; i++) {
				menor = this.getDecimal(i);
			}
			return menor;
		}

	}

	public double metodoMedia() {
		double media = 0;

		if (this.isEmptyArray()) {
			// empty array
			return -1;
		} else {
			
			for(double d: this.arrayDecimales){
				media+= media;
			}
			

			return media/this.arrayDecimales.length;
		}
	}

	public boolean isEmptyArray() {
		return this.arrayDecimales.length == 0;
	}

}
