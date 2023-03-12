package com.neo.health.monitor.domain.model.entity;

import com.neo.health.common.domain.model.value.Anamneses;
import com.neo.health.common.domain.model.value.Symptom;
import com.neo.health.common.domain.type.Entity;
import com.neo.health.monitor.domain.model.value.OrderStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 健康体检单据实体
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class HealthExaminationOrder implements Entity {
    private String orderNumber;
    private String account;
    private Anamneses anamneses;
    private Symptom symptom;
    private OrderStatus orderStatus;

    public HealthExaminationOrder(Anamneses anamneses, Symptom symptom) {
        this.anamneses = anamneses;
        this.symptom = symptom;
    }


}
