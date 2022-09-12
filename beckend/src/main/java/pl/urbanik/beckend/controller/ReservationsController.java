package pl.urbanik.beckend.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import pl.urbanik.beckend.model.Guide;
import pl.urbanik.beckend.model.Reservations;
import pl.urbanik.beckend.service.ReservationService;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class ReservationsController {

    private final ReservationService reservationService;

    @PostMapping
    public ResponseEntity<Reservations> addReservations(@RequestBody Reservations reservation) {
        return new ResponseEntity<>(reservationService.addGReservation(reservation), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Reservations> getReservationById(@PathVariable Long id) {
        return new ResponseEntity<>(reservationService.getReservationById(id), HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Reservations>> getAllGuides() {
        return new ResponseEntity<>(reservationService.getReservations(), HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity<Reservations> updateReservations(@RequestBody Reservations reservations) {
        return new ResponseEntity<>(reservationService.updateReservation(reservations), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteReservation(@PathVariable("id") Long id) {
        reservationService.deleteReservation(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}