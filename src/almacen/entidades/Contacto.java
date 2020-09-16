package almacen.entidades;

public class Contacto {

	//atributos
	private String email;
	private String celular;
	private Ubicacion ubicacion;
	
	//constructor
	public Contacto(String email,String celular,Ubicacion ubicacion) {
		this.email=email;
		this.celular=celular;
		this.ubicacion=ubicacion;
	}

	//get y set
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCelular() {
		return celular;
	}
	public void setCelular(String celular) {
		this.celular = celular;
	}
	public Ubicacion getUbicacion() {
		return ubicacion;
	}
	public void setUbicacion(Ubicacion ubicacion) {
		this.ubicacion = ubicacion;
	}
}
