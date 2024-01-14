package com.prosegur.ws.biometrico.gatewaybiometrico.model;

import lombok.*;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
@AllArgsConstructor
public class Request {
    private String base64;
    private String numeroDocumentoConsulta;

}
