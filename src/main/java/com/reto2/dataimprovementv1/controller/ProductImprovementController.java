package com.reto2.dataimprovementv1.controller;

import com.reto2.dataimprovementv1.repository.ProductImprovementRepository;
import com.reto2.dataimprovementv1.repository.entity.ProductImprovementEntity;
import com.reto2.dataimprovementv1.repository.entity.key.ProductImprovementEntityKey;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/data-improvement-v1")
public class ProductImprovementController {
    @Autowired
    private ProductImprovementRepository productImprovementRepository;

    @GetMapping("/product-improvement/{product-improvement-id}")
    public ProductImprovementEntity findByProductImprovementId(
        @PathVariable("product-improvement-id") Short productImprovementId
    ) {
        ProductImprovementEntityKey productImprovementEntityKey = new ProductImprovementEntityKey();
        productImprovementEntityKey.setProductImprovementId(productImprovementId);

        return productImprovementRepository.findById(productImprovementEntityKey).get();
    }

    @GetMapping("/product/{tio-aux}/product-improvement")
    public List<ProductImprovementEntity> findByTioAux(
        @PathVariable("tio-aux") String tioAux
    )  {
        return productImprovementRepository.findByTioAux(tioAux);
    }
}
