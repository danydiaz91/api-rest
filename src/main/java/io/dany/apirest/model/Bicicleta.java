package io.dany.apirest.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

/**
 * @author Dany Diaz
 */
@Entity
@Data
public class Bicicleta {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotNull
    private String color;
    private Integer modelo;
    @NotNull
    private BigDecimal precio;
    @NotNull
    private Integer numRin;
    private String marca;
}
