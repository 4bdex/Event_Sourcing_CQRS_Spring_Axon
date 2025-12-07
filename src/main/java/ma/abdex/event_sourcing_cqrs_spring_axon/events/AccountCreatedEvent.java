package ma.abdex.event_sourcing_cqrs_spring_axon.events;

import lombok.Getter;
import ma.abdex.event_sourcing_cqrs_spring_axon.enums.AccountStatus;

import java.math.BigDecimal;
public class AccountCreatedEvent extends BaseEvent<String> {
    @Getter private final BigDecimal balance;
    @Getter private final String currency;
    @Getter private final AccountStatus status;

    public AccountCreatedEvent(String id, BigDecimal balance, String currency, AccountStatus status) {
        super(id);
        this.balance = balance;
        this.currency = currency;
        this.status = status;
    }
}
