package com.prosegur.ws.biometrico.gatewaybiometrico.constant;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ReniecCte {

    LOCAL(0, "LOCAL"),
    MIXTO(1, "MIXTO"),
    RENIEC(2, "RENIEC"),

    DACTILAR(1, "DACTILAR"),
    FACIAL(2, "FACIAL");
    Integer codigo;
    String descripcion;
}
