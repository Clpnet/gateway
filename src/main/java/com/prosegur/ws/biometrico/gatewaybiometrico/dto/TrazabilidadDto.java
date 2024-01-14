package com.prosegur.ws.biometrico.gatewaybiometrico.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TrazabilidadDto {
    private Long id;
    private String codigoOperador;
    private String codigoAgencia;
    private String numeroDocumento;
    private Character tipoOperacion;
    private Character tipoConsulta;
    private int codDedo;
    private Character mejorHuella;
    private String ip;
    private String mac;
    private int resultadoOperacion;
    private String token;
}
