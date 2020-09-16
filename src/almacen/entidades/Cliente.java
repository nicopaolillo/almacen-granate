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
	//validar identificador
	public boolean esNumerico(String cadena){
		boolean cond;
		try {
			Integer.parseInt(cadena);
			cond= true;
		}catch (NumberFormatException exception) {
			cond = false;
		}
		return cond;
	}
	
	public boolean validarDni (long dni)throws Exception{
		boolean cond=false;
		if(dni >= 00000000 && dni <= 99999999) {
			cond = true;
		}
		else {
			throw new Exception("Error: DNI ingresado no valido");
		}
		return cond;
	}
	public String toString() {
		return "Cliente: apellido=" + apellido + ", nombre=" + nombre + ", DNI=" + dni;
	}
}
