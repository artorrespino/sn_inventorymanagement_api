package com.cibertec.inventorymanagementapi.service;

import com.cibertec.inventorymanagementapi.dtos.ProveedorCreateDTO;
import com.cibertec.inventorymanagementapi.dtos.ProveedorDTO;
import com.cibertec.inventorymanagementapi.dtos.ProveedorUpdateDTO;

import java.util.List;

public interface ProveedorService {

    List<ProveedorDTO> listarProveedores();
    ProveedorDTO obtenerProveedorPorID(long id);
    ProveedorDTO registrarProveedor(ProveedorCreateDTO proveedorCreateDTO);
    ProveedorDTO actualizarProveedor(ProveedorUpdateDTO proveedorUpdateDTO);
    ProveedorDTO eliminarProveedor(long id);
}
