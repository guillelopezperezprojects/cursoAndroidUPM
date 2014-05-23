/**
 * 
 */
package noticias;

import java.awt.List;
import java.util.ArrayList;

import upm.jbb.IO;

/**
 * @author android
 * 
 */
public class Noticiero {

	private ArrayList<Receptor> lista;

	public Noticiero() {
		this.lista = new ArrayList<Receptor>();
	}
	
	public Noticiero(ArrayList<Receptor> receptores) {
		this.lista = receptores;
	}

	public void registrar(Receptor receptor) {
		this.lista.add(receptor);
	}

	public void informar(String texto) {
		IO.out.println("Noticia: " + texto);
	}

}
