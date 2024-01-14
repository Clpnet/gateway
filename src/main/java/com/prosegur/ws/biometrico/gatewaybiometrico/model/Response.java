package com.prosegur.ws.biometrico.gatewaybiometrico.model;

import lombok.*;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
@AllArgsConstructor
public class Response {
    private String codigo;
    private String mensaje;
    private Object objeto;
}
