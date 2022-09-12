package pl.urbanik.beckend.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import pl.urbanik.beckend.model.Destination;
import pl.urbanik.beckend.model.Trip;
import pl.urbanik.beckend.service.DestinationService;

import java.util.List;

@Controller
@RequiredArgsConstructor
@RequestMapping("/api/destination")
public class DestinationsController {

    private final DestinationService destinationService;




    @PostMapping
    public ResponseEntity<Destination> addDestination(@RequestBody Destination destination) {
        return new ResponseEntity<>(destinationService.addDestination(destination), HttpStatus.OK);
    }

    @GetMapping("/{destId}")
    public ResponseEntity<Destination> getDestinationById(@PathVariable Long destId) {
        return new ResponseEntity<>(destinationService.getDestinationById(destId), HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Destination>> getAllDestinations() {
        return new ResponseEntity<>(destinationService.getDestination(), HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity<Destination> updateDestination(@RequestBody Destination destination) {
        return new ResponseEntity<>(destinationService.updateDestination(destination), HttpStatus.OK);
    }

    @DeleteMapping("/{destId}")
    public ResponseEntity<?> deleteDestination(@PathVariable("destId") Long destId) {
        destinationService.deleteDestination(destId);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
