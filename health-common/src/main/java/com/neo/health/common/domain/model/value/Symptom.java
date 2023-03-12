package com.neo.health.common.domain.model.value;

import com.neo.health.common.domain.type.ValueObject;
import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 症状
 */
@Getter
@AllArgsConstructor
public class Symptom implements ValueObject {

    private String symptomDescription; // 症状描述
    private String bodyPart; // 身体部位
    private String timeDuration; // 持续时间
}
