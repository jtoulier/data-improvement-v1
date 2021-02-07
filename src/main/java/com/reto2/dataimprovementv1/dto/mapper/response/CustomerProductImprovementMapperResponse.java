package com.reto2.dataimprovementv1.dto.mapper.response;

import com.reto2.dataimprovementv1.dto.response.CustomerProductImprovementResponse;
import com.reto2.dataimprovementv1.repository.entity.CustomerProductImprovementEntity;

import java.util.ArrayList;
import java.util.List;

public class CustomerProductImprovementMapperResponse {

    public CustomerProductImprovementResponse convertEntityToResponse(CustomerProductImprovementEntity customerProductImprovementEntity) {
        CustomerProductImprovementResponse customerProductImprovementResponse = null;

        if (customerProductImprovementEntity != null) {
            customerProductImprovementResponse = new CustomerProductImprovementResponse();

            customerProductImprovementResponse.setCustomerProductImprovementId(customerProductImprovementEntity.getCustomerProductImprovementId());
            customerProductImprovementResponse.setCic(customerProductImprovementEntity.getCic());
            customerProductImprovementResponse.setTioAux(customerProductImprovementEntity.getTioAux());
            customerProductImprovementResponse.setProductImprovementId(customerProductImprovementEntity.getProductImprovementId());
            customerProductImprovementResponse.setDescription(customerProductImprovementEntity.getDescription());
        }

        return customerProductImprovementResponse;
    }

    public List<CustomerProductImprovementResponse> convertEntityListToResponseList(List<CustomerProductImprovementEntity> customerProductImprovementEntityList) {
        List<CustomerProductImprovementResponse> customerProductImprovementResponseList = new ArrayList<>();

        if (customerProductImprovementEntityList != null) {
            for (CustomerProductImprovementEntity customerProductImprovementEntity : customerProductImprovementEntityList) {
                CustomerProductImprovementResponse customerProductImprovementResponse = convertEntityToResponse(customerProductImprovementEntity);
                customerProductImprovementResponseList.add(customerProductImprovementResponse);
            }
        }

        return customerProductImprovementResponseList;
    }
}
