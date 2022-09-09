package pl.urbanik.beckend.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pl.urbanik.beckend.model.Guide;
import pl.urbanik.beckend.repository.GuideRepository;
import pl.urbanik.beckend.service.GuideService;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class GuideServiceImpl implements GuideService {

    private final GuideRepository guideRepository;

    @Override
    public Guide addGuide(Guide guide) {
        return guideRepository.save(guide);
    }

    @Override
    public List<Guide> getGuides() {
        return guideRepository.findAll();
    }

    @Override
    public Guide getGuideById(Long guideId) {
        return guideRepository.findById(guideId).orElseThrow(() -> new RuntimeException("Guid not exist with id: " + guideId));
    }

    @Override
    public Guide updateGuide(Guide updatedGuide) {
        return guideRepository.save(updatedGuide);
    }

    @Override
    public void deleteGuide(Long guideId) {
        guideRepository.deleteById(guideId);
    }

}
