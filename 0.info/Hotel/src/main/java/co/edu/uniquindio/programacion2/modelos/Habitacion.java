package co.edu.uniquindio.programacion2.modelos;

import java.util.ArrayList;

public class Habitacion {

  public enum TipoHabitacion {
    SIMPLE,
    DOBLE,
    SUITE,
  }

  private int numero;
  private TipoHabitacion tipo;
  private ArrayList<Servicio> servicios;
  private double precio;

  public Habitacion(int numero, TipoHabitacion tipo, ArrayList<Servicio> servicios, double precio) {
    this.numero = numero;
    this.tipo = TipoHabitacion.SIMPLE;
    this.precio = precio;
    this.servicios = servicios;
  }

  public void setTipo(String input) {
      if (input == "simple") {
        this.tipo = TipoHabitacion.SIMPLE;
      } else if (input == "double") {
        this.tipo = TipoHabitacion.DOBLE;
      } else if (input == "suite") {
        this.tipo = TipoHabitacion.SUITE;
      }
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
