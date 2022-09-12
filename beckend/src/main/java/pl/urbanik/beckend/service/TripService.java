package pl.urbanik.beckend.service;

import org.springframework.stereotype.Service;
import pl.urbanik.beckend.model.Trip;

import java.time.LocalDate;
import java.util.List;

@Service
public interface TripService {
    Trip addTrip(Trip trip);

    Trip getTripById(Long tripId);

    List<Trip> getTrips();

    Trip updateTrip(Trip trip);

    void deleteTrip(Long tripId);


    Trip getTripByYear(Long year);
}
