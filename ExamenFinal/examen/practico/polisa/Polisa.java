package polisa;

public class Polisa {
private String nombre;
private String descripcion;
private int anioVigente;
private int valorPoliza;

public  Polisa(String nombre,String descripcion, int anioVigente,int valorPoliza) {
	this.nombre=nombre;
	this.descripcion=descripcion;
	this.anioVigente=anioVigente;
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
	
}
