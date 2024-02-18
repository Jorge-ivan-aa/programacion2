package co.edu.uniquindio.programacion2.modelos;

public class ProductoBebida extends Producto implements ProductoRefrigerable {
    public ProductoBebida(String nombre, int precio) {
        super(nombre, precio);
    }

    @Override
    public int calcularPrecio() {
        return getPrecio() + 400; // Digamos que 400 pesos son impuestos por el azucar
    }

    @Override
    public void refrigerar() {
        System.out.println("Refrigerando bebida");
    }
}
