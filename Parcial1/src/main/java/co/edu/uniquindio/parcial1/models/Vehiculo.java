package co.edu.uniquindio.parcial1.models;

public abstract class Vehiculo {
    private String placa;
    private String modelo;
    private String marca;
    private String color;
    private Propietario propietario;

    public Vehiculo(String placa, String modelo, String marca, String color, Propietario propietario) {
        this.placa = placa;
        this.modelo = modelo;
        this.marca = marca;
        this.color = color;
        this.propietario = propietario;
    }

    public String getPlaca() {
        return this.placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Propietario getPropietario() {
        return propietario;
    }

    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "placa='" + placa + '\'' +
                ", modelo='" + modelo + '\'' +
                ", marca='" + marca + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}

