package com.cibertec.inventorymanagementapi.service;

import com.cibertec.inventorymanagementapi.dtos.ProveedorCreateDTO;
import com.cibertec.inventorymanagementapi.dtos.ProveedorDTO;
import com.cibertec.inventorymanagementapi.dtos.ProveedorUpdateDTO;
import com.cibertec.inventorymanagementapi.mappers.ProveedorMapper;
import com.cibertec.inventorymanagementapi.model.Proveedor;
import com.cibertec.inventorymanagementapi.repository.ProveedorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@Service
public class ProveedorServiceImpl implements ProveedorService {

    @Value("${constantes.ESTADO_ACTIVO}")
    private String estadoActivo;

    @Value("${constantes.ESTADO_INACTIVO}")
    private String estadoEliminado;

    @Autowired
    private ProveedorRepository proveedorRepository;

    @Override
    public List<ProveedorDTO> listarProveedores() {
        return ProveedorMapper.INSTANCIA.listaProveedorAListaProveedorDTO(proveedorRepository.findAll());
    }

    @Override
    public ProveedorDTO obtenerProveedorPorID(long id) {
        return proveedorRepository.findById(id)
                .map(ProveedorMapper.INSTANCIA::proveedorAProveedorDTO)
                .orElse(null);
    }

    @Override
    public ProveedorDTO registrarProveedor(ProveedorCreateDTO proveedorCreateDTO) {
        Proveedor proveedor = ProveedorMapper.INSTANCIA.proveedorCreateDTOAProveedor(proveedorCreateDTO);
        proveedor.setEstado(estadoActivo);// Asignar el estado activo al proveedor antes de guardarlo
        Proveedor proveedorGuardado = proveedorRepository.save(proveedor);
        return ProveedorMapper.INSTANCIA.proveedorAProveedorDTO(proveedorGuardado);
    }

    @Override
    public ProveedorDTO actualizarProveedor(ProveedorUpdateDTO proveedorUpdateDTO) {
        Proveedor proveedor = ProveedorMapper.INSTANCIA.proveedorUpdateDTOAProveedor(proveedorUpdateDTO);
        Proveedor proveedorActualizado = proveedorRepository.save(proveedor);
        return ProveedorMapper.INSTANCIA.proveedorAProveedorDTO(proveedorActualizado);
    }

    @Override
    public ProveedorDTO eliminarProveedor(long id) {
        Optional<Proveedor> proveedorOptional = proveedorRepository.findById(id);
        if (proveedorOptional.isPresent()) {
            Proveedor proveedor = proveedorOptional.get();
            proveedor.setEstado(estadoEliminado);
            proveedorRepository.save(proveedor);
            ProveedorDTO proveedorDTO = ProveedorMapper.INSTANCIA.proveedorAProveedorDTO(proveedor);
            return proveedorDTO;
        } else {
            throw new NoSuchElementException("No se pudo realizar la eliminación para el ID proporcionado");
        }
    }
}
