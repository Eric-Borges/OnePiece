package one.piece.demo.repositories;

import one.piece.demo.models.Pirate;
import one.piece.demo.models.Race;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PirateRepository extends JpaRepository<Pirate, Integer> {
    public List<Pirate> findByRace(Race race);

}
