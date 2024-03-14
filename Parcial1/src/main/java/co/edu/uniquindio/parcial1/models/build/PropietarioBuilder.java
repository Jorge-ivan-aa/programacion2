package co.edu.uniquindio.parcial1.models.build;

import java.util.ArrayList;
import co.edu.uniquindio.parcial1.models.Vehiculo;

public class PropietarioBuilder { 
    public String nombre;
    public String identificacion;
    public String email;
    public String numeroCelular;
    public ArrayList<Vehiculo> listaVehiculos;
 
    public PropietarioBuilder() {
      this.listaVehiculos = new ArrayList<>();
    }

    public void nombre(String nombre) {
      this.nombre = nombre;
    }

    public void identificacion(String identificacion) {
      this.identificacion = identificacion;
    }

    public void email(String email) {
      this.email = email;
    }

    public void numeroCelular(String numeroCelular) {
      this.numeroCelular = numeroCelular;
    }

    public void addvehiculo(Vehiculo vehiculo) {
      listaVehiculos.add(vehiculo);
    }

    public PropietarioBuilder build() {
      return this; 
    }

}
