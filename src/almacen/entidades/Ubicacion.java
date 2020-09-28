package almacen.entidades;

public class Ubicacion {

	//atributos
	private double latitud;
	private double longitud;
	
	//constructor
	public Ubicacion(double latitud,double longitud) {
		this.latitud=latitud;
		this.longitud=longitud;
	}

	//get y set
	public double getLatitud() {
		return latitud;
	}
	public void setLatitud(double latitud) {
		this.latitud = latitud;
	}
	public double getLongitud() {
		return longitud;
	}
	public void setLongitud(double longitud) {
		this.longitud = longitud;
	}
	// 17) + traerUbicacion() : Ubicacion
	
		public Ubicacion traerUbicacion() {
			
			//return new Ubicacion(latitud, longitud);
			//Retorna el objeto donde estoy parado.
			return this; 
		}
		
		public String toString() {
			return "Ubicacion: latitud: " + latitud + ", longitud: " + longitud;
		}
}
