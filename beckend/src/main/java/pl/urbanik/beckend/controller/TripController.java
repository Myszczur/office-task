package pl.urbanik.beckend.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import pl.urbanik.beckend.model.Trip;
import pl.urbanik.beckend.service.TripService;

import java.util.List;

@Controller
@RequiredArgsConstructor
@RequestMapping("/api/trip")
public class TripController {

    private final TripService tripService;


    @GetMapping("/{year}")
    public ResponseEntity<Trip> getTripByYear(@PathVariable Long year) {
        return new ResponseEntity<>(tripService.getTripByYear(year), HttpStatus.CREATED);
    }

    @PostMapping
    public ResponseEntity<Trip> addTrip(@RequestBody Trip trip) {
        return new ResponseEntity<>(tripService.addTrip(trip), HttpStatus.OK);
    }

    @GetMapping("/{tripId}")
    public ResponseEntity<Trip> getTripById(@PathVariable Long tripId) {
        return new ResponseEntity<>(tripService.getTripById(tripId), HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Trip>> getAllTrips() {
        return new ResponseEntity<>(tripService.getTrips(), HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity<Trip> updateTrip(@RequestBody Trip trip) {
        return new ResponseEntity<>(tripService.updateTrip(trip), HttpStatus.OK);
    }

    @DeleteMapping("/{tripId}")
    public ResponseEntity<?> deleteTrip(@PathVariable("tripId") Long tripId) {
        tripService.deleteTrip(tripId);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
