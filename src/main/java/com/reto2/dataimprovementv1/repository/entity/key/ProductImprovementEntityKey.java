package com.reto2.dataimprovementv1.repository.entity.key;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.criteria.CriteriaBuilder;
import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
public class ProductImprovementEntityKey implements Serializable {

    @Column(name = "product_improvement_id")
    private Short productImprovementId;
}
