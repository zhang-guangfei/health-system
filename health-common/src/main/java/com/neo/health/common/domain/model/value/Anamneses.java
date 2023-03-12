package com.neo.health.common.domain.model.value;


import com.neo.health.common.domain.type.ValueObject;
import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 既往病史
 */
@Getter
@AllArgsConstructor
public class Anamneses implements ValueObject {
    private String allergy; // 过敏史
    private String injection; // 预防注射史
    private String surgery; // 外科手术史

}
