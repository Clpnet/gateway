package com.prosegur.ws.biometrico.gatewaybiometrico.handler;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;

import java.io.IOException;
import java.util.Calendar;
import java.util.Date;

public class DateSerializerHandler extends StdSerializer<Date> {
    public DateSerializerHandler() {
        this(null);
    }

    public DateSerializerHandler(Class<Date> vc) {
        super(vc);
    }

    @Override
    public void serialize(Date date, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        Calendar dateCalendar = Calendar.getInstance();
        dateCalendar.setTime(date);
        int year = dateCalendar.get(Calendar.YEAR);
        int month = dateCalendar.get(Calendar.MONTH) + 1;
        int day = dateCalendar.get(Calendar.DAY_OF_MONTH);
        String dateSerialize = year + "-"
                + (month < 10 ? ("0" + month) : (month)) + "-"
                + day;
        jsonGenerator.writeString(dateSerialize);
    }
}
