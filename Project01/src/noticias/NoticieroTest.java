/**
 * 
 */
package noticias;

/**
 * @author android
 *
 */

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class NoticieroTest {

	private ArrayList<Receptor> arrayListReceptor;
	
	//public void addNoticiasArrayList()

	private void testNoticiero(ArrayList<Receptor> arrayReceptor) {
		
		Noticiero noticiero = new Noticiero();
		//arrayReceptor.add(noticiero);
		ReceptorMock receptorMock = new ReceptorMock();
		noticiero.registrar(receptorMock);
		noticiero.informar("123");
		assertEquals("123", receptorMock.getNota());

	}
	
	@Test
	public void testNoticiero(){
		while(this.arrayListReceptor.iterator().hasNext()){
			this.testNoticiero(arrayListReceptor);
		}
	}
}
