package com.reto2.dataimprovementv1.repository;

import com.reto2.dataimprovementv1.repository.entity.CustomerProductImprovementEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerProductImprovementRepository extends JpaRepository<CustomerProductImprovementEntity, Integer> {
}
