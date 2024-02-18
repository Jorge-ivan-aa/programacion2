package co.edu.uniquindio.programacion2.modelos;
import java.util.ArrayList;

public class Venta {
    private ArrayList<Producto> productos;

    public Venta(ArrayList<Producto> productos) {
        this.productos = productos;
    }

    public double calcularTotalVentas() {
        double totalVentas = 0;
        for (Producto producto : productos) {
            totalVentas += producto.calcularPrecio();
        }
        return totalVentas;
    }
}
