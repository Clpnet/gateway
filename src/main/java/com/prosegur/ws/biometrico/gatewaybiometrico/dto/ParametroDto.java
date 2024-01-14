package com.prosegur.ws.biometrico.gatewaybiometrico.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ParametroDto {
    private String id;
    private String codigo;
    private String descripcion;
    private String valor;
    private String estado;
}
