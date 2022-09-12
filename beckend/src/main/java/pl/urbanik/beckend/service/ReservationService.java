package pl.urbanik.beckend.service;

import org.springframework.stereotype.Service;
import pl.urbanik.beckend.model.Reservations;

import java.util.List;

@Service
public interface ReservationService {
    Reservations addGReservation(Reservations reservation);

    Reservations getReservationById(Long id);

    List<Reservations> getReservations();

    Reservations updateReservation(Reservations reservations);

    void deleteReservation(Long id);
}
