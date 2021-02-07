package com.reto2.dataimprovementv1.service;

import com.reto2.dataimprovementv1.dto.request.CustomerProductImprovementRequest;
import com.reto2.dataimprovementv1.dto.response.CustomerProductImprovementResponse;

public interface CustomerProductImprovementService {
    CustomerProductImprovementResponse save(CustomerProductImprovementRequest customerProductImprovementRequest);
}
