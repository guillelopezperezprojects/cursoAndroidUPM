package figuras;

import upm.jbb.IO;

public class MainFiguras {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Figura[] figuras = new Figura[3];

		figuras[0] = new Triangulo("Triangulo", 2, 2);
		figuras[1] = new Triangulo("Triangulo", 2, 3);
		figuras[2] = new Cuadrado("Cuadrado", 2);

		ManejadorFiguras manejador = new ManejadorFiguras(figuras);
		
		//FIGURA MAYOR
		IO.out.println("Figura Mayor: " + manejador.mayor().getDescripcion());
		//AREA TOTAL
		IO.out.println("Area Total: " + manejador.areaTotal());
		//LADOS TOTAL
		IO.out.println("Figura Mayor: " + manejador.ladosTotal());
		

	}

}
