package co.edu.uniquindio.programacion2.modelos;

public class Habitacion {

  public enum TipoHabitacion {
    SIMPLE,
    DOBLE,
    SUITE,
  }

  private int numero;
  private TipoHabitacion tipo;
  private double precio;

  public Habitacion(int numero, TipoHabitacion tipo, double precio) {
    this.numero = numero;
    this.tipo = tipo;
    this.precio = precio;
  }

  public int getNumero() {
      return numero;
  }

  public TipoHabitacion getTipo() {
      return tipo;
  }

  public double getPrecio() {
      return precio;
  }

  public void setNumero(int numero) {
      this.numero = numero;
  }

  public void setPrecio(double precio) {
      this.precio = precio;
  }

}
