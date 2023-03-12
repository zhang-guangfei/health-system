package com.neo.health.monitor.domain.model.entity;

import com.neo.health.common.domain.type.Entity;
import com.neo.health.common.domain.type.ValueObject;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Setter;

/**
 * @description 健康分数
 * @author C12961
 * @date 2023/3/12 16:05
 */
@Setter
@AllArgsConstructor
public class HealthScore implements ValueObject {
    private int score;

    public void plusScore(int taskScore) {
        this.score += taskScore;
    }

}
