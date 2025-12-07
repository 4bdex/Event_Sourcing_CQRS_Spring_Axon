package ma.abdex.event_sourcing_cqrs_spring_axon.events;

import lombok.Getter;

public class BaseEvent<T> {
    @Getter private T id;
    public BaseEvent(T id) {
        this.id = id;
    }
}
