package com.neo.health.monitor.domain.command;

import com.neo.health.common.domain.model.entity.HealthTaskProfile;
import com.neo.health.common.domain.type.Command;
import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author C12961
 * @description 执行健康任务命令
 * @date 2023/3/12 16:29
 */
@Data
@AllArgsConstructor
public class PerformTaskCommand implements Command {

    private HealthTaskProfile healthTaskProfile;
}
