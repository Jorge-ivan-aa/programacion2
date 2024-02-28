package co.edu.uniquindio.programacion2.modelos;

import java.util.ArrayList;

public class GestorReservas {
    private ArrayList<Reserva> reservas;

    public GestorReservas() {
        this.reservas = new ArrayList<>();
    }

    public void agregarReserva(Reserva reserva) {
        reservas.add(reserva);
    }

    public void mostrarReservas() {
        for (Reserva reserva : reservas) {
            System.out.println("Cliente: " + reserva.getCliente().getNombre() +
                    ", Habitación: " + reserva.getHabitacion().getNumero() +
                    ", Fecha Entrada: " + reserva.getFechaEntrada() +
                    ", Fecha Salida: " + reserva.getFechaSalida());
        }
    }

    public void cancelarReserva(String fecha) {
        for (Reserva reserva : reservas) {
            if (reserva.getFechaEntrada().equals(fecha)) {
                reservas.remove(reserva);
                break;
            }
        }
    }
}
