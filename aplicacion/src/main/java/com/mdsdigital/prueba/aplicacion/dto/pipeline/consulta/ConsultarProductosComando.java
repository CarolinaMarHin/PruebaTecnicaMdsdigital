package com.mdsdigital.prueba.aplicacion.dto.pipeline.consulta;

import an.awesome.pipelinr.Command;
import com.mdsdigital.prueba.aplicacion.dto.pipeline.comando.RespuestaComando;
import lombok.Getter;
import lombok.Setter;

/**
 * @author Carolina Marin Hincapie
 * Clase comando para obtener la lista de productos
 */
@Getter
@Setter
public class ConsultarProductosComando implements Command<RespuestaComando> {

}
