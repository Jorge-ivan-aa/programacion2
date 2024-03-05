package co.edu.uniquindio.programacion2.modelos;

public class ClienteBuilder {
  
    public String nombre;
    public int edad;
    public String cedula;

  public ClienteBuilder() {

  }

  public ClienteBuilder nombre(String nombre) {
    this.nombre = nombre;
    return this;
  }

  public ClienteBuilder edad(int edad) {
    this.edad = edad;
    return this;
  }

  public ClienteBuilder cedula(String cedula) {
    this.cedula = cedula;
    return this;
  }

  public Cliente build() {
  return new Cliente(this);
  }

}
