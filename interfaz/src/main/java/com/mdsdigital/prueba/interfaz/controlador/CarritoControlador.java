package com.mdsdigital.prueba.interfaz.controlador;

import an.awesome.pipelinr.Pipeline;
import com.mdsdigital.prueba.aplicacion.dto.pipeline.comando.RespuestaComando;
import com.mdsdigital.prueba.aplicacion.dto.pipeline.consulta.ConsultarProductosComando;
import com.mdsdigital.prueba.aplicacion.util.Constantes;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * @author Carolina Marin Hincapie
 * Clase Controlador o Controller para manejar las peticiones API REST para la prueba tecnica
 */
@CrossOrigin(origins = "*", methods = { RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE })
@RequestMapping("/api/v1/carrito")
@RestController
public class CarritoControlador {

    @Autowired
    private Pipeline pipeline;

    /**
     * Método que obtiene la lista del carrito
     * @return ResponseEntity<RespuestaComando> Respuesta con la informacion del carrito
     */
    @Operation(summary = "Obtener información de los productos")
    @ApiResponses(value = {
            @ApiResponse(responseCode = Constantes.OK_200, content = { @Content(mediaType = Constantes.APPLICATION_JSON, schema =
            @Schema(implementation = ConsultarProductosComando.class))}, description = Constantes.RESPUESTA_OK),
            @ApiResponse(responseCode = Constantes.NOT_FOUND_404, content = { @Content(mediaType = Constantes.APPLICATION_JSON)}, description =
                    Constantes.RESPUESTA_NOT_FOUND),
            @ApiResponse(responseCode = Constantes.INTERNAL_SERVER_ERROR_500, content = { @Content(mediaType = Constantes.APPLICATION_JSON)}, description =
                    Constantes.INTERNAL_SERVER_ERROR_500)
    })
    @GetMapping("/consultarProductos")
    public ResponseEntity<RespuestaComando> consultarProductos() {
        RespuestaComando respuesta = pipeline.send(new ConsultarProductosComando());
        return new ResponseEntity<>(respuesta, respuesta.getEstadoHttp());
    }
}
