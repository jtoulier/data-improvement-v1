package com.reto2.dataimprovementv1.service.impl;

import com.reto2.dataimprovementv1.dto.mapper.response.ProductImprovementMapperResponse;
import com.reto2.dataimprovementv1.dto.response.ProductImprovementResponse;
import com.reto2.dataimprovementv1.repository.ProductImprovementRepository;
import com.reto2.dataimprovementv1.repository.entity.ProductImprovementEntity;
import com.reto2.dataimprovementv1.repository.entity.key.ProductImprovementEntityKey;
import com.reto2.dataimprovementv1.service.ProductImprovementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ProductImprovementServiceImpl implements ProductImprovementService {
    @Autowired
    private ProductImprovementRepository productImprovementRepository;

    @Override
    public ProductImprovementResponse findByProductImprovementId(Short productImprovementId) {
        ProductImprovementResponse productImprovementResponse = null;

        ProductImprovementEntityKey productImprovementEntityKey = new ProductImprovementEntityKey();
        productImprovementEntityKey.setProductImprovementId(productImprovementId);

        Optional<ProductImprovementEntity> productImprovementEntityOptional = productImprovementRepository.findById(productImprovementEntityKey);

        if (productImprovementEntityOptional.isPresent()) {
            ProductImprovementMapperResponse productImprovementMapperResponse = new ProductImprovementMapperResponse();
            productImprovementResponse = productImprovementMapperResponse.convertEntityToResponse(productImprovementEntityOptional.get());
        }

        return productImprovementResponse;
    }

    @Override
    public List<ProductImprovementResponse> findByTioAux(String tioAux) {
        List<ProductImprovementEntity> productImprovementEntityList = productImprovementRepository.findByTioAux(tioAux);

        ProductImprovementMapperResponse productImprovementMapperResponse = new ProductImprovementMapperResponse();

        return productImprovementMapperResponse.convertEntityListToResponseList(productImprovementEntityList);
    }
}
