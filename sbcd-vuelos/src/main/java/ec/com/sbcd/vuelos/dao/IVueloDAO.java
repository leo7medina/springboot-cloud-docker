package ec.com.sbcd.vuelos.dao;

import ec.com.sbcd.vuelos.model.Vuelo;

import java.util.List;

public interface IVueloDAO {

    List<Vuelo> devolverVuelos();

    Vuelo devolverVuelo(int id);

    void actualizarVuelo(Vuelo vuelo);
}
