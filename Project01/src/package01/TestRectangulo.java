

package package01;
import static org.junit.Assert.*;

import org.junit.Test;

import upm.jbb.IO;

public class TestRectangulo {

		private int bases[] = {2, 3, -1, 0};
		private int alturas[] = {2, 3, -1, 0};
		private int basesEsperadas[] = {2, 3, 0, 0};
		private int alturasEsperadas[] = {2, 3, 0, 0};
		private int areas [] = {4, 9, 0, 0};
		private int perimetros [] = {8, 12, 0, 0};
		
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
		
	@Test public void rectanguloTest(){
		RectanguloUnit rec1 = new RectanguloUnit();
		assertEquals(rec1.getBase(),0);
		assertEquals(rec1.getBase(),0);
		
	}
	
	private void testArea(int b, int a, double area){
		RectanguloUnit rec1 = new RectanguloUnit(b, a);
		assertEquals(area, rec1.area(),0.00001);
	}
	
	
	@Test public void areaTest(){
		for(int i = 0; i < this.alturas.length; i++)
		{
			
			this.testArea(this.bases[i], this.alturas[i], this.areas[i]);
			IO.out.println(this.bases[i] + " "+ this.alturas[i]+ " " +  this.areas[i]);
		}
		
	}
	
	private void testPerimetro(int b, int a, int perimetro){
		RectanguloUnit rec1 = new RectanguloUnit(b,a);
		assertEquals(perimetro,rec1.perimetro(),0.000001);
	}
	
	@Test public void perimetroTest(){
		for(int i = 0; i < this.perimetros.length; i++)
		{
			this.testPerimetro(this.bases[i], this.alturas[i], this.perimetros[i]);
		}
		
	}
	
	
}
