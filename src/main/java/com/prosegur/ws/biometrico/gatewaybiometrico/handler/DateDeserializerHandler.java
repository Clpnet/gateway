package com.prosegur.ws.biometrico.gatewaybiometrico.handler;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;

import java.io.IOException;
import java.util.Calendar;
import java.util.Date;


public class DateDeserializerHandler extends StdDeserializer<Date> {
    public DateDeserializerHandler() {
        this(null);
    }

    public DateDeserializerHandler(Class<?> clazz) {
        super(clazz);
    }

    @Override
    public Date deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
        String date = p.getText();
        try {
            String[] dateArray = date.split("-");
            Calendar cal = Calendar.getInstance();
            cal.set(Calendar.YEAR, Integer.parseInt(dateArray[0]));
            cal.set(Calendar.MONTH, Integer.parseInt(dateArray[1]));
            cal.set(Calendar.DAY_OF_MONTH, Integer.parseInt(dateArray[2]));
            return cal.getTime();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            return null;
        }
    }
}
