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
	//Inicializamos la variable opcion.
	int opcion, car, tarjeta, queja;
	String color, pago, servicio,vendedor;

	//Bienvenida al usuario,  menú de opciones que puede ingresar
	Vendedor uno = new Vendedor ();
	System.out.println (uno.getRecibe());

	//Se le pide al usuario que ingrese el valor
	Scanner opcion = new Scanner (System.in);
	opcion = teclado.nextInt();
	
	//Si el valor de opcion es mayor a 3 o menor a 1, le marcará error 
	if ((opcion > 3) || (opcion < 1))
	    {
		System.out.println("El valor ingresado no está dentro del menú");
	    }

	//Si su valor está dentro del menú, se le arrojarán las opciones que puede usar
	else
	    {
		switch(opcion)
		    {

			//Si eligió el número 1, le arroja los autos disponibles. 
		    case 1: System.out.println("Selecciono la opción 1. Comprar un auto");
			System.out.println("¿Qué carro le gusatría comprar?");
			System.out.println("1. Nissan Versa 2021 rojo/blanco. Costo: $276900");
			System.out.println("2. Chevrolet Aveo 2022 negro/gris. Costo:  $229000");
			System.out.println("3. Volkswagen Vento 2022 azul/rojo. Costo: $253000");
			System.out.println("4. Kia Rio 2021 cobre/rojo/negro. Costo:  $259900");
			System.out.println("5. Si el modelo que buscas no está en la lista");

			//Se le pide al usuario que ingrese el valor
			car = teclado.nextInt();
			
			//Si el valor ingresado es mayor a 5 o menos a 1, marcara eror
			if ((car > 5) || (car < 1))
			    {
			    System.out.println("El valor ingresado no se encuentra en el menú");
			    }

			//Si el valor se encuentra dentro, arrojar las opciones

			else
			    {
				switch(car)
				    {
					//El primer auto con sus opciones
				    case 1: System.out.println("El auto que eligió fue Nissan Versa 2021");
					System.out.println("Los colores disponibles son: rojo/blanco. ¿Cuál desea?");
					color = teclado.nextLine();
					if(color == rojo)
					    {
						Auto autoNissan = new Auto("rojo");
						System.out.pirntln("Usted eligió eligió el:" + autoNissan);
					    }
					else
					    {
						Auto autoNissan = new Auto("blanco");
						System.out.println("Usted eligió el: " + autoNissan);
					    }
					System.out.println("Su pedido está siendo procesado, por favor espere");
					System.out.println(" ");
					System.out.println("¿Pago en efectivo o con tarjeta?. R= efectivo/tarjeta");
					pago = teclado.nextLine();

					//Si el pago es en efectivo ir con el vendedor
					if(pago == efectivo)
					    {
						System.out.println("El precio que debe pagar es $276900. Por favor dirijase con el vendedor");
					    }

					//Si el pago es con tarjeta introducir los dígitos de su tarjeta
					else
					    {
						System.out.println("El precio que debe pagar es $276900");
						System.out.println("Introduzca los 16 dígitos de su tarjeta: ");
						tarjeta = teclado.nextInt();
						System.out.println("Gracias por preferir AgenciaTrash");
						System.out.println("Su compra fue un éxito, pase con su vendedor para más indicaciones. Vuelva pronto");
					    }
					break;
					
					//El segundo auto con sus opciones
				    case 2: System.out.println("El auto que eligió fue Chevrolet Aveo 2022");
					System.out.println("Los colores disponibles son: negro/gris. ¿Cuál desea?");
					color = teclado.nextLine();
					if(color == negro)
					    {
						Auto autoAveo = new Auto("negro");
						System.out.println("Usted eligió el: " + autoAveo);
					    }
					else
					    {
						Auto autoAveo = new Auto("gris");
						System.out.println("Usted eligió el: " + autoAveo);
					    }
					System.out.println("Su pedido está siendo procesado, por favor espere");
					System.out.println(" ");
					System.out.println("¿Pago en efectivo o con tarjeta?. R= efectivo/tarjeta");
					pago = teclado.nextLine();

					//Si el pago es en efectivo ir con el vendedor
					if(pago == efectivo)
					    {
						System.out.println("El precio que debe pagar es $22900. Por favor dirijase con el vendedor");
					    }

					//Si el pago es con tarjeta introducir los dígitos de su tarjeta
					else
					    {
						System.out.println("El precio que debe pagar es $22900");
						System.out.println("Introduzca los 16 dígitos de su tarjeta: ");
						tarjeta = teclado.nextInt();
						System.out.println("Gracias por preferir AgenciaTrash");
						System.out.println("Su compra fue un éxito, pase con su vendedor para más indicaciones. Vuelva pronto");
					    }
					break;

					//El tercer auto con sus opciones
				    case 3: System.out.println("El auto que eligió fue Volkswagen Vento 2022");
					System.out.println("Los colores disponibles son: azul/rojo. ¿Cuál desea? ");
					color = teclado.nextLine();
					if(color == azul)
					    {
						Auto autoVento = new Auto("azul");
						System.out.println("Usted eligió el: " + autoVento);
					    }
					else
					    {
						Auto autoVento = new Auto("rojo");
						System.out.println("Usted eligió el: " + autoVento);
					    }
					System.out.println("Su pedido está siendo procesado, por favor espere");
					System.out.println(" ");
					System.out.println("¿Pago en efectivo o con tarjeta?. R= efectivo/tarjeta");
					pago = teclado.nextLine();

					//Si el pago es en efectivo ir con el vendedor
					if(pago == efectivo)
					    {
						System.out.println("El precio que debe pagar es $253000. Por favor dirijase con el vendedor");
					    }

					//Si el pago es con tarjeta introducir los dígitos de su tarjeta
					else
					    {
						System.out.println("El precio que debe pagar es $253000");
						System.out.println("Introduzca los 16 dígitos de su tarjeta: ");
						tarjeta = teclado.nextInt();
						System.out.println("Gracias por preferir AgenciaTrash");
						System.out.println("Su compra fue un éxito, pase con su vendedor para más indicaciones. Vuelva pronto");
					    }
					break;

					//El cuarto auto elegido con sus opciones
				    case 4: System.out.println("El auto que eligió fue Kia Rio 2021");
					System.out.println("Los colores disponibles son: cobre/negro. ¿Cuál desea? ");
					color = teclado.nextLine();
					if(color == cobre)
					    {
						Auto autoRio = new Auto("cobre");
						System.out.println("Usted eligió el: " + autoRio);
					    }
					else
					    {
						Auto autoRio = new Auto("negro");
						System.out.println("Usted eligió el: " + autoRio);
					    }
					System.out.println("Su pedido está siendo procesado, por favor espere");
					System.out.println(" ");
					System.out.println("¿Pago en efectivo o con tarjeta?. R= efectivo/tarjeta");
					pago = teclado.nextLine();

					//Si el pago es en efectivo ir con el vendedor
					if(pago == efectivo)
					    {
						System.out.println("El precio que debe pagar es $259900. Por favor dirijase con el vendedor");
					    }

					//Si el pago es con tarjeta introducir los dígitos de su tarjeta
					else
					    {
						System.out.println("El precio que debe pagar es $259900");
						System.out.println("Introduzca los 16 dígitos de su tarjeta: ");
						tarjeta = teclado.nextInt();
						System.out.println("Gracias por preferir AgenciaTrash");
						System.out.println("Su compra fue un éxito, pase con su vendedor para más indicaciones. Vuelva pronto");
					    }
					break;

				    case 5: System.out.println("Vuelva pronto");
					break;
				    }

			    }
		    case 2: System.out.println("¿Qué tipo de queja desea poner?");
			System.out.println("1. Servicio");
			System.out.println("2. Vendedor");
			System.out.println("Elija alguna opción: ");
			queja = teclado.nextInt();

			if((queja > 2) || (queja < 1))
			    {
				System.out.println("La opción no está dentro del menú");
			    }
			else
			    {
				switch(queja)
				    {
				    case 1: System.out.println("Escriba el mal servicio que recibió: ");
					servicio = teclado.nextLine();
					System.out.println("Haremos lo posible por mejorar nuestro servicio, gracias por su comentario");
					break;

				    case 2: System.out.println("Escriba el nombre del vendedor que lo atendió: ");
					vendedor = teclado.nextLine();
					System.out.println("Escriba su queja");
					servicio = teclado.nextLine();
					System.out.println("Haremos lo posible por mejorar nuestro servicio, gracias por su comentario");
					break;
					
				    }
			    }
		    case 3: System.out.println("Gracias por su visita en AgenciaTrash. Vuelva pronto");
			break;
		    }
	    }
		    
    }
}
