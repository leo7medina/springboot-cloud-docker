package ec.com.sbcd.reservas.controller;

import ec.com.sbcd.reservas.model.Reserva;
import ec.com.sbcd.reservas.service.IReservaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
public class ReservaController {


    @Autowired
    private IReservaService service;


    @PostMapping(value = "reserva/{personas}", consumes = MediaType.APPLICATION_JSON_VALUE)
    public void generarReserva(@RequestBody Reserva reserva, @PathVariable("personas") Integer personas) {
        service.realizarReserva(reserva, personas);
    }

    @GetMapping(value = "reservas", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Reserva> getReservas(){
        return service.getReservas();
    }
}
