package com.cibertec.inventorymanagementapi.controller;

import com.cibertec.inventorymanagementapi.dtos.CategoriaProductoCreateDTO;
import com.cibertec.inventorymanagementapi.dtos.CategoriaProductoDTO;
import com.cibertec.inventorymanagementapi.dtos.CategoriaProductoUpdateDTO;
import com.cibertec.inventorymanagementapi.service.CategoriaProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/categorias")
@CrossOrigin(origins = "http://localhost:4200")
public class CategoriaProductoController {

    @Autowired
    private CategoriaProductoService categoriaProductoService;

    @GetMapping()
    public ResponseEntity<List<CategoriaProductoDTO>> listarCategoriasProductos(){
        return new ResponseEntity<>(categoriaProductoService.listarCategoriasProducto(), HttpStatus.OK);
    }

    @GetMapping("/{categoriaId}")
    public ResponseEntity<CategoriaProductoDTO> obtenerCategoriaProductoPorId(@PathVariable("categoriaId") long categoriaId){
        return new ResponseEntity<>(categoriaProductoService.obtenerCategoriaProductoPorID(categoriaId), HttpStatus.OK);
    }

    @PostMapping()
    public ResponseEntity<CategoriaProductoDTO> registrarCategoriaProducto(@RequestBody CategoriaProductoCreateDTO categoriaProductoCreateDTO){
        return new ResponseEntity<>(categoriaProductoService.registrarCategoriaProducto(categoriaProductoCreateDTO), HttpStatus.OK);
    }

    @PutMapping()
    public ResponseEntity<CategoriaProductoDTO> actualizarCategoriaProducto(@RequestBody CategoriaProductoUpdateDTO categoriaProductoUpdateDTO){
        return new ResponseEntity<>(categoriaProductoService.actualizarCategoriaProducto(categoriaProductoUpdateDTO), HttpStatus.OK);
    }

    @DeleteMapping("/{categoriaId}")
    public ResponseEntity<String> eliminarCategoriaProducto(@PathVariable("categoriaId") long categoriaId){
        return new ResponseEntity<>(categoriaProductoService.eliminarCategoriaProducto(categoriaId), HttpStatus.OK);
    }
}
