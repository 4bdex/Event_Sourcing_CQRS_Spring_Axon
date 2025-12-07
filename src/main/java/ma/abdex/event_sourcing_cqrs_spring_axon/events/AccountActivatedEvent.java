package ma.abdex.event_sourcing_cqrs_spring_axon.events;


import lombok.Getter;
import ma.abdex.event_sourcing_cqrs_spring_axon.enums.AccountStatus;

import java.math.BigDecimal;

public class AccountActivatedEvent extends BaseEvent<String> {
    @Getter private final AccountStatus status;
    public AccountActivatedEvent(String id, AccountStatus status) {
        super(id);
        this.status = status;
    }
}
