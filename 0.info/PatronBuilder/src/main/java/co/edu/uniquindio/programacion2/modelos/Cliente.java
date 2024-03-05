package co.edu.uniquindio.programacion2.modelos;

public class Cliente {
    
    private String nombre;
    private int edad;
    private String cedula;

    public Cliente(ClienteBuilder builder) {
      this.nombre = builder.nombre;
      this.edad = builder.edad;
      this.cedula = builder.cedula;
    }

    public int getEdad() {
        return edad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCedula() {
        return cedula;
    }
}
