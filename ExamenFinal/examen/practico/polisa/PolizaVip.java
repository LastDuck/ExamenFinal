package polisa;

public class PolizaVip extends Polisa {
	private String benefico;

	public PolizaVip(String nombre, String descripcion, int anioVigente,String codigoPoliza, int valorPoliza,String benefico) {
		super(nombre, descripcion, anioVigente, codigoPoliza, valorPoliza);
		// TODO Auto-generated constructor stub
		this.benefico=benefico;
	}

	public String getBenefico() {
		return benefico;
	}

	public void setBenefico(String benefico) {
		this.benefico = benefico;
	}

}
