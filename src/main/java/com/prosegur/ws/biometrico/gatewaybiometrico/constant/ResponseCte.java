package com.prosegur.ws.biometrico.gatewaybiometrico.constant;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ResponseCte {
    ACEPTADO("000", "La respuesta es satisfactoria."),

    ARCHIVO_NO_ENCONTRADO("150", "¡El archivo no fue encontrado!"),
    BASE64_DECODIFICACION_ERROR("150", "Ha ocurrido un error al decodificar el String BASE64."),
    BYTE_ARRAY_CODIFICACION_ERROR("151", "Ha ocurrido un error la codificar el byte array."),

    NUMERO_DOCUMENTO_NO_ENCONTRADO("200", "¡El número de documento no fue encontrado!"),

    FACIAL_ENCONTRADA("300", "Se ha reconocido a la persona satisfactoriamente."),
    FACIAL_NO_ENCONTRADA("301", "No se ha podido reconocer a la persona."),
    FACIAL_ERROR_GENERAL("350", "Ha ocurrido un error..."),
    FACIAL_ERROR_IMAGEN_NULL("351", "La imagen esta vacía."),

    DACTILAR_ENCONTRADO("400", "Se ha reconocido a la persona satisfactoriamente."),
    DACTILAR_NO_ENCONTRADO("401", "No se ha podido reconocer a la persona."),
    DACTILAR_ERROR_GENERAL("450", "Ha ocurrido un error inesperado en el reconocimiento dactilar."),
    DACTILAR_ERROR_ESPECIFICO("451", "Ha ocurrido un error inesperado con el mensaje: "),

    USUARIO_CLAVE_CORRECTA("500", "La clave es correcta."),
    USUARIO_CLAVE_ERROR_GENERAL("550", "Ha ocurrido un error inesperado al buscar la clave."),
    USUARIO_CLAVE_CLAVE_INCORRECTA("551", "La clave no es correcta."),
    USUARIO_CLAVE_VACIA("552", "La clave esta vacía."),

    MEJORES_HUELLAS_ENCONTRADO("600", "Las 2 mejores huellas se han encontrado satisfactoriamente."),
    MEJORES_HUELLAS_NO_ENCONTRADO("601", "No se pudo encontrar las mejores huellas de la persona."),
    MEJORES_HUELLAS_ERROR_GENERAL("650", "Ha ocurrido un error inesperado al buscar las huellas."),
    MEJORES_HUELLAS_ERROR_ESPECIFICO("651", "Ha ocurrido un error inesperado con el mensaje: "),
    ;

    private String codigo;
    private String mensaje;
}
