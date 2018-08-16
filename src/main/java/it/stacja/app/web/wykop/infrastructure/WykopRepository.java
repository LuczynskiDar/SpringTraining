package it.stacja.app.web.wykop.infrastructure;

import it.stacja.app.web.wykop.domain.Wykop;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


//public interface WykopRepository {
public interface WykopRepository extends JpaRepository<Wykop, Long> {

    //void save(Wykop wykop); // dostepne domyslnie w JPA
    //List<Wykop> findAll(); // dostepne domyslnie w JPA


}
