package almacen.aplicacion;
import almacen.entidades.*;
import java.util.*;
import java.time.*;
public class Test {

	public static void main(String[] args) throws Exception {

		LocalDate date = LocalDate.of(2019, 03, 01);
		LocalTime time = LocalTime . of (5, 30, 45, 35);
		
		Cliente cliente = new Cliente("Pacheco","Horacio",35248722);
		Comercio comercio = new Comercio("654",54,41,2,2,2,2);
		Ubicacion ubicacion = new Ubicacion (25,40);
		Envio envio = new Envio (time, time, 40, ubicacion);
		Carrito carrito = new Carrito (1 ,date, time,false,25,
						  cliente,envio);
		Articulo articulo1=new Articulo(2,"arroz","///",90);
		Articulo articulo2=new Articulo(1,"queso","/////",20);
				
		cliente.setDni(41237024);
		comercio.agregarDiaRetiro(15, LocalTime.now(), LocalTime.now(), 4);
		comercio.agregarDiaRetiro(14, LocalTime.now(), LocalTime.now(), 1);
		comercio.agregarDiaRetiro(12, LocalTime.now(), LocalTime.now(), 7);
		
      //  System.out.println("Digito verificador: "+comercio.validarIdentificadorUnico("2041237024"));
	 //   System.out.println("verificador de DNI: "+cliente.validarDni(41237024));
	//    System.out.println(comercio.traerDiaRetiro());

		
		carrito.agregar(articulo1, 4);
		carrito.agregar(articulo2, 1);
		carrito.agregar(articulo1, 4);
		
		double total=carrito.calcularTotalCarrito();
	//	System.out.println("total a pagar: "+total);
   //	carrito.mostrarCarrito();
		
		
	}
}