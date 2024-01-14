package com.prosegur.ws.biometrico.gatewaybiometrico.handler;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import com.prosegur.ws.biometrico.gatewaybiometrico.constant.ResponseCte;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;
import java.util.Base64;

public class ImagenSerializerHandler extends StdSerializer<byte[]> {

    private static final Logger LOGGER = LogManager.getLogger(ImagenSerializerHandler.class);

    public ImagenSerializerHandler() {
        this(null);
    }

    public ImagenSerializerHandler(Class<byte[]> vc) {
        super(vc);
    }

    @Override
    public void serialize(byte[] bytes, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
        try {
            String encode = Base64.getEncoder().encodeToString(bytes);
            jsonGenerator.writeString(encode);
        } catch (IOException e) {
            LOGGER.info("Error N° {}: {} '{}'", ResponseCte.BYTE_ARRAY_CODIFICACION_ERROR.getCodigo(), ResponseCte.BYTE_ARRAY_CODIFICACION_ERROR.getMensaje(), e.getMessage());
            e.printStackTrace();
        }
    }
}
