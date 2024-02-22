package co.edu.uniquindio.programacion2.modelos;

public abstract class Servicio implements Consumible {
  
  public Servicio() {
  
  }

  public void consumir() {
    System.out.println("Consumiendo...");
  }
}
