package pl.urbanik.beckend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.urbanik.beckend.model.Reservations;

@Repository
public interface ReservationsRepository extends JpaRepository<Reservations, Long> {
}
