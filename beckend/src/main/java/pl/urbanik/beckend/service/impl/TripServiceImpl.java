package pl.urbanik.beckend.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pl.urbanik.beckend.exceptions.NotFoundException;
import pl.urbanik.beckend.model.Trip;
import pl.urbanik.beckend.repository.TripRepository;
import pl.urbanik.beckend.service.TripService;

import java.util.*;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class TripServiceImpl implements TripService {

    private final TripRepository tripRepository;

    @Override
    public Trip addTrip(Trip trip) {
        return tripRepository.save(trip);
    }

    @Override
    public Trip getTripById(Long tripId) {
        return tripRepository.findById(tripId)
                .orElseThrow(() -> new NotFoundException("Trip not exist with id: " + tripId));
    }

    @Override
    public List<Trip> getTrips() {
        return tripRepository.findAll();
    }

    @Override
    public Trip updateTrip(Trip trip) {
        return tripRepository.save(trip);
    }

    @Override
    public void deleteTrip(Long tripId) {
        tripRepository.deleteById(tripId);
    }

    @Override
    public Trip getTripByYear(Long year) {
        List<Trip> listOfTrips = tripRepository.findAll()
                .stream()
                .filter(it->it.getDateOfDeparture().getYear() == year)
                .toList();
        return (Trip) countByStreamGroupBy(listOfTrips);
    }

    public <T> Map<T, Long> countByStreamGroupBy(List<T> inputList) {
        return inputList.stream().collect(Collectors.groupingBy(k -> k, Collectors.counting()));
    }

}
