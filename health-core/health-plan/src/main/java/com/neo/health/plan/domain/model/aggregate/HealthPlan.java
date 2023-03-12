package com.neo.health.plan.domain.model.aggregate;

import com.neo.health.common.domain.type.Aggregate;
import com.neo.health.common.domain.model.entity.HealthTaskProfile;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * 健康计划聚合，支撑域
 * @author C12961
 * @date 2023/3/12 17:13
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class HealthPlan implements Aggregate {

    private PlanId planId;
    private List<HealthTaskProfile> tasks;


}
