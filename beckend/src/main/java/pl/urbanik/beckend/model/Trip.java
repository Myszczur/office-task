package pl.urbanik.beckend.model;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@ToString
@RequiredArgsConstructor
public class Trip {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToMany
    @ToString.Exclude
    private List<Destination> destinations = new ArrayList<>();
    private LocalDateTime dateOfDeparture;
    private LocalDateTime dateOfReturn;
    private BigDecimal suggestedPrice;
    @ManyToOne
    private Guide guide;
}
