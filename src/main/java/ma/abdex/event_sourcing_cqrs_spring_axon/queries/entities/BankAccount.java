package ma.abdex.event_sourcing_cqrs_spring_axon.queries.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ma.abdex.event_sourcing_cqrs_spring_axon.enums.AccountStatus;

import java.math.BigDecimal;
@Entity
@Data @AllArgsConstructor @NoArgsConstructor
public class BankAccount {
    @Id
    private String id;
    private BigDecimal balance;
    @Enumerated(EnumType.STRING)
    private AccountStatus status;
}
