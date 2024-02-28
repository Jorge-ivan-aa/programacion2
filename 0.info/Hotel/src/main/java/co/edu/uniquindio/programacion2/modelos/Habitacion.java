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
  private int precio;

  public Habitacion(int numero, int precio) {
    this.numero = numero;
    this.tipo = TipoHabitacion.SIMPLE;
    this.precio = precio;
    this.servicios = new ArrayList<>();
  }

  public int getNumero() {
      return numero;
  }

  public void setNumero(int numero) {
      this.numero = numero;
  }

  public TipoHabitacion getTipo() {
      return tipo;
  }

  public void setTipo(String input) {
      if (input == "simple") {
        this.tipo = TipoHabitacion.SIMPLE;
      } else if (input == "doble") {
        this.tipo = TipoHabitacion.DOBLE;
      } else if (input == "suite") {
        this.tipo = TipoHabitacion.SUITE;
      }
  }

  public int getPrecio() {
    return precio;
  }

  public void setPrecio(int precio) {
      this.precio = precio;
  }

  public ArrayList<Servicio> getServicios() {
      return servicios;
  }

  public void addServicio(Servicio servicio) {
      this.servicios.add(servicio);
  }

  /* public void removeServicio(int servicioIndex) { */
      /* this.servicios.remove(numero); */
  /* } */
}
