package polisa;

public class PolizaGeneral extends Polisa {

	private String codigoDescuento;
	private String numeroSeguro;
	
	public PolizaGeneral(String nombre, String descripcion, int anioVigente, String codigoPoliza,int valorPoliza,String codigoDescuento,String numeroSeguro) {
		super(nombre, descripcion, anioVigente, codigoPoliza,valorPoliza);
		// TODO Auto-generated constructor stub
		this.codigoDescuento=codigoDescuento;
		this.numeroSeguro=numeroSeguro;
	}
	
	public String getCodigoDescuento() {
		return codigoDescuento;
	}

	public void setCodigoDescuento(String codigoDescuento) {
		this.codigoDescuento = codigoDescuento;
	}

	public String getNumeroSeguro() {
		return numeroSeguro;
	}

	public void setNumeroSeguro(String numeroSeguro) {
		this.numeroSeguro = numeroSeguro;
	}

	

}
