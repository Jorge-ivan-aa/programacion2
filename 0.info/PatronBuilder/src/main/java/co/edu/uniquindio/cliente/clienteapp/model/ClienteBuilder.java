package co.edu.uniquindio.cliente.clienteapp.model;

public class ClienteBuilder {
    protected String nombre;
    protected String apellido;
    protected int edad;
    protected String cedula;
    protected String telefonoFijo;
    protected String telefonoCelular;

    public ClienteBuilder nombre(String nombre) {
            this.nombre = nombre;
            return this;
    }

    public ClienteBuilder apellido(String apellido) {
        this.apellido = apellido;
        return this;
    }

    public ClienteBuilder cedula(String cedula) {
        this.cedula = cedula;
        return this;
    }

    public ClienteBuilder telefonoFijo(String telefonoFijo) {
        this.telefonoFijo = telefonoFijo;
        return this;
    }

    public ClienteBuilder telefonoCelular(String telefonoCelular) {
        this.telefonoCelular = telefonoCelular;
        return this;
    }

    public ClienteBuilder edad(int edad) {
        this.edad = edad;
        return this;
    }

    public Cliente build() {
        return new Cliente (this);
    }
}
