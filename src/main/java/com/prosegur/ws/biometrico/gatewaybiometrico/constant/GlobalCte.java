package com.prosegur.ws.biometrico.gatewaybiometrico.constant;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum GlobalCte {
    /* INDICADOR DE REPOSITORIO */
    REPOSITORIO_LOCAL(1, "Se guarda los usuarios en un repositorio local"),

    /* TIPO DE DOCUMENTO */
    TIPO_DOCUMENTO_DNI(1, "Indica que el tipo de documento es DNI"),
    TIPO_DOCUMENTO_CARNET_EXTRANJERIA(2, "Indica que el tipo de documento es CARNET DE EXTRANJERIA"),

    /* TIPO DE CONEXION */
    CONEXION_LOCAL(0, "Conexion establecido localmente"),
    CONEXION_MIXTA(1, "Conexion establecido mixta(localmente se guarda y reniec se verifica 1 vez)"),
    CONEXION_RENIEC(2, "Conexion establecido reniec");
    private Integer codigo;
    private String descripcion;
}
