package pl.urbanik.beckend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.urbanik.beckend.model.Guide;

@Repository
public interface GuideRepository extends JpaRepository<Guide, Long> {
}
