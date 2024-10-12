package com.mdsdigital.prueba.aplicacion.evento.handler.pipeline.consulta;

import an.awesome.pipelinr.Command;
import com.mdsdigital.prueba.aplicacion.dto.ProductoDTO;
import com.mdsdigital.prueba.aplicacion.dto.pipeline.comando.RespuestaComando;
import com.mdsdigital.prueba.aplicacion.dto.pipeline.consulta.ConsultarProductosComando;
import com.mdsdigital.prueba.aplicacion.servicio.consulta.ConsultarProductosServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author Carolina Marin Hincapie
 * Clase Handler o manejador para obtener los productos
 */
@Component
public class ConsultarProductosManejador implements Command.Handler<ConsultarProductosComando, RespuestaComando> {

    @Autowired
    private ConsultarProductosServicio consultarProductosServicio;

    /**
     * Manejador para obtener la lista de productos
     * @param comando Comando de Consultar Productos
     * @return RespuestaComando Retorna la lista de productos
     * si es exitoso o false en caso contrario
     */
    public RespuestaComando handle(ConsultarProductosComando comando){
        List<ProductoDTO> productos = consultarProductosServicio.obtenerProductos();
        RespuestaComando respuesta = new RespuestaComando(false,
                "No se encuentran productos", productos, HttpStatus.ACCEPTED);

        if (productos == null || productos.isEmpty()){
            return respuesta;
        }
        return new RespuestaComando(true,"Consulta exitosa", productos,
                HttpStatus.ACCEPTED);
    }
}
