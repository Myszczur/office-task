package pl.urbanik.beckend.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pl.urbanik.beckend.exceptions.NotFoundException;
import pl.urbanik.beckend.model.Destination;
import pl.urbanik.beckend.repository.DestinationRepository;
import pl.urbanik.beckend.service.DestinationService;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DestinationServiceImpl implements DestinationService {

    private final DestinationRepository destinationRepository;

    @Override
    public Destination addDestination(Destination destination) {
        return destinationRepository.save(destination);
    }

    @Override
    public Destination getDestinationById(Long destId) {
        return destinationRepository.findById(destId)
                .orElseThrow(() -> new NotFoundException("Customer not exist with id: " + destId));
    }

    @Override
    public List<Destination> getDestination() {
        return destinationRepository.findAll();
    }

    @Override
    public Destination updateDestination(Destination destination) {
        return destinationRepository.save(destination);
    }

    @Override
    public void deleteDestination(Long destId) {
        destinationRepository.deleteById(destId);
    }

}

