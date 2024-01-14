package com.prosegur.ws.biometrico.gatewaybiometrico.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TransaccionDto {
    private Long id;
    private int tipoDocumento;
    private String numeroDocumento;
    private String nombreCompleto;
    private String ip;
    private String mac;
    private String serialDispositivo;
    private int tipoTransaccion;
    private int codigoRespuesta;
    private String token;
    private int tipoDato;
    private int calidadBiometrica;
    private int identificadorDato;
    private byte[] imagenBiometrica;
    private Character indicador;
    private String usuarioCreacion;
}
