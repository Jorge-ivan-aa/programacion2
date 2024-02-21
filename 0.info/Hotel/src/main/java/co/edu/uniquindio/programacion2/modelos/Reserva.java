package co.edu.uniquindio.programacion2.modelos;

public class Reserva {
  private String fechaEntrada;
  private String fechaSalida;
  private Cliente cliente;
  private Habitacion habitacion;

  public Reserva(String fechaEntrada, String fechaSalida, Cliente cliente, Habitacion habitacion) {
    this.fechaEntrada = fechaEntrada;
    this.fechaSalida = fechaSalida;
    this.cliente = cliente;
    this.habitacion = habitacion;
  }

  public String getFechaEntrada(){
    return this.fechaEntrada;
  }

  public String getFechaSalida(){
    return this.fechaSalida;
  }

  public void setFechaEntrada(String fecha){
    this.fechaEntrada = fecha;
  }

  public void setFechaSalida(String fecha){
    this.fechaSalida = fecha;
  }
}
