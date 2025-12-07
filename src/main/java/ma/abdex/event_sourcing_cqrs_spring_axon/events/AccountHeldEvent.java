package ma.abdex.event_sourcing_cqrs_spring_axon.events;

import ma.abdex.event_sourcing_cqrs_spring_axon.enums.AccountStatus;
import lombok.Getter;

public class AccountHeldEvent extends BaseEvent<String> {
    @Getter private final AccountStatus status;

    public AccountHeldEvent(String id, AccountStatus status) {
        super(id);
        this.status = status;
    }
}
