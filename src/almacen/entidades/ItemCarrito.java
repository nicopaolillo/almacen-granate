package almacen.entidades;

public class ItemCarrito {

	//atributos
	private Articulo articulo;
	private int cantidad;
	
	//get y set
	public Articulo getArticulo() {
		return articulo;
	}
	public void setArticulo(Articulo articulo) {
		this.articulo = articulo;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
}
