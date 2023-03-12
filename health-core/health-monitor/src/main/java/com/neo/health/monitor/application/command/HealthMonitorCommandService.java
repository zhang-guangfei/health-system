package com.neo.health.monitor.application.command;

import com.neo.health.monitor.domain.command.ApplyMonitorCommand;
import com.neo.health.monitor.domain.model.aggregate.HealthMonitor;
import com.neo.health.monitor.domain.model.aggregate.MonitorId;
import com.neo.health.monitor.domain.repository.HealthMonitorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

/**
 * @author C12961
 * @date 2023/3/12 18:10
 */
@Service
public class HealthMonitorCommandService {

    @Autowired
    HealthMonitorRepository healthMonitorRepository;


    public MonitorId handlerHealthMonitorApplication(ApplyMonitorCommand command) {
        String monitorId = "Monitor" + UUID.randomUUID().toString().toUpperCase();
        command.setMonitorId(monitorId);
        HealthMonitor healthMonitor = new HealthMonitor(command);
        healthMonitorRepository.save(healthMonitor);
        return healthMonitor.getMonitorId();
    }


}
