package co.edu.uniquindio.programacion2.models;

import co.edu.uniquindio.programacion2.services.IVehiculoAgua;
import co.edu.uniquindio.programacion2.services.IVehiculoElectrico;

public class VehiculoPasajero extends Vehiculo implements IVehiculoElectrico, IVehiculoAgua {
    private int numeroMaximoPasajeros;

    public VehiculoPasajero() {
    }

    public VehiculoPasajero(String placa, String modelo, String marca, String color, int numeroMaximoPasajeros) {
        super(placa, modelo, marca, color);
        this.numeroMaximoPasajeros = numeroMaximoPasajeros;
    }

    public int getNumeroMaximoPasajeros() {
        return numeroMaximoPasajeros;
    }

    public void setNumeroMaximoPasajeros(int numeroMaximoPasajeros) {
        this.numeroMaximoPasajeros = numeroMaximoPasajeros;
    }

    @Override
    public void encender() {
        System.out.println("No me encendio......ayuda");
    }

    @Override
    public void encenderEletricamente() {
        System.out.println("Encender electricamente");
    }

    @Override
    public void encenderPorAgua() {

    }
}
