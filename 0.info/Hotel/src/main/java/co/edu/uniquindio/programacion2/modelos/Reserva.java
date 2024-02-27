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

    reservaAutomatica();
  }

  private void reservaAutomatica() {
    this.cliente.addReserva(this);
  }

  public Cliente getCliente() {
      return cliente;
  }

  public void setCliente(Cliente cliente) {
      this.cliente = cliente;
  }

  public Habitacion getHabitacion() {
      return habitacion;
  }

  public void setHabitacion(Habitacion habitacion) {
      this.habitacion = habitacion;
  }

  public String getFechaEntrada(){
    return this.fechaEntrada;
  }

  public void setFechaEntrada(String fecha){
    this.fechaEntrada = fecha;
  }

  public String getFechaSalida(){
    return this.fechaSalida;
  }

  public void setFechaSalida(String fecha){
    this.fechaSalida = fecha;
  }
}
