package com.neo.health.monitor.domain.command;

import com.neo.health.common.domain.model.entity.HealthTaskProfile;
import com.neo.health.common.domain.type.Command;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

/**
 * 创建健康计划命令
 * @author C12961
 * @date 2023/3/12 16:07
 */
@Data
@AllArgsConstructor
public class CreatePlanCommand implements Command {

    private String monitorId;
    private String planId;
    private String account;
    private String doctor;
    private String description;
    private List<HealthTaskProfile> tasks;


}
