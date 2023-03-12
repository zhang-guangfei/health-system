package com.neo.health.monitor.domain.repository;

import com.neo.health.monitor.domain.model.aggregate.HealthMonitor;

/**
 * @author C12961
 * @date 2023/3/12 18:21
 */
public interface HealthMonitorRepository {

    void save(HealthMonitor healthMonitor);

}
