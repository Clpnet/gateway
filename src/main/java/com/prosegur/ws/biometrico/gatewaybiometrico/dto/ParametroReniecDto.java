package com.prosegur.ws.biometrico.gatewaybiometrico.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ParametroReniecDto {
    private String usuario;
    private String password;
    private String ip;
    private String mac;
    private String ruc;
    private String dni;
    private String urlMejoresHuellas;
    private String urlValidacion;
}
