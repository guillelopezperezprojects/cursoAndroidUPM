package package01;

import upm.jbb.IO;

public class Pruebas {

	public Pruebas() {

	}

	public void pruebasRectangulo() {
		Rectangulo rec1 = new Rectangulo();

		PV2D p1 = new PV2D(0, 3);
		Rectangulo rec2 = new Rectangulo(p1, 2, 3);
		Rectangulo rec3 = new Rectangulo(p1, -1, -2);
		
		//PV2D p2 = rec1.getP1();
		//p2.getX();

		if (rec1.getP1().getX() == 0 && rec1.getP1().getY() == 0
				&& rec1.getBase() == 0 && rec1.getHeight() == 0) {
			IO.out.println("El constructor sin parametros es correcto");
		} else {
			IO.out.println("ERROR: El constructor sin parametros es incorrecto");
		}
		if (rec3.getBase() >= 0 && rec3.getHeight() >= 0) {
			IO.out.println("El rectangulo es correcto al introducir valores negativos");
		} else {
			IO.out.println("ERROR: El rectangulo es incorrecto al introducir valores negativos");
		}
		if (rec3.getBase() == 2 && rec3.getHeight() == 3) {
			IO.out.println("La construccion con parametros del rectangulo es correcta");
		} else {
			IO.out.println("ERROR: La construccion con parametros del rectangulo es incorrecta");
		}

	}

	public void pruebasMensajesConsola() {
		IO.out.println("---Hola mundo----");
		String msg = IO.in.readString("Escriba su mensaje");
		IO.out.println("Valor del mensaje:" + msg);
		int entero = IO.in.readInt("Escribe un numero entero");
		IO.out.println("Su numero es:" + entero);
		Integer[] intArray = (Integer[]) IO.in.read("Integer[]",
				"Array de enteros");
		IO.out.print("Array de enteros: ");
		IO.out.println(intArray);

		Byte b = (Byte) IO.in.read(new Byte("3"), "Valor por defecto(Byte)");
		IO.out.println("Valor del byte: " + b);

		IO.out.setStatusBar("Barra de estado");
	}

	public void pruebasIntervalo() {
		Intervalo intervalo1 = new Intervalo(2, 5);
		int entero = IO.in.readInt("Escribe un numero entero");
		IO.out.println("Su numero es:" + entero);
		if (intervalo1.perteneceIntervalo(entero)) {
			intervalo1.inIntervaloMessage(entero);
		} else {
			intervalo1.outIntervaloMessage(entero);
		}
	}

}
