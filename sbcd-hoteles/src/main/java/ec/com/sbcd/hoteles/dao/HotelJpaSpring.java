package ec.com.sbcd.hoteles.dao;

import ec.com.sbcd.hoteles.model.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HotelJpaSpring extends JpaRepository<Hotel, Integer> {
}
