package pl.urbanik.beckend.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pl.urbanik.beckend.exceptions.NotFoundException;
import pl.urbanik.beckend.model.Reservations;
import pl.urbanik.beckend.repository.ReservationsRepository;
import pl.urbanik.beckend.service.ReservationService;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ReservationServiceImpl implements ReservationService {

    private final ReservationsRepository reservationsRepository;

    @Override
    public Reservations addGReservation(Reservations reservation) {
        return reservationsRepository.save(reservation);
    }

    @Override
    public Reservations getReservationById(Long id) {
        return reservationsRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("Reservation not exist with id: " + id));
    }

    @Override
    public List<Reservations> getReservations() {
        return reservationsRepository.findAll();
    }

    @Override
    public Reservations updateReservation(Reservations reservations) {
        return reservationsRepository.save(reservations);
    }

    @Override
    public void deleteReservation(Long id) {
        reservationsRepository.deleteById(id);
    }
}
