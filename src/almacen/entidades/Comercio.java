package almacen.entidades;
import java.util.*;
public class Comercio extends Actor {

	//atributos
	private String nombreComercio;
	private long cuit;
	private double costoFijo;
	private double costoPorKm;
	private int diaDescuento;
	private int porcentajeDescuentoDia;
	private int porcentajeDescuentoEfectivo;
	private List<DiaRetiro> listaDiaDeRetiro;
	private List<Carrito> listaCarrito;
	private List<Articulo> listArticulo;


	//constructor
	public Comercio (String nombreComercio,long cuit,double costoFijo,double costoPorKm,
			int diaDescuento,int porcentajeDescuentoDia, int porcentajeDescuentoEfectivo) {

		this.nombreComercio = nombreComercio;
		this.cuit = cuit;
		this.costoFijo = costoFijo;
		this.costoPorKm = costoPorKm;
		this.diaDescuento = diaDescuento;
		this.porcentajeDescuentoDia = porcentajeDescuentoDia;
		this.porcentajeDescuentoEfectivo = porcentajeDescuentoEfectivo;
		this.listaDiaDeRetiro = new ArrayList<DiaRetiro>();
		this.listaCarrito = new ArrayList<Carrito>();
		this.listArticulo = new ArrayList<Articulo>();
	}

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

	public List<DiaRetiro> getListaDiaDeRetiro() {
		return listaDiaDeRetiro;
	}

	public void setListaDiaDeRetiro(List<DiaRetiro> listaDiaDeRetiro) {
		this.listaDiaDeRetiro = listaDiaDeRetiro;
	}

	public List<Carrito> getListaCarrito() {
		return listaCarrito;
	}

	public void setListaCarrito(List<Carrito> listaCarrito) {
		this.listaCarrito = listaCarrito;
	}

	public List<Articulo> getListArticulo() {
		return listArticulo;
	}

	public void setListArticulo(List<Articulo> listArticulo) {
		this.listArticulo = listArticulo;
	}
}
