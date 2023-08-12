package com.cibertec.inventorymanagementapi.service;

import com.cibertec.inventorymanagementapi.dtos.CategoriaProductoCreateDTO;
import com.cibertec.inventorymanagementapi.dtos.CategoriaProductoDTO;
import com.cibertec.inventorymanagementapi.dtos.CategoriaProductoUpdateDTO;

import java.util.List;

public interface CategoriaProductoService {

    List<CategoriaProductoDTO> listarCategoriasProducto();
    CategoriaProductoDTO obtenerCategoriaProductoPorID(long id);
    CategoriaProductoDTO registrarCategoriaProducto(CategoriaProductoCreateDTO categoriaProductoCreateDTO);
    CategoriaProductoDTO actualizarCategoriaProducto(CategoriaProductoUpdateDTO categoriaProductoUpdateDTO);
    String eliminarCategoriaProducto(long id);
}
