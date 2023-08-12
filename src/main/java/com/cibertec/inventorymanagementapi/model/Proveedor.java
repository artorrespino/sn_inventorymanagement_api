package com.cibertec.inventorymanagementapi.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name="tb_proveedor")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Proveedor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_proveedor")
    private Long idProveedor ;

    @Column(length = 20, nullable = false )
    private String ruc  ;

    @Column(length = 50, nullable = false )
    private String nombre  ;

    @Column(length = 100, nullable = false )
    private String contacto  ;

    @Column(length = 100, nullable = false )
    private String email ;

    @Column(length = 30, nullable = false )
    private String celular  ;

    @Column(length = 20, nullable = false )
    private String estado;
}
