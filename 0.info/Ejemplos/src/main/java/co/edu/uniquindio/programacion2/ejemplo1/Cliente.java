package co.edu.uniquindio.programacion2.ejemplo1;

public class Cliente {

  private String nombre;
  private String cedula;
  private int edad;
  private int peso;
  private int estatura;

  public Cliente() {

  }

  public Cliente(String nombre, String cedula, int edad, int peso, int estatura) {
    this.nombre = nombre;
    this.cedula = cedula;
    this.edad = edad;
    this.peso = peso;
    this.estatura = estatura;
  }
  
  public String getNombre() {
      return nombre;
  }

  public int getEdad() {
      return edad;
  }

  public int getEstatura() {
      return estatura;
  }

  public String getCedula() {
      return cedula;
  }

  public int getPeso() {
      return peso;
  }

}
