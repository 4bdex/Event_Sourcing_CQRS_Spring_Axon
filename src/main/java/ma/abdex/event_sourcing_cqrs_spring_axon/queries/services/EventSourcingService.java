package ma.abdex.event_sourcing_cqrs_spring_axon.queries.services;

import org.axonframework.eventsourcing.eventstore.DomainEventStream;


public interface EventSourcingService {
    DomainEventStream eventsByAccountId(String accountId);
}
