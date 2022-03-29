package ec.com.sbcd.reservas.dao;

import ec.com.sbcd.reservas.model.Reserva;

import java.util.List;

public interface IReservaDAO {

    void generarReserva(Reserva reserva);

    List<Reserva> getReservas();
}
