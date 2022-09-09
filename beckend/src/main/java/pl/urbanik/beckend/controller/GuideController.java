package pl.urbanik.beckend.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import pl.urbanik.beckend.model.Guide;
import pl.urbanik.beckend.service.GuideService;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "http://localhost8080/", maxAge = 3600)
@RequiredArgsConstructor
@RequestMapping("/api")
public class GuideController {

    private final GuideService guideService;

    @PostMapping
    public Guide addGuide(Guide guide) {
        return guideService.addGuide(guide);
    }

    @GetMapping("/{guideId}")
    public Optional<Guide> getGuide(@PathVariable("guideId") Long guideId) {
        return guideService.getGuide(guideId);
    }

    @GetMapping("/guides")
    public List<Guide> getGuides() {
        return guideService.getGuides();
    }

    @PutMapping("/{guideId}")
    public Optional<Guide> updateGuide(@PathVariable("guideId") Long guideId, Guide updatedGuide) {
        return guideService.updateGuide(guideId, updatedGuide);
    }

    @DeleteMapping("/{guideId}")
    public void deleteGuide(@PathVariable("guideId") Long guideId) {
        guideService.deleteGuide(guideId);
    }
}
