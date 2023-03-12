package com.neo.health.task.domain.model.aggregate;

import com.neo.health.common.domain.type.Aggregate;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 健康任务聚合，支撑域
 * @author C12961
 * @date 2023/3/12 17:13
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class HealthTask implements Aggregate {

    private TaskId taskId;


}
