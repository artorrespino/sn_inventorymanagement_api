package com.cibertec.inventorymanagementapi.service;

import com.cibertec.inventorymanagementapi.dtos.ProductoCreateDTO;
import com.cibertec.inventorymanagementapi.dtos.ProductoDTO;
import com.cibertec.inventorymanagementapi.dtos.ProductoUpdateDTO;

import java.util.List;

public interface ProductoService {

    List<ProductoDTO> listarProductos();
    ProductoDTO obtenerProductoPorID(long id);
    ProductoDTO registrarProducto(ProductoCreateDTO productoCreateDTO);
    ProductoDTO actualizarProducto(ProductoUpdateDTO productoUpdateDTO);
    ProductoDTO eliminarProducto(long id);
}
