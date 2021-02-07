package com.reto2.dataimprovementv1.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductImprovementResponse {
    private Short productImprovementId;
    private String tioAux;
    private String description;
    private Short daysEffort;
}
