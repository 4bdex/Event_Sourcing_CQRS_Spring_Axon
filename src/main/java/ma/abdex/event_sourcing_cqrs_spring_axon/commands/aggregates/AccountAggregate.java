package ma.abdex.event_sourcing_cqrs_spring_axon.commands.aggregates;


import lombok.extern.slf4j.Slf4j;
import ma.abdex.event_sourcing_cqrs_spring_axon.enums.AccountStatus;
import ma.abdex.event_sourcing_cqrs_spring_axon.events.*;


import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.eventsourcing.EventSourcingHandler;
import org.axonframework.modelling.command.AggregateIdentifier;
import org.axonframework.modelling.command.AggregateLifecycle;
import org.axonframework.spring.stereotype.Aggregate;

import ma.abdex.event_sourcing_cqrs_spring_axon.commands.commands.CreateAccountCommand;


import java.math.BigDecimal;
@Aggregate
@Slf4j
public class AccountAggregate {
    @AggregateIdentifier
    //@Id
    private String accountId;
    private BigDecimal balance;
    private String currency;
    private String status;

    public AccountAggregate() {
    }
    @CommandHandler
    public AccountAggregate(CreateAccountCommand createAccountCommand) {
        log.info("CreateAccountCommand Received");
        AggregateLifecycle.apply(
                new AccountCreatedEvent(
                        createAccountCommand.getId(),
                        createAccountCommand.getBalance(),
                        createAccountCommand.getCurrency(),
                        AccountStatus.CREATED
                        )
        );
    }
    @EventSourcingHandler
    public void on(AccountCreatedEvent accountCreatedEvent){
        log.info("AccountCreatedEvent Occured");
        this.accountId=accountCreatedEvent.getId();
        this.balance=accountCreatedEvent.getBalance();
        this.currency=accountCreatedEvent.getCurrency();
        this.status=String.valueOf(accountCreatedEvent.getStatus());
        AggregateLifecycle.apply(new AccountActivatedEvent(this.accountId,AccountStatus.ACTIVATED));
    }

}
