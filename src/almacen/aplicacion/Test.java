package almacen.aplicacion;
import almacen.entidades.*;
public class Test {

	public static void main(String[] args) throws Exception {

//genero exception
		
Cliente cliente = new Cliente("Pacheco","Horacio",35248722);

cliente.setDni(41237024);

System.out.println(cliente.validarDni("41237024"));
		
	}

}
