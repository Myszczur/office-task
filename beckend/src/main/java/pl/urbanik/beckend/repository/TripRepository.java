package pl.urbanik.beckend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.urbanik.beckend.model.Trip;


@Repository
public interface TripRepository extends JpaRepository<Trip, Long> {
}
