package pl.urbanik.beckend.service;

import org.springframework.stereotype.Service;
import pl.urbanik.beckend.model.Destination;

import java.util.List;

@Service
public interface DestinationService {
    Destination addDestination(Destination destination);

    Destination getDestinationById(Long destId);

    List<Destination> getDestination();

    Destination updateDestination(Destination destination);

    void deleteDestination(Long destId);
}
