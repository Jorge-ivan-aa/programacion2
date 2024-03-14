package co.edu.uniquindio.parcial1.models;

import java.util.ArrayList;
import co.edu.uniquindio.parcial1.models.build.PropietarioBuilder;

public class Propietario {
    private String nombre;
    private String identificacion;
    private String email;
    private String numeroCelular;
    public ArrayList<Vehiculo> listaVehiculos;

    public Propietario(PropietarioBuilder build) {
        this.nombre = build.nombre;
        this.identificacion = build.identificacion;
        this.email = build.email;
        this.numeroCelular = build.numeroCelular;
        this.listaVehiculos = build.listaVehiculos;
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getNumeroIdentificacion() {
        return identificacion;
    }

    public String getEmail() {
        return email;
    }

    public String getNumeroCelular() {
        return numeroCelular;
    }
    
    public ArrayList<Vehiculo> getListaVehiculos() {
        return listaVehiculos;
    }

    public void addvehiculo(Vehiculo vehiculo) {
      listaVehiculos.add(vehiculo);
    }
}
