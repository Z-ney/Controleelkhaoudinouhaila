package ma.emsi.controle.DTO;
import lombok.*;
import java.math.BigDecimal;
import java.time.LocalDate;

@Data
public class DonDTO {
        private Long id;
        private String nomCampagne;
        private String nomDonateur;
        private BigDecimal montant;
        private LocalDate date;
    }

