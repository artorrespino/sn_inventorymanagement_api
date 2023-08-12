package com.cibertec.inventorymanagementapi.mappers;

import com.cibertec.inventorymanagementapi.dtos.ProductoCreateDTO;
import com.cibertec.inventorymanagementapi.dtos.ProductoDTO;
import com.cibertec.inventorymanagementapi.dtos.ProductoUpdateDTO;
import com.cibertec.inventorymanagementapi.model.Producto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface ProductoMapper {

    ProductoMapper INSTANCIA = Mappers.getMapper(ProductoMapper.class);

    ProductoDTO productoAProductoDTO(Producto producto);
    Producto productoDTOAProducto(ProductoDTO productoDTO);
    Producto productoCreateDTOAProducto(ProductoCreateDTO productoCreateDTO);
    Producto productoUpdateDTOAProducto(ProductoUpdateDTO productoUpdateDTO);

    List<ProductoDTO> listaProductoAListaProductoDTO(List<Producto> listaProducto);
}
