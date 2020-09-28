package almacen.entidades;

public class ItemCarrito {

	//atributos
	private Articulo articulo;
	private int cantidad;
	
	//constructor
	public ItemCarrito (Articulo articulo,int cantidad){
		this.articulo=articulo;
		this.cantidad=cantidad;
	}
	
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
	// 9) + calcularSubTotalItem():double
		public double calcularSubTotalItem() {
			double total = this.articulo.getPrecio() * this.cantidad;
			return total;
		}

		public String toString() {
			return "ItemCarrito: articulo: " + articulo + ", cantidad: " + cantidad;
		}

}
