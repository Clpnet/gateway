package com.prosegur.ws.biometrico.gatewaybiometrico.handler;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import com.prosegur.ws.biometrico.gatewaybiometrico.constant.ResponseCte;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;
import java.util.Base64;

public class ImagenDeserializerHandler extends StdDeserializer<byte[]> {

    private static final Logger LOGGER = LogManager.getLogger(ImagenDeserializerHandler.class);

    public ImagenDeserializerHandler() {
        this(null);
    }

    public ImagenDeserializerHandler(Class<?> vc) {
        super(vc);
    }

    @Override
    public byte[] deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        String data = jsonParser.getText().replace("\"", "").replace("'", "");
        try {
            return Base64.getMimeDecoder()
                    .decode(data);
        } catch (Exception e) {
            LOGGER.info("Error N° {}: {} '{}'", ResponseCte.BASE64_DECODIFICACION_ERROR.getCodigo(), ResponseCte.BASE64_DECODIFICACION_ERROR.getMensaje(), e.getMessage());
            e.printStackTrace();
            return null;
        }
    }
}
