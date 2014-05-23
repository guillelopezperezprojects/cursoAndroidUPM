package package01;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;

import upm.jbb.IO;

public class TestAngulo {
	private PV2D p1 = new PV2D(0,0);
	private PV2D p2 = new PV2D(0,0);
	private PV2D p3 = new PV2D(0,0);
	private PV2D p4 = new PV2D(0,0);
	
	private ArrayList<PV2D> verticesList = new ArrayList<PV2D>(Arrays.asList(p1,p2,p3,p4));
	
	
	private int [] angulos = {0, -1, 380, 20};
	
	private void testRectanguloPV2DInt(PV2D vertice, int grados){
		Angulo ang1 = new Angulo(vertice, grados);
		
	}
	
	/*
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
	
	private void testRectanguloIntInt(int a, int b, int bEsperada, int aEsperada){
			RectanguloUnit rec1 = new RectanguloUnit(bEsperada,aEsperada);
			assertEquals(rec1.getBase(),bEsperada);
			assertEquals(rec1.getBase(),bEsperada);
		}
		
		
		
	@Test public void testRectanguloIntInt(){
		for(int i = 0; i < bases.length; i++)
		{
			
			this.testRectanguloIntInt(this.bases[i], this.alturas[i], this.basesEsperadas[i], this.alturasEsperadas[i]);
			IO.out.println(this.bases[i] + " " + this.alturas[i]);
		}
	}
	
	*/
	
}
