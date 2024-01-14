package com.prosegur.ws.biometrico.gatewaybiometrico.model;

import com.acj.lib.reniec.model.ResponseService;
import lombok.*;

import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ResponseServiceReniec extends ResponseService {

    private int codigoError;
    private String descripcionError;
    private int codigoErrorReniec;
    private String descripcionErrorReniec;
    private int tipoDocumento;
    private String numeroDocumento;
    private String mejorHuellaDerecha;
    private String mejorHuellaDerechaDesc;
    private String mejorHuellaIzquierda;
    private String mejorHuellaIzquierdaDesc;
    private String nombrePersona;
    private String apellidoPaternoPersona;
    private String apellidoMaternoPersona;
    private String fechaCaducidad;
    private String fechaNacimiento;
    private String vigencia;
    private String restriccion;
    private String grupoRestriccion;
    private String token = UUID.randomUUID().toString().toLowerCase().replace("-", "");
}
