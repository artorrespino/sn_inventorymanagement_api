package com.cibertec.inventorymanagementapi.dtos;

import com.cibertec.inventorymanagementapi.model.CategoriaProducto;
import com.cibertec.inventorymanagementapi.model.Proveedor;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class ProductoDTO {

    private Long idProducto  ;
    private String nombre ;
    private String imagen  ;
    private String descripcion  ;
    private BigDecimal precioUnitario  ;
    private Integer stock ;
    private CategoriaProducto categoriaProducto ;
    private Proveedor proveedor  ;
}
