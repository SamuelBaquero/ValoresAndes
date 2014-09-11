package mundoSistrans;

/**
 * @author s.baquero10
 * @version 1.0
 * @created 11-sep-2014 06:08:43 p.m.
 */
public class Intermediario extends Usuario {

	private String numRegistro;
	private String tipoEntidad;
	public Operacion m_Operacion;

	public Intermediario(){

	}

	public void finalize() throws Throwable {
		super.finalize();
	}
}//end Intermediario