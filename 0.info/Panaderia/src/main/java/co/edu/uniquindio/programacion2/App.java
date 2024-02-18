package co.edu.uniquindio.programacion2;
import co.edu.uniquindio.programacion2.modelos.*;
import java.util.ArrayList;

public class App 
{
    public static void main( String[] args )
    {
        // Creamos algunos productos
        ProductoPan panIntegral = new ProductoPan("Pan Integral", 2000);
        panIntegral.setIntegral();
        ProductoPan panBlanco = new ProductoPan("Pan Blanco", 1000);
        ProductoBebida bebidaRefresco = new ProductoBebida("Refresco", 1000);

        // Calculamos el total de ventas de los productos
        ArrayList<Producto> productos = new ArrayList<>();
        productos.add(panIntegral);
        productos.add(panBlanco);
        productos.add(bebidaRefresco);
 
        Venta ventaHoy = new Venta(productos);
        // Mostramos el total de ventas
        System.out.println("El total de ventas es: $" + ventaHoy.calcularTotalVentas());
    }
}
