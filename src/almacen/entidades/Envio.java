package almacen.entidades;
import java.time.*;
public class Envio extends Entrega{

	//atributos
	private LocalTime horaHasta;
	private LocalTime horaDesde;
	private double costo;
	private Ubicacion ubicacion;
	
	//constructor
	public Envio (LocalTime horaHasta, LocalTime horaDesde, double costo, Ubicacion ubicacion) {
		this.horaHasta=horaHasta;
		this.horaDesde=horaDesde;
		this.costo=costo;
		this.ubicacion=ubicacion;
	}
	
	//get y set
	public LocalTime getHoraHasta() {
		return horaHasta;
	}
	public void setHoraHasta(LocalTime horaHasta) {
		this.horaHasta = horaHasta;
	}
	public LocalTime getHoraDesde() {
		return horaDesde;
	}
	public void setHoraDesde(LocalTime horaDesde) {
		this.horaDesde = horaDesde;
	}
	public double getCosto() {
		return costo;
	}
	public void setCosto(double costo) {
		this.costo = costo;
	}
	public Ubicacion getUbicacion() {
		return ubicacion;
	}
	public void setUbicacion(Ubicacion ubicacion) {
		this.ubicacion = ubicacion;
	}
	
}
