package co.edu.uniquindio.programacion2.modelos;

public abstract class Servicio implements Consumible {
  
  private String nombre; 

  public Servicio(String nombre) {
    this.nombre = nombre;
  }

  public String getNombre() {
      return nombre;
  }

  public void setNombre(String nombre) {
      this.nombre = nombre;
  }
  
@Override
  public void consumir() {
    System.out.println("Consumiendo...");
  }

}
