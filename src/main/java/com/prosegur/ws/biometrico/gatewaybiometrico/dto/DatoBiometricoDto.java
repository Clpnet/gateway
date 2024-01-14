package com.prosegur.ws.biometrico.gatewaybiometrico.dto;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.List;

@Getter
@Setter
public class DatoBiometricoDto {
    private BigDecimal id;
    private BigDecimal tipoDocumento;
    private String numeroDocumento;
    private String usuarioCreacion;
    private List<DatoBiometricoDetalleDto> listaDatoBiometricoDetalle;
}
