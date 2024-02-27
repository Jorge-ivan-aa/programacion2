package co.edu.uniquindio.programacion2.modelos;

public class ServicioHabitacion extends Servicio {
  public ServicioHabitacion(String nombre) {
    super(nombre);
  }

  @Override
  public void Consumible() {
    System.out.println("Consumiendo desde habitacion...");
  }
}
