package com.prosegur.ws.biometrico.gatewaybiometrico.function;

import com.prosegur.ws.biometrico.gatewaybiometrico.constant.ResponseCte;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Base64;

public class Util {

    private static final Logger LOGGER = LogManager.getLogger(Util.class);

    public static byte[] base64ToByte(String base64) {
        try {
            return Base64.getMimeDecoder()
                    .decode(base64.replace("\"", ""));
        } catch (Exception e) {
            LOGGER.info("Error N° {}: {} '{}'", ResponseCte.BASE64_DECODIFICACION_ERROR.getCodigo(), ResponseCte.BASE64_DECODIFICACION_ERROR.getMensaje(), e.getMessage());
            e.printStackTrace();
            return null;
        }
    }

    public static String byteToBase64(byte[] byteArray) {
        try {
            return Base64.getEncoder().encodeToString(byteArray);
        } catch (Exception e) {
            LOGGER.info("Error N° {}: {} '{}'", ResponseCte.BYTE_ARRAY_CODIFICACION_ERROR.getCodigo(), ResponseCte.BYTE_ARRAY_CODIFICACION_ERROR.getMensaje(), e.getMessage());
            e.printStackTrace();
            return null;
        }
    }
}
