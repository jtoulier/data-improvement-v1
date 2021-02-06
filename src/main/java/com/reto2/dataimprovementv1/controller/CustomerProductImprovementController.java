package com.reto2.dataimprovementv1.controller;

import com.reto2.dataimprovementv1.dto.request.CustomerProductImprovementRequest;
import com.reto2.dataimprovementv1.repository.CustomerProductImprovementRepository;
import com.reto2.dataimprovementv1.repository.entity.CustomerProductImprovementEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/data-improvement-v1")
public class CustomerProductImprovementController {

    @Autowired
    private CustomerProductImprovementRepository customerProductImprovementRepository;

    @PostMapping("/customer-product-improvement")
    public CustomerProductImprovementEntity save(
            @RequestBody CustomerProductImprovementRequest customerProductImprovementRequest
    ) {

        CustomerProductImprovementEntity customerProductImprovementEntity = new CustomerProductImprovementEntity();

        customerProductImprovementEntity.setCic(customerProductImprovementRequest.getCic());
        customerProductImprovementEntity.setTioAux(customerProductImprovementRequest.getTioAux());
        customerProductImprovementEntity.setProductImprovementId(customerProductImprovementRequest.getProductImprovementId());
        customerProductImprovementEntity.setDescription(customerProductImprovementRequest.getDescription());

        customerProductImprovementRepository.save(customerProductImprovementEntity);

        return  customerProductImprovementEntity;
    }
}
