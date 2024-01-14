package com.prosegur.ws.biometrico.gatewaybiometrico.service;

import com.acj.lib.reniec.ReniecApplication;
import com.acj.lib.reniec.model.ResponseService;
import com.prosegur.ws.biometrico.gatewaybiometrico.constant.ResponseCte;
import com.prosegur.ws.biometrico.gatewaybiometrico.model.Request;
import com.prosegur.ws.biometrico.gatewaybiometrico.model.Response;
import com.prosegur.ws.biometrico.gatewaybiometrico.model.ResponseServiceReniec;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import java.util.UUID;
import java.util.logging.Logger;

@Service
public class DactilarService {

    ReniecApplication libreriaReniec = new ReniecApplication();

    @Value("${app.reniec.ruc}")
    private String rucReniec;

    @Value("${app.reniec.urlMejores}")
    private String urlMejores;

    @Value("${app.reniec.urlValidacion}")
    private String urlValidacion;
    @Value("${app.reniec.usuario}")
    private String usuarioReniec;
    @Value("${app.reniec.pass}")
    private String passReniec;

    @Value("${app.reniec.dni}")
    private String dniReniec;

    @Value("${app.reniec.ip}")
    private String ipReniec;

    @Value("${app.reniec.mac}")
    private String macReniec;

    public Response mejoresHuellas(String numeroDocumento, String usuario) {
        try {
            ResponseService responseService = libreriaReniec.getQualityFinger(
                    rucReniec,
                    urlMejores,
                    usuarioReniec,
                    passReniec,
                    10000,
                    10000,
                    dniReniec,
                    numeroDocumento,
                    ipReniec,
                    macReniec
            );

            return new Response(
                    ResponseCte.ACEPTADO.getCodigo(),
                    ResponseCte.ACEPTADO.getMensaje(),
                    responseService
            );

        } catch (Exception e) {
            e.printStackTrace();
            return new Response(
                    ResponseCte.MEJORES_HUELLAS_ERROR_ESPECIFICO.getCodigo(),
                    ResponseCte.MEJORES_HUELLAS_ERROR_ESPECIFICO.getMensaje(),
                    e.getMessage()
            );
        }
    }

    public Response verificacionDactilar(Request request, String usuario) {

        Logger.getAnonymousLogger().info("Ingreso a validacion biometrica: NroDoc: "+request.getNumeroDocumentoConsulta());

        try {
            Logger.getAnonymousLogger().info("Esta habilitado solo consultas a RENIEC");
            ResponseServiceReniec responseServiceReniec = consultarReniec(request);

            return new Response(
                    ResponseCte.ACEPTADO.getCodigo(),
                    ResponseCte.ACEPTADO.getMensaje(),
                    responseServiceReniec
            );

        } catch (Exception e) {
            e.printStackTrace();
            return new Response(
                    ResponseCte.DACTILAR_ERROR_GENERAL.getCodigo(),
                    ResponseCte.DACTILAR_ERROR_GENERAL.getMensaje(),
                    e.getMessage()
            );
        }
    }

    public ResponseServiceReniec consultarReniec(Request request){
        ResponseServiceReniec response = new ResponseServiceReniec();

        ResponseService responseService = libreriaReniec.verifyMinucia(
                request.getBase64().replace("\"", ""),
                request.getBase64().replace("\"", ""),
                10000,
                10000,
                rucReniec,
                request.getNumeroDocumentoConsulta(),
                dniReniec,
                ipReniec,
                macReniec,
                0,
                urlValidacion,
                usuarioReniec,
                passReniec
        );

        response.setCodigoError(responseService.getCodigoError());
        response.setDescripcionError(responseService.getDescripcionError());
        response.setCodigoErrorReniec(responseService.getCodigoErrorReniec());
        response.setDescripcionErrorReniec(responseService.getDescripcionErrorReniec());
        response.setTipoDocumento(responseService.getTipoDocumento());
        response.setNumeroDocumento(responseService.getNumeroDocumento());
        response.setMejorHuellaDerecha(responseService.getMejorHuellaDerecha());
        response.setMejorHuellaDerechaDesc(responseService.getMejorHuellaDerechaDesc());
        response.setMejorHuellaIzquierda(responseService.getMejorHuellaIzquierda());
        response.setMejorHuellaIzquierdaDesc(responseService.getMejorHuellaIzquierdaDesc());
        response.setNombrePersona(responseService.getNombrePersona());
        response.setApellidoPaternoPersona(responseService.getApellidoPaternoPersona());
        response.setApellidoMaternoPersona(responseService.getApellidoMaternoPersona());
        response.setFechaCaducidad(responseService.getFechaCaducidad());
        response.setFechaNacimiento(responseService.getFechaNacimiento());
        response.setVigencia(responseService.getVigencia());
        response.setRestriccion(responseService.getRestriccion());
        response.setGrupoRestriccion(responseService.getGrupoRestriccion());
        response.setToken(UUID.randomUUID().toString().toLowerCase().replace("-", ""));

        return response;
    }
}
