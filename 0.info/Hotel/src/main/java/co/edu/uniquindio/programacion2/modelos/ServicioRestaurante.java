package co.edu.uniquindio.programacion2.modelos;

public class ServicioRestaurante extends Servicio {
  public ServicioRestaurante(String nombre) {
    super(nombre);
  }

  @Override
  public void Consumible() {
    System.out.println("Consumiendo desde restaurante...");
  }
}
