package co.edu.uniquindio.parcial1.models;

public class Usuario {
  private int edad;
  private VehiculoPasajero transporte;
  
  public Usuario(int edad, VehiculoPasajero transporte) {
    this.edad = edad;
    this.transporte = transporte;
  }

  public void setEdad(int edad) {
      this.edad = edad;
  }

  public int getEdad() {
      return edad;
  }
}
