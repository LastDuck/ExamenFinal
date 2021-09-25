package polisa;

public class PolizaVip extends Polisa {
	private String benefico;

	public PolizaVip(String nombre, String descripcion, int anioVigente, int valorPoliza,String benefico) {
		super(nombre, descripcion, anioVigente, valorPoliza);
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
