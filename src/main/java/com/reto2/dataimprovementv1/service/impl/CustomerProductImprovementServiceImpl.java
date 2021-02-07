package com.reto2.dataimprovementv1.service.impl;

import com.reto2.dataimprovementv1.dto.mapper.response.CustomerProductImprovementMapperResponse;
import com.reto2.dataimprovementv1.dto.request.CustomerProductImprovementRequest;
import com.reto2.dataimprovementv1.dto.response.CustomerProductImprovementResponse;
import com.reto2.dataimprovementv1.repository.CustomerProductImprovementRepository;
import com.reto2.dataimprovementv1.repository.entity.CustomerProductImprovementEntity;
import com.reto2.dataimprovementv1.service.CustomerProductImprovementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerProductImprovementServiceImpl implements CustomerProductImprovementService {
    @Autowired
    private CustomerProductImprovementRepository customerProductImprovementRepository;

    @Override
    public CustomerProductImprovementResponse save(CustomerProductImprovementRequest customerProductImprovementRequest) {
        CustomerProductImprovementResponse customerProductImprovementResponse = null;

        // convertir el request a entity
        CustomerProductImprovementEntity customerProductImprovementEntity = new CustomerProductImprovementEntity();
        customerProductImprovementEntity.setCic(customerProductImprovementRequest.getCic());
        customerProductImprovementEntity.setTioAux(customerProductImprovementRequest.getTioAux());
        customerProductImprovementEntity.setProductImprovementId(customerProductImprovementRequest.getProductImprovementId());
        customerProductImprovementEntity.setDescription(customerProductImprovementRequest.getDescription());

        customerProductImprovementRepository.save(customerProductImprovementEntity);

        // mapear el entity modificado al response
        CustomerProductImprovementMapperResponse customerProductImprovementMapperResponse = new CustomerProductImprovementMapperResponse();
        customerProductImprovementResponse = customerProductImprovementMapperResponse.convertEntityToResponse(customerProductImprovementEntity);

        return customerProductImprovementResponse;
    }
}
