package com.reto2.dataimprovementv1.dto.mapper.response;

import com.reto2.dataimprovementv1.dto.response.ProductImprovementResponse;
import com.reto2.dataimprovementv1.repository.entity.ProductImprovementEntity;

import java.util.ArrayList;
import java.util.List;

public class ProductImprovementMapperResponse {
    public ProductImprovementResponse convertEntityToResponse (ProductImprovementEntity productImprovementEntity) {
        ProductImprovementResponse productImprovementResponse = null;

        if (productImprovementEntity != null) {
            productImprovementResponse = new ProductImprovementResponse();

            productImprovementResponse.setProductImprovementId(productImprovementEntity.getProductImprovementEntityKey().getProductImprovementId());
            productImprovementResponse.setTioAux(productImprovementEntity.getTioAux());
            productImprovementResponse.setDescription(productImprovementEntity.getDescription());
            productImprovementResponse.setDaysEffort(productImprovementEntity.getDaysEffort());
        }

        return  productImprovementResponse;
    }

    public List<ProductImprovementResponse> convertEntityListToResponseList(List<ProductImprovementEntity> productImprovementEntityList) {
        List<ProductImprovementResponse> productImprovementResponseList = new ArrayList<>();

        if (productImprovementEntityList != null) {
            for(ProductImprovementEntity productImprovementEntity : productImprovementEntityList) {
                ProductImprovementResponse productImprovementResponse = convertEntityToResponse(productImprovementEntity);
                productImprovementResponseList.add(productImprovementResponse);
            }
        }

        return productImprovementResponseList;
    }
}
