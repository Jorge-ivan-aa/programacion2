/* Rompe con el principio de responsabilidad unica al tener mas de una responsabilidad: */
public abstract class Producto {
    private String nombre;
    private int precio;

    public Producto(String nombre, int precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public abstract double calcularPrecio();
	
	public void calcularImpuestos() {
		System.out.println("Calculando impuestos");
	}

}


/* Rompe con el principio de abierto/cerrado ya que la clase solo
 puede recibir objetos tipo ProductoPan y no cualquier tipo de producto */
public class Venta {
    private ArrayList<ProductoPan> productos;

    public Venta(ArrayList<ProductoPan> productos) {
        this.productos = productos;
    }

    public double calcularTotalVentas() {
        double totalVentas = 0;
        for (ProductoPan producto : productos) {
            totalVentas += producto.calcularPrecio();
        }
        return totalVentas;
    }
}


/* Rompe con el principio de sustitucion ya que ProductoPan modifica el tipo de dato que retorna
 el metodo que heredo de Producto y por lo tanto no puede utilizarse en la clase Venta
 como producto valido */
public class ProductoPan extends Producto implements ProductoHorneable {
    private boolean integral;

    public ProductoPan(String nombre, double precio) {
        super(nombre, precio);
        this.integral = false;
    }

/* ... metodo para propiedad integral */

    @Override
    public String calcularPrecio() {
        return "mil pesos";
    }
}


/* Rompe con el principio de segregacion de interfaces al tener
una interfaz que provee mas de un servicio que no tienen relacion conceptual */
public interface ProductoAcciones {
	void hornear();
	void refrigerar();
	void reabastecer();
}

/* Rompe el principio de inversion de dependencias ya que Venta depende de una clase concreta
 y no abstracta. En este caso solo se podria recibir pagos de tarjetas del banco pedrito */
 public class Venta {
    private ArrayList<ProductoPan> productos;
    private PagoBancoPedrito pago;

    public Venta(ArrayList<ProductoPan> productos) {
        this.productos = productos;
    }

    public double calcularTotalVentas() {
        int totalVentas = 0;
        for (ProductoPan producto : productos) {
            totalVentas += producto.calcularPrecio();
        }
        return totalVentas;
    }

    public void recibirPago(int total) {
    	System.out.println("Se pago desde:" + pago.banco + "la cantidad: " + pago.pagarTarifa(int total));
    }
}
