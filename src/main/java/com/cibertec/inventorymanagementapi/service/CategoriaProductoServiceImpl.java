package com.cibertec.inventorymanagementapi.service;

import com.cibertec.inventorymanagementapi.dtos.CategoriaProductoCreateDTO;
import com.cibertec.inventorymanagementapi.dtos.CategoriaProductoDTO;
import com.cibertec.inventorymanagementapi.dtos.CategoriaProductoUpdateDTO;
import com.cibertec.inventorymanagementapi.mappers.CategoriaProductoMapper;
import com.cibertec.inventorymanagementapi.model.CategoriaProducto;
import com.cibertec.inventorymanagementapi.repository.CategoriaProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@Service
public class CategoriaProductoServiceImpl implements CategoriaProductoService {

    @Autowired
    private CategoriaProductoRepository categoriaProductoRepository;

    @Override
    public List<CategoriaProductoDTO> listarCategoriasProducto() {
        return CategoriaProductoMapper.INSTANCIA.listaCategoriaProductoAListaCategoriaProductoDTO(categoriaProductoRepository.findAll());
    }

    @Override
    public CategoriaProductoDTO obtenerCategoriaProductoPorID(long id) {
        return categoriaProductoRepository.findById(id)
                .map(CategoriaProductoMapper.INSTANCIA::categoriaProductoACategoriaProductoDTO)
                .orElse(null);
    }

    @Override
    public CategoriaProductoDTO registrarCategoriaProducto(CategoriaProductoCreateDTO categoriaProductoCreateDTO) {
        CategoriaProducto categoriaProducto = CategoriaProductoMapper.INSTANCIA.categoriaProductoCreateDTOACategoriaProducto(categoriaProductoCreateDTO);
        CategoriaProducto respuestaEntity = categoriaProductoRepository.save(categoriaProducto);
        return CategoriaProductoMapper.INSTANCIA.categoriaProductoACategoriaProductoDTO(respuestaEntity);
    }

    @Override
    public CategoriaProductoDTO actualizarCategoriaProducto(CategoriaProductoUpdateDTO categoriaProductoUpdateDTO) {
        CategoriaProducto categoriaProducto = CategoriaProductoMapper.INSTANCIA.categoriaProductoUpdateDTOACategoriaProducto(categoriaProductoUpdateDTO);
        CategoriaProducto respuestaEntity = categoriaProductoRepository.save(categoriaProducto);
        return CategoriaProductoMapper.INSTANCIA.categoriaProductoACategoriaProductoDTO(respuestaEntity);
    }

    @Override
    public String eliminarCategoriaProducto(long id) {
        Optional<CategoriaProducto> categoriaProductoOptional = categoriaProductoRepository.findById(id);
        categoriaProductoOptional.ifPresentOrElse(
                categoriaProducto -> categoriaProductoRepository.deleteById(id),
                () -> {
                    throw new NoSuchElementException("No se encontró la categoría de producto con id = " + id);
                }
        );
        return "Categoría de producto eliminada";
    }
}
