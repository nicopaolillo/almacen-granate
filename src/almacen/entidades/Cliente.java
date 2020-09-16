package almacen.entidades;

public class Cliente extends Actor {

	//atributos
	private String apellido;
	private String nombre;
	private int dni;
	
	//constructor
	public Cliente(String apellido,String nombre, int dni) {
		this.apellido=apellido;
		this.nombre=nombre;
		this.dni=dni;
	}

	//get y set
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getDni() {
		return dni;
	}
	public void setDni(int dni) {
		this.dni = dni;
	}

}
