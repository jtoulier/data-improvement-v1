package com.reto2.dataimprovementv1.repository.entity;

import com.reto2.dataimprovementv1.repository.entity.key.ProductImprovementEntityKey;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(schema = "improvement", name = "product_improvement")
public class ProductImprovementEntity {
    @EmbeddedId
    private ProductImprovementEntityKey productImprovementEntityKey;

    @Column(name = "tio_aux")
    private String tioAux;

    @Column(name = "description")
    private String description;

    @Column(name = "days_effort")
    private Short daysEffort;
}
