package com.neo.health.common.domain.model.entity;

import com.neo.health.common.domain.type.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 健康任务实体
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class HealthTaskProfile implements Entity {

    private String taskId;
    private String taskName;
    private String description;
    private int taskScore;


}
