package com.neo.health.monitor.domain.model.aggregate;

import com.neo.health.common.domain.type.AggregateIdentifier;
import com.neo.health.common.domain.type.ValueObject;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class MonitorId implements AggregateIdentifier, ValueObject {
    private String monitorId;


}
