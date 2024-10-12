
package com.mdsdigital.prueba.dominio.modelo;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "producto_pk")
    private Long idProducto;

    private String nombreItem;

    private String tipoItem;

    private int unidades;

    private BigDecimal precio;
}
