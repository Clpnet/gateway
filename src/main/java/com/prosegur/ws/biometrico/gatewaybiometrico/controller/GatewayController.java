package com.prosegur.ws.biometrico.gatewaybiometrico.controller;

import com.prosegur.ws.biometrico.gatewaybiometrico.model.Request;
import com.prosegur.ws.biometrico.gatewaybiometrico.model.Response;
import com.prosegur.ws.biometrico.gatewaybiometrico.service.DactilarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.logging.Logger;


@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*", methods= {RequestMethod.GET, RequestMethod.POST, RequestMethod.OPTIONS})
@RequestMapping("api/dactilar")
public class GatewayController {

    @Autowired
    DactilarService service;

    @GetMapping("/mejoresHuellas/{dni}")
    public Response mejoresHuellas(@PathVariable String dni,
                                   @RequestHeader("usuario") String usuario) {
        Logger.getAnonymousLogger().info("Consulta servicio de mejores huellas: Dni: "+dni);
        return service.mejoresHuellas(dni, usuario);
    }

    @PostMapping("/verificarDactilar")
    public Response verificarDactilar(@RequestBody Request request,
                                      @RequestHeader("usuario") String usuario) {
        Logger.getAnonymousLogger().info("Consulta validacion biometrica: Dni: "+request.getNumeroDocumentoConsulta());
        return service.verificacionDactilar(request, usuario);
    }

}
