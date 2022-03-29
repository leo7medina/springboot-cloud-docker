package ec.com.sbcd.vuelos.dao;

import ec.com.sbcd.vuelos.model.Vuelo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IVueloJPA extends JpaRepository<Vuelo, Integer> {
}
