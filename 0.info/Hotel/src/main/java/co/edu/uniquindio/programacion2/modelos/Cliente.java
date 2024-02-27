package co.edu.uniquindio.programacion2.modelos;

import java.util.ArrayList;

public class Cliente {
  private String nombre;
  private int dni;
  private ArrayList<Reserva> reservasActivas;

  public Cliente(String nombre, int dni) {
    this.nombre = nombre;
    this.dni = dni;
    this.reservasActivas = new ArrayList<>();
  }

  public String getNombre() {
    return this.nombre;
  }

  public void setNombre(String nombre) {
      this.nombre = nombre;
  }

  public int getDni() {
    return this.dni;
  }

  public void setDni(int dni) {
      this.dni = dni;
  }
  
  public ArrayList<Reserva> getReservas() {
    return this.reservasActivas;
  }

  public void addReserva(Reserva reserva) {
      this.reservasActivas.add(reserva);
  }
}
