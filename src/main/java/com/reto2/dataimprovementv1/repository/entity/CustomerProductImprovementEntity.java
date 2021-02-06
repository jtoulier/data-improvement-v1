package com.reto2.dataimprovementv1.repository.entity;

import lombok.*;

import javax.persistence.*;
import javax.persistence.criteria.CriteriaBuilder;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(schema = "improvement", name = "customer_product_improvement")
public class CustomerProductImprovementEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "customer_product_improvement_id")
    private Integer customerProductImprovementId;

    @Column(name = "cic")
    private String cic;

    @Column(name = "tio_aux")
    private String tioAux;

    @Column(name = "product_improvement_id")
    private Short productImprovementId;

    @Column(name = "description")
    private String description;

    public CustomerProductImprovementEntity(String cic, String tioAux, Short productImprovementId, String description) {
        this.cic = cic;
        this.tioAux = tioAux;
        this.productImprovementId = productImprovementId;
        this.description = description;
    }
}
