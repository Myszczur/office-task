package pl.urbanik.beckend.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.urbanik.beckend.model.Guide;
import pl.urbanik.beckend.service.GuideService;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/guide")
public class GuideController {

    private final GuideService guideService;

    @PostMapping
    public ResponseEntity<Guide> addGuide(@RequestBody Guide guide) {
        return new ResponseEntity<>(guideService.addGuide(guide), HttpStatus.OK);
    }

    @GetMapping("/{guideId}")
    public ResponseEntity<Guide> getGuideById(@PathVariable Long guideId) {
        return new ResponseEntity<>(guideService.getGuideById(guideId), HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Guide>> getAllGuides() {
        return new ResponseEntity<>(guideService.getGuides(), HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity<Guide> updateGuide(@RequestBody Guide updatedGuide) {
        return new ResponseEntity<>(guideService.updateGuide(updatedGuide), HttpStatus.OK);
    }

    @DeleteMapping("/{guideId}")
    public ResponseEntity<?> deleteGuide(@PathVariable("guideId") Long guideId) {
        guideService.deleteGuide(guideId);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
