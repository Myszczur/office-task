package pl.urbanik.beckend.service;

import org.springframework.stereotype.Service;
import pl.urbanik.beckend.model.Guide;

import java.util.List;
import java.util.Optional;

@Service
public interface GuideService {
    Guide addGuide(Guide guide);

    List<Guide> getGuides();

    Guide getGuideById(Long guideId);

    Guide updateGuide(Guide updatedGuide);

    void deleteGuide(Long guideId);
}
