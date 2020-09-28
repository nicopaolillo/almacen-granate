package almacen.aplicacion;
import almacen.entidades.*;
import java.util.*;
import java.time.*;
public class Test {

	public static void main(String[] args) throws Exception {

		Comercio comercio = new Comercio();
		Cliente cliente = new Cliente();
		Carrito carrito = new Carrito();
		

		// Caso de uso 1:
		System.out.println("Digito Verificador: " + comercio.validarIdentificadorUnico(2041354026l));
		System.out.println("Verificador de Dni: " + cliente.validarDni(41354026));
		System.out.println(" ");

		// Caso de uso 2:
		//System.out.println(comercio.traerHoraRetiro(LocalDate.now()));

		// Caso de uso 6:
		comercio.agregarDiaRetiro(4, LocalTime.now(), LocalTime.now(), 5);
		comercio.agregarDiaRetiro(3, LocalTime.now(), LocalTime.now(), 2);
		comercio.agregarDiaRetiro(1, LocalTime.now(), LocalTime.now(), 9);

		System.out.println(comercio.traerDiaRetiro());
		System.out.println(" ");

		// Caso de uso 8:
		//Agrego articulos para agregar al caso de uso 8.
		Articulo articulo1 = new Articulo(1,"Salsa de tomate","7281938294331",75d);
		Articulo articulo2 = new Articulo(2,"Leche Serenisima","7287623294334",45d);
		Articulo articulo3 = new Articulo(3,"Rollo de cocina","7928018294333",30d);
		Articulo articulo4 = new Articulo(4,"Azucar","7281821343332",40d);
		Articulo articulo5 = new Articulo(5,"Mermelada","7281544562334",60d);
		
		articulo1.validarCodBarras("7281938294331");
		articulo2.validarCodBarras("7287623294334");
		articulo3.validarCodBarras("7928018294333");
		articulo4.validarCodBarras("7281821343332");
		articulo5.validarCodBarras("7281544562334");
		
		//Devuelve exception
		//articulo5.validarCodBarras("7281544562334543");

		carrito.agregar(articulo1,2);
		carrito.agregar(articulo3,4);
		carrito.agregar(articulo2,1);
		carrito.agregar(articulo4,3);
		carrito.agregar(articulo5,1);
		
		
		System.out.println(carrito.traerItemCarrito(articulo1));
		System.out.println(carrito.traerItemCarrito(articulo3));
		System.out.println(carrito.traerItemCarrito(articulo2));
		System.out.println(carrito.traerItemCarrito(articulo4));
		System.out.println(carrito.traerItemCarrito(articulo5));
		
		System.out.println(" ");
		
		System.out.println("El total es: "+carrito.calcularTotalCarrito());

		System.out.println(" ");
		
		// Caso de uso 17:
		Ubicacion ubicacion = new Ubicacion(2.5, 1.7);
		System.out.println(ubicacion.traerUbicacion());


	}

}