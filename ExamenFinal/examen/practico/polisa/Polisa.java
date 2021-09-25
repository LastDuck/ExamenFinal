package polisa;

public class Polisa {
private String nombre;
private String descripcion;
private int anioVigente;
private String codigoPoliza;
private int valorPoliza;

public  Polisa(String nombre,String descripcion, int anioVigente,String codigoPoliza,int valorPoliza) {
	this.nombre=nombre;
	this.descripcion=descripcion;
	this.anioVigente=anioVigente;
	this.codigoPoliza=codigoPoliza;
	this.valorPoliza=valorPoliza;
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public String getDescripcion() {
	return descripcion;
}
public void setDescripcion(String descripcion) {
	this.descripcion = descripcion;
}
public int getAnioVigente() {
	return anioVigente;
}
public void setAnioVigente(int anioVigente) {
	this.anioVigente = anioVigente;
}
public int getValorPoliza() {
	return valorPoliza;
}
public void setValorPoliza(int valorPoliza) {
	this.valorPoliza = valorPoliza;
}
public String getCodigoPoliza() {
	return codigoPoliza;
}
public void setCodigoPoliza(String codigoPoliza) {
	this.codigoPoliza = codigoPoliza;
}
	
}
