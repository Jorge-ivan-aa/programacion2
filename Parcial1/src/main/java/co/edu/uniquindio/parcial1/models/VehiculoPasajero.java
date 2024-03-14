package co.edu.uniquindio.parcial1.models;

import java.util.ArrayList;

public class VehiculoPasajero extends Vehiculo { 
    private int numeroMaximoPasajeros;
    private ArrayList<Usuario> listaPasajeros;

    public VehiculoPasajero(String placa, String modelo, String marca, String color, Propietario propietario, int numeroMaximoPasajeros) { 
        super(placa, modelo, marca, color, propietario);
        this.numeroMaximoPasajeros = numeroMaximoPasajeros;
        this.listaPasajeros = new ArrayList<>();
    }

    public int getNumeroMaximoPasajeros() {
        return numeroMaximoPasajeros;
    }

    public void setNumeroMaximoPasajeros(int numeroMaximoPasajeros) {
        this.numeroMaximoPasajeros = numeroMaximoPasajeros;
    }

    public ArrayList<Usuario> getListaPasajeros() {
        return listaPasajeros;
    }

    public void AddPasajeros(Usuario pasajeros) {
      this.listaPasajeros.add(pasajeros);
    }
}
