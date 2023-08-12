package com.cibertec.inventorymanagementapi.mappers;

import com.cibertec.inventorymanagementapi.dtos.ProveedorCreateDTO;
import com.cibertec.inventorymanagementapi.dtos.ProveedorDTO;
import com.cibertec.inventorymanagementapi.dtos.ProveedorUpdateDTO;
import com.cibertec.inventorymanagementapi.model.Proveedor;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface ProveedorMapper {

    ProveedorMapper INSTANCIA = Mappers.getMapper(ProveedorMapper.class);

    ProveedorDTO proveedorAProveedorDTO(Proveedor proveedor);
    Proveedor proveedorDTOAProveedor(ProveedorDTO proveedorDTO);
    Proveedor proveedorCreateDTOAProveedor(ProveedorCreateDTO proveedorCreateDTO);
    Proveedor proveedorUpdateDTOAProveedor(ProveedorUpdateDTO proveedorUpdateDTO);

    List<ProveedorDTO> listaProveedorAListaProveedorDTO(List<Proveedor> listaProveedor);
}
