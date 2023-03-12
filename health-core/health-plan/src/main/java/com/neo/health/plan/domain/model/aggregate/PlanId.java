package com.neo.health.plan.domain.model.aggregate;

import com.neo.health.common.domain.type.AggregateIdentifier;
import com.neo.health.common.domain.type.ValueObject;
import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author C12961
 * @date 2023/3/12 17:14
 */
@Getter
@AllArgsConstructor
public class PlanId implements AggregateIdentifier, ValueObject {

    private String planId;
}
