/**
 * 
 */
package noticias;

/**
 * @author android
 *
 */
public class ReceptorMock implements Receptor{

	private String nota="";
	@Override
	public void noticia(String texto) {
		// TODO Auto-generated method stub
		this.nota = texto;
	}
	public String getNota() {
		return nota;
	}
	
	

}

/*
 * 
 *
http://www.iesgrancapitan.org/dawblog/?p=425

ReceptorMock

public ReceptorMock implements Receptor;

private String nota="";

noticia(){
this.nota=nota;
}

public void getNota(){
}



NoticieroTest 

@before
n = new Noticiero();
mock = new ReceptorMock();
n.registrar(mock);
n.informar("123");
assertEquals("123", mock.getNota());
 
 * 
 * */
 