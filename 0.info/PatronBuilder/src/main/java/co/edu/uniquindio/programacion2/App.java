package co.edu.uniquindio.programacion2;

import java.lang.ref.Cleaner;

import co.edu.uniquindio.programacion2.modelos.Cliente;
import co.edu.uniquindio.programacion2.modelos.ClienteBuilder;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Cliente cliente = new ClienteBuilder()
          .nombre("Agusto")
          .edad(32)
          .cedula("321436862345467")
          .build();
        
        System.out.println("El cliente " + cliente.getNombre() + " tiene " + cliente.getEdad() + " años.");

    }
}
