package almacen.aplicacion;
import almacen.entidades.*;
import java.time.*;
public class Test {

	public static void main(String[] args) throws Exception {



		Cliente cliente = new Cliente("Pacheco","Horacio",35248722);
		Comercio comercio=new Comercio("654",54,41,2,2,2,2);

		cliente.setDni(41237024);
		comercio.agregarDiaRetiro(15, LocalTime.now(), LocalTime.now(), 4);
		comercio.agregarDiaRetiro(14, LocalTime.now(), LocalTime.now(), 1);
		comercio.agregarDiaRetiro(12, LocalTime.now(), LocalTime.now(), 7);
		
		System.out.println("Digito verificador: "+comercio.validarIdentificadorUnico("2041237024"));
		System.out.println("verificador de DNI: "+cliente.validarDni(41237024));
		System.out.println(comercio.traerDiaRetiro());

	}
}