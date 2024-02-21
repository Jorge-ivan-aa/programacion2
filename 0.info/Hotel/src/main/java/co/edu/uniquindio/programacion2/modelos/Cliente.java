package co.edu.uniquindio.programacion2.modelos;

import java.util.ArrayList;

public class Cliente {
  private String nombre;
  private int dni;
  private ArrayList<Reserva> reservasActivas;

  public Cliente(String nombre, int dni, ArrayList<Reserva> reservasActivas) {
    this.nombre = nombre;
    this.dni = dni;
    this.reservasActivas = reservasActivas;
  }

  public String getNombre() {
    return this.nombre;
  }

  public int getDni() {
    return this.dni;
  }
  
  public ArrayList<Reserva> getReserva() {
    return this.reservasActivas;
  }
  
}
