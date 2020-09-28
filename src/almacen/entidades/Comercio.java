package almacen.entidades;
import java.util.*;
import java.time.*;
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
	// Constructor vacio para realizar los testeos.
		public Comercio() {
			this. listaDiaDeRetiro = new ArrayList<DiaRetiro>();
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

	public List<DiaRetiro> traerDiaRetiro(){
		return this.listaDiaDeRetiro;
	}

	
	
	public boolean agregarDiaRetiro(int diaSemana, LocalTime horaDesde, LocalTime horaHasta, int intervalo) {

		int idDiaRetiro = 1;
		if (!listaDiaDeRetiro.isEmpty()) {
			idDiaRetiro = listaDiaDeRetiro.get(listaDiaDeRetiro.size() - 1).getId() + 1;

		}
		return listaDiaDeRetiro.add(new DiaRetiro(idDiaRetiro, diaSemana, horaDesde, horaHasta, intervalo));
	}
	
	
	public boolean validarIdentificadorUnico (String cuit) throws Exception {
		boolean cond = false;
		int aux;
		int num1 = Character.getNumericValue(cuit.charAt(0));  //x
		int num2 = Character.getNumericValue(cuit.charAt(1)); //y
		int num3 = Character.getNumericValue(cuit.charAt(2));
		int num4 = Character.getNumericValue(cuit.charAt(3));
		int num5 = Character.getNumericValue(cuit.charAt(4));
		int num6 = Character.getNumericValue(cuit.charAt(5));
		int num7 = Character.getNumericValue(cuit.charAt(6));
		int num8 = Character.getNumericValue(cuit.charAt(7));
		int num9 = Character.getNumericValue(cuit.charAt(8));
		int num10 = Character.getNumericValue(cuit.charAt(9));
		
		int subTotal = num1 * 5 + num2 * 4 + num3 * 3 + num4 * 2 + num5 * 7 + num6 * 6 + num7 * 5 + num8 * 4 + num9 * 3
				+ num10 * 2;
		int total = (subTotal % 11);
		if(total == 0 && cuit.length() != 10) {
			aux = 0;
			throw new Exception("Error: cuit ingresado no es valido");
		}else if (total == 1 && (num1 == 2 && num2 ==0)) {
			aux =9;
			cond = true;
		}else {
			aux = (11 - total);
			cond = false;
		}
		return cond;
	}
	
	public boolean validarIdentificadorUnico(long cuit) throws Exception {
		boolean cond = false;
		
		if(cuit >= 1111111111l && cuit <= 9999999999l) {	
			cond = true;
		} else {
			cond = false;
			throw new Exception("Error: Cuit ingresado no es valido");

		}
		return cond;
	}
}
