package co.edu.uniquindio.cliente.clienteapp.model;

public class Cliente {
    private String nombre;
    private String apellido;
    private String cedula;
    private String telefonoFijo;
    private String telefonoCelular;
    private int edad;

    public Cliente(ClienteBuilder builder) {
        this.nombre = builder.nombre;
        this.apellido = builder.apellido;
        this.cedula = builder.cedula;
        this.telefonoFijo = builder.telefonoFijo;
        this.telefonoCelular = builder.telefonoCelular;
        this.edad = builder.edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getTelefonoFijo() {
        return telefonoFijo;
    }

    public void setTelefonoFijo(String telefonoFijo) {
        this.telefonoFijo = telefonoFijo;
    }

    public String getTelefonoCelular() {
        return telefonoCelular;
    }

    public void setTelefonoCelular(String telefonoCelular) {
        this.telefonoCelular = telefonoCelular;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }


    @Override
    public String toString() {
        if (telefonoFijo != null && telefonoCelular != null) {

          return " Cliente vip:\n" +
              "nombre= " + nombre + '\n'+
              "apellido= " + apellido + '\n' +
              "cedula= " + cedula + '\n' +
              "telefonoFijo= " + telefonoFijo + '\n' +
              "telefonoCelular= " + telefonoCelular + '\n' +
              "edad= " + edad;

        } else if (telefonoFijo != null) {

          return " Cliente premium:\n" +
              "nombre= " + nombre + '\n' +
              "apellido= " + apellido + '\n' +
              "cedula= " + cedula + '\n' +
              "telefonoFijo= " + telefonoFijo + '\n' +
              "edad= " + edad;

        } else {

          return " Cliente basic:\n" +
              "nombre= " + nombre + '\n' +
              "apellido= " + apellido + '\n' +
              "cedula= " + cedula + '\n' +
              "edad= " + edad;

        }
    }
}
