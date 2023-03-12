package com.neo.health.monitor.domain.model.aggregate;

import com.neo.health.common.domain.type.Aggregate;
import com.neo.health.monitor.domain.command.ApplyMonitorCommand;
import com.neo.health.monitor.domain.command.CreatePlanCommand;
import com.neo.health.monitor.domain.command.PerformTaskCommand;
import com.neo.health.monitor.domain.model.entity.HealthExaminationOrder;
import com.neo.health.common.domain.model.entity.HealthPlanProfile;
import com.neo.health.monitor.domain.model.entity.HealthScore;
import com.neo.health.common.domain.model.value.Anamneses;
import com.neo.health.monitor.domain.model.value.MonitorStatus;
import com.neo.health.monitor.domain.model.value.OrderStatus;
import com.neo.health.common.domain.model.value.Symptom;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.commons.lang3.StringUtils;

import java.util.UUID;

/**
 * 健康监控聚合，核心域
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class HealthMonitor implements Aggregate {
    private MonitorId monitorId;
    private MonitorStatus monitorStatus;
    private HealthScore healthScore;
    private HealthExaminationOrder healthExaminationOrder;
    private HealthPlanProfile healthPlan;

    public HealthMonitor(ApplyMonitorCommand command) {
        this.monitorId = new MonitorId(command.getMonitorId());
        this.monitorStatus = MonitorStatus.INITIALIZED;
        Anamneses anamneses = new Anamneses(command.getAllergy(), command.getInjection(), command.getSurgery());
        Symptom symptom = new Symptom(command.getSymptomDescription(), command.getBodyPart(), command.getTimeDuration());
        String orderNumber = "order" + UUID.randomUUID().toString().toUpperCase();
        this.healthExaminationOrder = new HealthExaminationOrder(orderNumber, command.getAccount(), anamneses, symptom, OrderStatus.INITIALIZED);
        this.healthScore = new HealthScore(0);
    }

    public void generateHealthPlan(CreatePlanCommand command) {
        if (!StringUtils.equals(this.monitorId.getMonitorId(), command.getMonitorId())) {
            return;
        }
        HealthPlanProfile plan = new HealthPlanProfile(command.getPlanId(), command.getAccount(), command.getDoctor(), command.getDescription(), command.getTasks());
        this.healthPlan = plan;
    }

    public void performHealthTask(PerformTaskCommand command) {
        int taskScore = command.getHealthTaskProfile().getTaskScore();
        this.healthScore.plusScore(taskScore);
    }


}
