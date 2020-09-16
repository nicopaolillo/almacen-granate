package almacen.entidades;
import java.time.*;
public class RetiroLocal extends Entrega {

	//atributos
	private LocalTime horaEntrega;
	
	//constructor
	public RetiroLocal (LocalTime horaEntrega) {
		this.horaEntrega=horaEntrega;
	}
	
	//get y set
	public LocalTime getHoraEntrega() {
		return horaEntrega;
	}
	public void setHoraEntrega(LocalTime horaEntrega) {
		this.horaEntrega=horaEntrega;
	}
}
