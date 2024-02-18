package co.edu.uniquindio.programacion2.modelos;

public class ProductoPan extends Producto implements ProductoHorneable {
    private boolean integral;

    public ProductoPan(String nombre, int precio) {
        super(nombre, precio);
        this.integral = false;
    }
    
    public boolean getIntegral() {
        return this.integral;
    }

    public void setIntegral() {
        this.integral = true;
    }

    @Override
    public int calcularPrecio() {
        return getPrecio();
    }

    @Override
    public void hornear() {
        // Lógica específica para el pan
        System.out.println("Horneando pan");
    }
}
