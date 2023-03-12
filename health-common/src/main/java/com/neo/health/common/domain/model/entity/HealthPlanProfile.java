package com.neo.health.common.domain.model.entity;

import com.neo.health.common.domain.type.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * 健康计划实体
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class HealthPlanProfile implements Entity {

    private String planId;
    private String account;
    private String doctor;
    private String description;
    private List<HealthTaskProfile> tasks;


}
