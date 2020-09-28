package almacen.entidades;

public class Articulo {

	//atributos
	private int id;
	private String nombre;
	private String codBarras;
	private double precio;
	
	//constructor
	public Articulo(int id,String nombre,String codBarras,double precio) {
		this.id=id;
		this.nombre=nombre;
		this.codBarras=codBarras;
		this.precio=precio;
	}
	
	//equals
		public boolean equals(Articulo articulo) {
			if(id==articulo.id) return true;
			else return false;
		}
	
	
	//get y set
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCodBarras() {
		return codBarras;
	}
	public void setCodBarras(String codBarras) {
		this.codBarras = codBarras;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	public boolean validarCodBarras(String codBarras) throws Exception{
		boolean cond = false;
		int cod = codBarras.length();
		if(cod == 13) {
			cond = true;
		}else {
			throw new Exception("El codigo de barras ingresado no es valido");
		}
		return cond;
	}
	
	public String toString() {
		return "\nArticulo id: " + id + ", nombre: " + nombre + ", codBarras: " + codBarras + ", precio: " + precio;
	}
	
}
