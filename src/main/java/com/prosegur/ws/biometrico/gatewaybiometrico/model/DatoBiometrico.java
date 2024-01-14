package com.prosegur.ws.biometrico.gatewaybiometrico.model;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.prosegur.ws.biometrico.gatewaybiometrico.handler.ImagenDeserializerHandler;
import com.prosegur.ws.biometrico.gatewaybiometrico.handler.ImagenSerializerHandler;
import lombok.*;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
@AllArgsConstructor
public class DatoBiometrico {
    private Integer id;
    private Integer tipoDato;
    private Integer calidadBiometrica;
    private Integer identificadorDato;
    @JsonDeserialize(using = ImagenDeserializerHandler.class)
    @JsonSerialize(using = ImagenSerializerHandler.class)
    private byte[] imagenBiometrico;
    private Integer tipoImagen;
    @JsonDeserialize(using = ImagenDeserializerHandler.class)
    @JsonSerialize(using = ImagenSerializerHandler.class)
    private byte[] templateBiometrico;
    private Integer tipoTemplate;
}
