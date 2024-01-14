package com.prosegur.ws.biometrico.gatewaybiometrico.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class ResponseMejoresHuellasDto {
    private int codigoError;
    private String descripcionError;
    private int codigoErrorReniec;
    private String descripcionErrorReniec;
    List<MejorHuellaDto> listaMejoresHuellas;
}
