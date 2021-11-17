import java.util.Scanner;
/**
 * Clase que representa a los clientes de la Agencia Trash.
 * @author : Dhamar Cabrera.
 * @author : Elizabeth Hernandez.
 * @version : 1.0
 */

public class Agencia {
    public static void main(String[] args)  {
	//Se utiliza el Scanner para saber lo que el cliente quiere expresarnos.
	Scanner teclado = new Scanner(System.in);

	//Bienvenida al usuario,  menú de opciones que puede ingresar
	System.out.println("Bienvenido a la AgenciaTrash.");
	System.out.println("¿En qué podemos ayudarte?");
	System.out.println("Menú: ");
	System.out.println("1. Comprar un auto");
	System.out.println("2. Quejas");
	System.out.println("3. Salir de la página");

	//Se le pide al usuario que ingrese el valor
	int opcion = teclado.nextInt();
	
	//Si el valor de opcion es mayor a 3 o menor a 1, le marcará error 
	if ((opcion > 3) || (opcion < 1)) {
		System.out.println("El valor ingresado no está dentro del menú");
	    }

	//Si su valor está dentro del menú, se le arrojarán las opciones que puede usar
	if  (opcion == 1){
    /**
     * Ejecutación del constructor por omisión de la clase @see : Auto
     */
	// Caso 9
    Auto versa = new Auto ();

    /**
     * Ejecutación de   constructores con parámetros de la clase @see : Auto
     */
    //Caso 1
    Auto aveo = new Auto ( "Chevrolet", "Aveo 2021", "Sedan", "Manual",  "Azul", 4, 4, "$280, 300.00" );
    // Caso 2
    Auto tornado = new Auto ( "Chevrolet", "Tornado 2022", "Van", "Automático",  "Blanco", 4, 3, "$267, 900.00" );
    // Caso 3
    Auto explorer = new Auto ( "Ford", "Explorer 2020", "Camioneta Familiar", "Manual",  "Verde", 6, 4, "$964, 200.00" );
    // Caso 4
    Auto mustang = new Auto ( "Ford", "Mustang 2019", "Deportivo", "Manual",  "Naranja",  4, 2, "$1, 040, 000.00" );
    // Caso 5
    Auto wrangler = new Auto ( "Jeep", "Wrangler 2016", "Todoterreno, SUV","Automático", "Negro", 4, 2, "$682, 999.00" );
    // Caso 6
    Auto bumo = new Auto ( "Mercedes Benz", "BUMO Arocs 2021", "Casa Rodante", "Automático", "Blanco", 6, 2, "$1,689, 000.00" );
    // Caso 7
    Auto convertible = new Auto ("Mini", "Mini Convertible 2022", "Cooper", "Automático", "Verde", 4, 4, "$847, 027.00");
    // Caso 8
    Auto tiida = new Auto ( "Nissan", "Tiida 2021", "Sedan", "Manual", "Amarillo", 4, 4, "$115, 000.00" );
    // Caso 10
    Auto fortwo = new Auto ("Smart", "Fortwo 2015", "Coupé","Manual", "Morado", 4, 3, "$162, 440.00" );
    // Caso 11
    Auto sienna = new Auto ( "Toyota", "Sienna 2013", "Minivan", "Manual", "Dorada", 4, 5, "$264, 252.00" );
    // Caso 12
    Auto hilux = new Auto ( "Toyota", "Hilux 2017", "Pickup", "Manual",  "Blanca", 4, 2, "$385, 674.00" );  

    //Menú de los Modelos de Autos disponibles en la Agencia Trash.
    System.out.println ("\n" + "\n" +" ---> Autos de la Agencia Trash disponibles en esta sucursal <--- " + "\n" + "\n" + "1.  Chevrolet Aveo 2021. " + "\n" + "2.  Chevrolet Tornado 2022." + "\n" + "3.  Ford Explorer 2020." + "\n" + "4.  Ford Mustang 2019." + "\n" + "5.  Jeep Wrangler 2016." + "\n" + "6.  Mercedes Benz BUMO Acrocs 2021." + "\n" + "7.  Mini Convertible 2022." + "\n" + "8.  Nissan Tiida 2011." + "\n" + "9.  Nissan Versa 202.1" + "\n" + "10. Smart Fortwo 2015." + "\n" + "11. Toyota Sienna 2013." + "\n" + "12. Toyota Hilux 2017." + "\n" + "13. El modelo que busco no está en la lista. ");
    System.out.print( "\n" + "\n" + " |" + "\n" + " | Indique el número del auto que desearía comprar: ");

			//Si el valor ingresado es mayor a 13 o menor a 1, marcara error
			if ((car > 14) || (car < 1)) {
			    System.out.println("El valor ingresado no se encuentra en el menú");
			    }

			//Si el valor se encuentra dentro, arrojar las opciones
			else {
				 Scanner n = new Scanner (System.in);
				 int modeloindicado = n.nextInt ();
				 System.out.println( " |" + "\n" + " v" + "\n");
				 String modelo = "";
    
				 switch (modeloindicado){
				 case 1:
				     modelo = aveo.toString();
				     break;
				 case 2:
				     modelo = tornado.toString();
				     break;
				 case 3:
				     modelo = explorer.toString();
				     break;
				 case 4:
				     modelo = mustang.toString();
				     break;
				 case 5:
				     modelo = wrangler.toString();
				     break;
				 case 6:
				     modelo = bumo.toString();
				     break;
				 case 7:
				     modelo = convertible.toString();
				     break;
				 case 8:
				     modelo = tiida.toString();
				     break;
				 case 9:
				     modelo = versa.toString();
				     break;
				 case 10:
				     modelo = fortwo.toString();
				     break;
				 case 11:
				     modelo = sienna.toString();
				     break;
				 case 12:
				     modelo = hilux.toString();
				     break;
				 case 13:
				     modelo = "Lamentamos el inconveniente, necesitará contactar al asesor de la Sucursal para saber si el modelo que desea estará disponible pronto.";
					 break;
    }
    
				 System.out.println(modelo + "\n");
			}
	}
	System.out.println("Su pedido está siendo procesado, por favor espere" + "\n");
					System.out.println("¿Prefiere realizar su pago en efectivo o con tarjeta? ( Marque la letra E para efectivo o la letra T para tarjeta");

					Scanner pago = new Scanner(System.in);
					String pago = pago.nextString ();

					//Si el pago es en efectivo ir con el vendedor
					if(pago == E) {
						System.out.println("El precio que debe pagar es $276900. Por favor dirijase con el vendedor");
					    }

					//Si el pago es con tarjeta introducir los dígitos de su tarjeta
					else {
						System.out.println("El precio que debe pagar es $276900");
						System.out.println("Introduzca los 16 dígitos de su tarjeta: ");
						Scanner tar = new Scanner (System.in);
						String tarjeta = tar.nextString();
						System.out.println("Gracias por preferir AgenciaTrash");
						System.out.println("Su compra fue un éxito, pase con su vendedor para más indicaciones. Vuelva pronto");
					break;

			    }
	   
	if (opcion == 2) {
			System.out.println("¿Qué tipo de queja desea poner?");
			System.out.println("1. Servicio");
			System.out.println("2. Vendedor");
			System.out.println("Elija alguna opción: ");
			Scanner queja = new Scanner (System.in);
			int queja = queja.nextInt();

			if((queja > 2) || (queja < 1)) {
				System.out.println("La opción no está dentro del menú");
			    }
			else  {
				switch(queja) {
				    case 1: System.out.println("Escriba el mal servicio que recibió: ");
					Scanner servicio = new Scanner (System.in);
					String servicio = servicio.nextString();
					System.out.println("Haremos lo posible por mejorar nuestro servicio tomando en cuenta las observaciones que nos ha hecho saber, gracias por su paricipación.");
					break;

				    case 2: System.out.println("Escriba el nombre del vendedor que lo atendió: ");
					Scanner vendedor = new Scanner (System.in);
					String vendedor = vendedor.nextString();
					System.out.println("Escriba su queja sobre el empleado:");
					Scanner empleado = new Scanner (System.in);
					String empleado = empleado.nextString();
					System.out.println("Haremos lo posible por mejorar nuestro servicio tomando en cuenta las observaciones que nos ha hecho saber, gracias por su participación. ");
					break;
					
				    }
			    }
			
	if ( opcion == 3)  {
			System.out.println("Gracias por su visita a la Agencia Trash, esperamos verlo pronto.");
			break;
	    }
    }
}
