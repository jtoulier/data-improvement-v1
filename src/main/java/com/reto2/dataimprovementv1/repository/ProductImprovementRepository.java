package com.reto2.dataimprovementv1.repository;

import com.reto2.dataimprovementv1.repository.entity.ProductImprovementEntity;
import com.reto2.dataimprovementv1.repository.entity.key.ProductImprovementEntityKey;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductImprovementRepository extends JpaRepository<ProductImprovementEntity, ProductImprovementEntityKey> {
    List<ProductImprovementEntity> findByTioAux(String tioAux);
}
