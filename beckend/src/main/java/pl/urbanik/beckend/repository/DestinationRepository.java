package pl.urbanik.beckend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.urbanik.beckend.model.Destination;

@Repository
public interface DestinationRepository extends JpaRepository<Destination, Long> {
}
