package co.edu.uniquindio.programacion2;

import java.lang.ref.Cleaner;

import co.edu.uniquindio.programacion2.ejemplo1.Cliente;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        Cliente cliente = crearCliente();

        System.out.println(cliente.getNombre());
    }

    public static Cliente crearCliente() {
      Cliente cliente = new Cliente("Juan", "342567867654", 32, 80, 176);
      return cliente;
    }
}
