package com.cibertec.inventorymanagementapi.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name="tb_producto")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_producto")
    private Long idProducto  ;

    @Column(name = "nombre_producto", length = 100, nullable = false )
    private String nombre ;

    @Column(name = "imagen", length = 500)
    private String imagen  ;

    @Column(name = "descripcion", length = 200, nullable = false )
    private String descripcion  ;

    @Column(name = "precio_unitario", nullable = false )
    private BigDecimal precioUnitario  ;

    @Column(name = "stock")
    private Integer stock ;

    @ManyToOne
    @JoinColumn(name = "id_categoria")
    private CategoriaProducto categoriaProducto ;

    @ManyToOne
    @JoinColumn(name = "id_proveedor")
    private Proveedor proveedor  ;
}
