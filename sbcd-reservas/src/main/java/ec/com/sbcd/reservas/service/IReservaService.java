package ec.com.sbcd.reservas.service;

import ec.com.sbcd.reservas.model.Reserva;

import java.util.List;

public interface IReservaService {

    void realizarReserva(Reserva reserva, int totalPersonas);

    List<Reserva> getReservas();
}
