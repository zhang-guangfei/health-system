package com.neo.health.monitor.domain.command;

import com.neo.health.common.domain.type.Command;
import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author C12961
 * @description 申请健康监控命令
 * @date 2023/3/12 16:08
 */
@Data
@AllArgsConstructor
public class ApplyMonitorCommand implements Command {
    private String monitorId; //健康监控编号
    private String account; // 用户账号
    private String allergy; // 过敏史
    private String injection; // 预防注射史
    private String surgery; // 外科手术史
    private String symptomDescription; // 症状描述
    private String bodyPart; // 身体部位
    private String timeDuration; // 持续时间

}
