package com.mdsdigital.prueba.aplicacion.servicio.consulta;

import com.mdsdigital.prueba.aplicacion.dto.ProductoDTO;
import com.mdsdigital.prueba.aplicacion.util.ObjectMapperUtils;
import com.mdsdigital.prueba.infraestructura.persistencia.ProductoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Carolina Marin Hincapie
 * Clase Servicio que obtiene los productos
 */
@Service
public class ConsultarProductosServicio {

    @Autowired
    private ProductoRepositorio productoRepositorio;

    /**
     * Metodo que obtiene la lista de productos
     * @return  Lista de productos
     */
    public List<ProductoDTO> obtenerProductos(){
        return ObjectMapperUtils.mapAll(productoRepositorio.findAll(), ProductoDTO.class);
    }
}