package com.cibertec.inventorymanagementapi.dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProveedorCreateDTO {

    private String ruc  ;
    private String nombre  ;
    private String contacto  ;
    private String email ;
    private String celular  ;
    private String estado;
}
