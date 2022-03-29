package ec.com.sbcd.vuelos.service;

import ec.com.sbcd.vuelos.model.Vuelo;

import java.util.List;

public interface IVueloService {

    List<Vuelo> recuperarVuelosDisponibles(Integer plazas);

    void actualizarPlazas(Integer id, Integer plazas);
}
