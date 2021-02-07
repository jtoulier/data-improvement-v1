package com.reto2.dataimprovementv1.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomerProductImprovementResponse {
    private Integer customerProductImprovementId;
    private String cic;
    private String tioAux;
    private Short productImprovementId;
    private String description;
}
