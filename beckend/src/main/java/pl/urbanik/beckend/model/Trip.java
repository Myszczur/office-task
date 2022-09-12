package pl.urbanik.beckend.model;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Getter
@Setter
@RequiredArgsConstructor
public class Trip {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDate dateOfDeparture;
    private LocalDate dateOfReturn;
    private BigDecimal suggestedPrice;
    @ManyToOne
    private Guide guide;
    @ManyToOne
    private Destination destination;
}
