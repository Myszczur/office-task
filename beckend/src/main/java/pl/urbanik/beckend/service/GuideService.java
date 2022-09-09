package pl.urbanik.beckend.service;

import org.springframework.stereotype.Service;
import pl.urbanik.beckend.model.Guide;

import java.util.List;
import java.util.Optional;

@Service
public interface GuideService {
    Guide addGuide(Guide guide);

    List<Guide> getGuides();

    Optional<Guide> getGuide(Long guideId);

    Optional<Guide> updateGuide(Long guideId, Guide updatedGuide);

    void deleteGuide(Long guideId);
}
