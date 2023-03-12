package com.neo.health.common.domain.event;

import lombok.Data;

import java.time.LocalDateTime;
import java.util.UUID;

/**
 * @author C12961
 * @date 2023/3/12 17:50
 */
@Data
public abstract class DomainEvent {

    private String eventId;
    private LocalDateTime eventTime;

    public DomainEvent() {
        this.eventId = "Event" + UUID.randomUUID().toString().toUpperCase();
        this.eventTime = LocalDateTime.now();
    }

}
