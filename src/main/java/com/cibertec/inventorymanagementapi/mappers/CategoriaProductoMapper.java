package com.cibertec.inventorymanagementapi.mappers;

import com.cibertec.inventorymanagementapi.dtos.CategoriaProductoCreateDTO;
import com.cibertec.inventorymanagementapi.dtos.CategoriaProductoDTO;
import com.cibertec.inventorymanagementapi.dtos.CategoriaProductoUpdateDTO;
import com.cibertec.inventorymanagementapi.model.CategoriaProducto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface CategoriaProductoMapper {

    CategoriaProductoMapper INSTANCIA = Mappers.getMapper(CategoriaProductoMapper.class);

    CategoriaProductoDTO categoriaProductoACategoriaProductoDTO(CategoriaProducto categoriaProducto);
    CategoriaProducto categoriaProductoDTOACategoriaProducto(CategoriaProductoDTO categoriaProductoDTO);
    CategoriaProducto categoriaProductoCreateDTOACategoriaProducto(CategoriaProductoCreateDTO categoriaProductoCreateDTO);
    CategoriaProducto categoriaProductoUpdateDTOACategoriaProducto(CategoriaProductoUpdateDTO categoriaProductoUpdateDTO);

    List<CategoriaProductoDTO> listaCategoriaProductoAListaCategoriaProductoDTO(List<CategoriaProducto> listaCategoriaProducto);
}
