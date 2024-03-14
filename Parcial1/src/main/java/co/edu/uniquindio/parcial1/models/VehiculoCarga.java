package co.edu.uniquindio.parcial1.models;

public class VehiculoCarga extends Vehiculo { 
    private int numeroEjes;
    private int capacidadMaxima;

    public VehiculoCarga(String placa, String modelo, String marca, String color, Propietario propietario, int numeroEjes, int capacidadMaxima) { 
        super(placa, modelo, marca, color, propietario);
        this.numeroEjes = numeroEjes;
        this.capacidadMaxima = capacidadMaxima;
    }
    
    public int getNumeroEjes() {
        return numeroEjes;
    }

    public void setNumeroEjes(int numeroEjes) {
        this.numeroEjes = numeroEjes;
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }
}
