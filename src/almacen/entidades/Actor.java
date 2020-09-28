package almacen.entidades;

abstract public class Actor {
   
	//atributos
	private int id;
	protected Contacto contacto;
   
	//get y set
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Contacto getContacto() {
		return contacto;
	}
	public void setContacto(Contacto contacto) {
		this.contacto = contacto;
	}

	@Override
	public String toString() {
		return "Actor [id=" + id + ", contacto=" + contacto + "]";
	}
}
