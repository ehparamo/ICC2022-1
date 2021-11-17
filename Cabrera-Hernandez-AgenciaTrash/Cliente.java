/**
 * Clase que representa al Cliente
 * @author Elizabeth
 * @version 1.0
 */

public class Cliente
{
    //ATRIBUTOS
    //Nombre del cliente
    private String nombre;

    //Dinero disponible del cliente
    private int dineroDisponible;

    //MÉTODOS CONSTRUCTORES

    /**
     * Es el método en el que recibe dos argumentos 
     * @param nombreNombre del cliente
     * @param dineroDisponible
     */

    public Cliente(String nombre, int dineroDisponible)
    {
	this.nombre = nombre;
	this.dineroDisponible = dineroDisponible;
    }

    // SETTERS Y GETTERS

    // @param nombre nuevo
    public void setNombre(String nombre)
    {
	this.nombre = nombre;
    }

    // @return nombre del Cliente
    public String getNombre()
    {
	return this.nombre;
    }

    // @param nuevo dineroDisponible
    public void setNombre(int dineroDisponible)
    {
	this.dineroDisponible = dineroDisponible;
    }

    // @return dinero disponible del cliente
    public int dineroDisponible()
    {
	return this.dineroDisponible;
    }

    //MÉTODOS ESPECIALES

    // @return información completa
    public String info()
    {
	return "Nombre del cliente: " + nombre + "\n" + "Dinero disponible: " + dineroDisponible;
    }
    
}
