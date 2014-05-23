package package01;

import upm.jbb.IO;

public class Intervalo {
	private int valorMax, valorMin;

	public Intervalo(int valorMax, int valorMin) {
		super();
		this.setValorMax(valorMax);
		this.setValorMin(valorMin);
	}

	private int getValorMax() {
		return valorMax;
	}

	private void setValorMax(int valorMax) {
		this.valorMax = valorMax;
	}

	private int getValorMin() {
		return valorMin;
	}

	private void setValorMin(int valorMin) {
		this.valorMin = valorMin;
	}

	boolean perteneceIntervalo(int valor) {
		if (valor >= this.getValorMin() && valor <= this.getValorMax()) {
			return true;
		} else {
			return false;
		}

	}

	public void inIntervaloMessage(int valor) {
		IO.out.println("El valor: " + valor + " pertenece al intervalo");
	}

	public void outIntervaloMessage(int valor) {
		IO.out.println("El valor: " + valor + "  NO pertenece al intervalo");
	}
}
