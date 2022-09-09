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
        guideRepository.save(guide);
        return guide;
    }

    @Override
    public List<Guide> getGuides() {
        return guideRepository.findAll();
    }

    @Override
    public Optional<Guide> getGuide(Long guideId) {
        return Optional.of(guideRepository.findById(guideId).orElseThrow());
    }

    @Override
    public Optional<Guide> updateGuide(Long guideId, Guide updatedGuide) {
        return guideRepository.findById(guideId)
                .map(oldGuide -> guideRepository.save(updatedGuide));
    }

    @Override
    public void deleteGuide(Long guideId) {
        guideRepository.deleteById(guideId);
    }

}
