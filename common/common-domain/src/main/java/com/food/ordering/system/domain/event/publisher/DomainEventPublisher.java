package com.food.ordering.system.domain.event.publisher;

import com.food.ordering.system.domain.event.DomainEvent;

public interface DomainEventPublisher<T extends DomainEvent> {
    /**
     * implementation of this publisher will be in order message module
     * @param domainEvent
     */
    void publish(T domainEvent);

}
