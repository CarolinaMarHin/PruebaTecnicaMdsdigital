package com.mdsdigital.prueba.aplicacion.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductoDTO {

    private Long idProducto;

    private String nombreItem;

    private String tipoItem;

    private int unidades;

    private BigDecimal precio;
}
