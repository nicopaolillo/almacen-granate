package almacen.entidades;

public class Comercio extends Actor {

	//atributos
	private String nombreComercio;
	private long cuit;
	private double costoFijo;
	private double costoPorKm;
	private int diaDescuento;
	private int porcentajeDescuentoDia;
	private int porcentajeDescuentoEfectivo;
	private DiaRetiro listaDiaDeRetiro;
	private Carrito listaCarrito;
	
	//get y set
	public String getNombreComercio() {
		return nombreComercio;
	}
	public void setNombreComercio(String nombreComercio) {
		this.nombreComercio = nombreComercio;
	}
	public long getCuit() {
		return cuit;
	}
	public void setCuit(long cuit) {
		this.cuit = cuit;
	}
	public double getCostoFijo() {
		return costoFijo;
	}
	public void setCostoFijo(double costoFijo) {
		this.costoFijo = costoFijo;
	}
	public double getCostoPorKm() {
		return costoPorKm;
	}
	public void setCostoPorKm(double costoPorKm) {
		this.costoPorKm = costoPorKm;
	}
	public int getDiaDescuento() {
		return diaDescuento;
	}
	public void setDiaDescuento(int diaDescuento) {
		this.diaDescuento = diaDescuento;
	}
	public int getPorcentajeDescuentoDia() {
		return porcentajeDescuentoDia;
	}
	public void setPorcentajeDescuentoDia(int porcentajeDescuentoDia) {
		this.porcentajeDescuentoDia = porcentajeDescuentoDia;
	}
	public int getPorcentajeDescuentoEfectivo() {
		return porcentajeDescuentoEfectivo;
	}
	public void setPorcentajeDescuentoEfectivo(int porcentajeDescuentoEfectivo) {
		this.porcentajeDescuentoEfectivo = porcentajeDescuentoEfectivo;
	}
	public DiaRetiro getListaDiaDeRetiro() {
		return listaDiaDeRetiro;
	}
	public void setListaDiaDeRetiro(DiaRetiro listaDiaDeRetiro) {
		this.listaDiaDeRetiro = listaDiaDeRetiro;
	}
	public Carrito getListaCarrito() {
		return listaCarrito;
	}
	public void setListaCarrito(Carrito listaCarrito) {
		this.listaCarrito = listaCarrito;
	}
}
