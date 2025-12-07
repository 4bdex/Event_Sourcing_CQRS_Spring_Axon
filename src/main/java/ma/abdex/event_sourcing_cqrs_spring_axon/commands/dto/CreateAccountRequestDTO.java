package ma.abdex.event_sourcing_cqrs_spring_axon.commands.dto;

import lombok.Data;

import java.math.BigDecimal;
@Data
public class CreateAccountRequestDTO {
    private BigDecimal balance;
    private String currency;
}
