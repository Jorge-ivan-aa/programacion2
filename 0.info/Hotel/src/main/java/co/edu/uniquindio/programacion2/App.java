package co.edu.uniquindio.programacion2;
import co.edu.uniquindio.programacion2.modelos.*;

import java.lang.ref.Cleaner;
import java.util.ArrayList;

public class App {

    public static void main( String[] args ) {
      /* Inicializar datos */
      Cliente cliente1 = new Cliente("juanito", 12345678);
      Cliente cliente2 = new Cliente("pedro", 12345678);

      Habitacion habitacion1 = new Habitacion(101, 1000000);
      Habitacion habitacion2 = new Habitacion(102, 1200000);
      Habitacion habitacion3 = new Habitacion(103, 36000000);
      habitacion3.setTipo("suite");

      Reserva reserva1 = new Reserva("2/2023", "3/2033", cliente1, habitacion1);
      Reserva reserva3 = new Reserva("3/2023", "4/2023", cliente1, habitacion3);
      Reserva reserva2 = new Reserva("3/2023", "6/2033", cliente2, habitacion2);

      ServicioRestaurante restaurate = new ServicioRestaurante("Restaurante");
      ServicioSpa spa = new ServicioSpa("Spa relax");
      ServicioLimpieza limpieza = new ServicioLimpieza("Limpieza de instalaciones");
      ServicioHabitacion servicioHabitacion = new ServicioHabitacion("Servicios varios concepto habitacion");

      habitacion1.addServicio(servicioHabitacion);
      habitacion1.addServicio(limpieza);
      habitacion3.addServicio(spa);
      habitacion3.addServicio(restaurate);
      habitacion2.addServicio(servicioHabitacion);
      habitacion3.addServicio(limpieza);
      habitacion3.addServicio(servicioHabitacion);

      /* Inicializar datos END */


      /* Ejemplo 1: Listar los servicios adquiridos por un cliente*/
      listarServiciosCliente(cliente1);
      listarServiciosCliente(cliente2);

      System.out.println("\n_-_-_-_-_-_-_-_-_-_-_-_-_-\n");

      /* Ejemplo 2: Calcular la deuda por las reservas hechas por un cliente*/
      calcularDeudaCliente(cliente1);
      calcularDeudaCliente(cliente2);

      System.out.println("\n_-_-_-_-_-_-_-_-_-_-_-_-_-\n");

      /* Ejemplo 3: Mostrar fechas de reserva por cliente */
      ;listarFechaReservasCliente(cliente1);
      ;listarFechaReservasCliente(cliente2);

    }

    public static void listarServiciosCliente(Cliente cliente){
      ArrayList <Reserva> reservas = cliente.getReservas();
      for (int j=0; j < reservas.size(); j++) {
        Reserva reserva = reservas.get(j);
        ArrayList<Servicio> lista_servicios = reserva.getHabitacion().getServicios();
        Habitacion habitacion = reserva.getHabitacion();
        
        String clienteInfo = "\nLos servicios adquiridos por el cliente " + cliente.getNombre();
        String habitacionInfo = "habitacion "+habitacion.getNumero()+" - "+habitacion.getTipo().toString()+",";
        System.out.println( clienteInfo + " para la " + habitacionInfo + " son:\n"); 
        for (int i=0; i < lista_servicios.size(); i++) {
          System.out.println(i+1+") " + lista_servicios.get(i).getNombre() + ".");
        }
      }
    }

    public static void calcularDeudaCliente(Cliente cliente) {
        ArrayList<Reserva> reservas = cliente.getReservas();
        int deuda = 0;
        for (int j=0; j < reservas.size(); j++){
          Reserva reserva = reservas.get(j);
          Habitacion habitacion = reserva.getHabitacion();
          deuda = deuda + habitacion.getPrecio();
        }
        System.out.println("La deuda total del cliente "+ cliente.getNombre() + " es: " + deuda);
    }
    
    public static void listarFechaReservasCliente(Cliente cliente) { 
      /* inicializar datos */
    }
}
