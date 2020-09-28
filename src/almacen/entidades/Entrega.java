package almacen.entidades;
import java.time.*;
abstract public class Entrega {

	//atributos
	protected int id;
	protected LocalDate fecha;
	protected boolean efectivo;
	
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
	public boolean isEfectivo() {
		return efectivo;
	}
	public void setEfectivo(boolean efectivo) {
		this.efectivo = efectivo;
	}

	@Override
	public String toString() {
		return "Entrega [id=" + id + ", fecha=" + fecha + ", efectivo=" + efectivo + "]";
	}
	
}
