/**
 * 
 */
package noticias;

import upm.jbb.IO;

/**
 * @author android
 * 
 */
public class UnReceptor implements Receptor {

	@Override
	public void noticia(String texto) {
		// TODO Auto-generated method stub
		IO.out.println("Noticia: " + texto);
	}

}
