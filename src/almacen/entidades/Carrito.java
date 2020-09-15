package almacen.entidades;
import java.time.*;
public class Carrito {

	//atributos
	private int id;
	private LocalDate fecha;
	private LocalTime hora;
	private boolean cerrado;
	private double descuento;
	private Cliente cliente;
	private ItemCarrito listaItemCarrito;
	private Entrega entrega;
	
	//get y set
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public LocalDate getFecha() {
		return fecha;
	}
	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}
	public LocalTime getHora() {
		return hora;
	}
	public void setHora(LocalTime hora) {
		this.hora = hora;
	}
	public boolean isCerrado() {
		return cerrado;
	}
	public void setCerrado(boolean cerrado) {
		this.cerrado = cerrado;
	}
	public double getDescuento() {
		return descuento;
	}
	public void setDescuento(double descuento) {
		this.descuento = descuento;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public ItemCarrito getListaItemCarrito() {
		return listaItemCarrito;
	}
	public void setListaItemCarrito(ItemCarrito listaItemCarrito) {
		this.listaItemCarrito = listaItemCarrito;
	}
	public Entrega getEntrega() {
		return entrega;
	}
	public void setEntrega(Entrega entrega) {
		this.entrega = entrega;
	}
}
