package mundoSistrans;

/**
 * @author s.baquero10
 * @version 1.0
 * @created 11-sep-2014 06:08:43 p.m.
 */
public class Oferente extends Usuario {

	private String tipoEntidad;
	public Rentabilidad m_Rentabilidad;
	public Valor m_Valor;
	public Intermediario m_Intermediario;

	public Oferente(){

	}

	public void finalize() throws Throwable {
		super.finalize();
	}
}//end Oferente