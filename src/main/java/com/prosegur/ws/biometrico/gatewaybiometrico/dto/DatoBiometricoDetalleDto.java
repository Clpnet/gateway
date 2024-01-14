package com.prosegur.ws.biometrico.gatewaybiometrico.dto;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class DatoBiometricoDetalleDto {
    private BigDecimal id;
    private BigDecimal tipoBiometrico;
    private byte[] imagenBiometrico;
    private byte[] templateBiometrico;
    private BigDecimal tipoTemplate;
    private BigDecimal idDedo;
    private char reniec;
    private String usuarioCreacion;
    private String usuarioModificacion;
}
