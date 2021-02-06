package com.reto2.dataimprovementv1.dto.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomerProductImprovementRequest {
    private String cic;
    private String tioAux;
    private Short productImprovementId;
    private String description;
}
