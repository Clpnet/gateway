package com.prosegur.ws.biometrico.gatewaybiometrico.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MejorHuellaDto {
    private String mejorHuella;
    private String mejorHuellaDescripcion;
    private boolean tieneRegistro;
    private boolean esMejorHuellaReniec;
}
