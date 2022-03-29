package ec.com.sbcd.reservas.dao;

import ec.com.sbcd.reservas.model.Reserva;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IReservaJPA extends JpaRepository<Reserva, Integer> {


}
