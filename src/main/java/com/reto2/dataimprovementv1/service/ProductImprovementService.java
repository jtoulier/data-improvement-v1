package com.reto2.dataimprovementv1.service;

import com.reto2.dataimprovementv1.dto.response.ProductImprovementResponse;

import java.util.List;

public interface ProductImprovementService {
    ProductImprovementResponse findByProductImprovementId(Short productImprovementId);
    List<ProductImprovementResponse> findByTioAux(String tioAux);

}
