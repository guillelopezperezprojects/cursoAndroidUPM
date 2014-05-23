package package01;

import upm.jbb.IO;

public class PruebasPuntos {
	private PV2D p1 = new PV2D(2, 2);
	private PuntoTiempo p2 = new PV3D(2, 2, 2, 2);
	private PuntoTiempo p3 = new PV3D(2,2,2,2);
	
	public void pruebaModulo(){
		
		IO.out.println("PRUEBAS MODULO");
		IO.out.println("Punto p1: " + p1.imprimirPunto());
		IO.out.println("Modulo: " + p1.modulo());
		IO.out.println("Punto p2: " + p2.imprimirPunto());
		IO.out.println("Modulo: " + p2.modulo());
		IO.out.println("Punto p3: " + p3.imprimirPunto());
		IO.out.println("Modulo: " + p3.modulo());
		IO.out.println("---------------------");
	}
	
	
	public void pruebaVelocidad(){
		
		IO.out.println("PRUEBAS MODULO");
		IO.out.println("Punto p2: " + p2.imprimirPunto());
		IO.out.println("Modulo: " + p2.velocidad());
		IO.out.println("Punto p3: " + p3.imprimirPunto());
		IO.out.println("Modulo: " + p3.modulo());
		IO.out.println("---------------------");
	}
	
	
	
}
