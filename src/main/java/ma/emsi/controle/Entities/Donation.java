package ma.emsi.controle.entity;
import jakarta.persistence.*;
import lombok.*;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Donation {

        @Id @GeneratedValue
        private Long id;

        @ManyToOne
        private Compagne campagne;

        private String nomDonateur;
        private BigDecimal montant;
        private LocalDate date;
    }


