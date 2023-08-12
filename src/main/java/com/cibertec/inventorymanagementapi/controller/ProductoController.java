package com.cibertec.inventorymanagementapi.controller;

import com.cibertec.inventorymanagementapi.dtos.ProductoCreateDTO;
import com.cibertec.inventorymanagementapi.dtos.ProductoDTO;
import com.cibertec.inventorymanagementapi.dtos.ProductoUpdateDTO;
import com.cibertec.inventorymanagementapi.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/productos")
@CrossOrigin(origins = "http://localhost:4200")
public class ProductoController {

    @Autowired
    private ProductoService productoService;

    @GetMapping()
    public ResponseEntity<List<ProductoDTO>> listarProductos() {
        return new ResponseEntity<>(productoService.listarProductos(), HttpStatus.OK);
    }

    @GetMapping("/{productoId}")
    public ResponseEntity<ProductoDTO> obtenerProductoPorId(@PathVariable("productoId") long productoId) {
        return new ResponseEntity<>(productoService.obtenerProductoPorID(productoId), HttpStatus.OK);
    }

    @PostMapping()
    public ResponseEntity<ProductoDTO> registrarProducto(@RequestBody ProductoCreateDTO productoCreateDTO) {
        return new ResponseEntity<>(productoService.registrarProducto(productoCreateDTO), HttpStatus.OK);
    }

    @PutMapping()
    public ResponseEntity<ProductoDTO> actualizarProducto(@RequestBody ProductoUpdateDTO productoUpdateDTO) {
        return new ResponseEntity<>(productoService.actualizarProducto(productoUpdateDTO), HttpStatus.OK);
    }

    @DeleteMapping("/{productoId}")
    public ResponseEntity<ProductoDTO> eliminarProducto(@PathVariable("productoId") long productoId) {
        return new ResponseEntity<>(productoService.eliminarProducto(productoId), HttpStatus.OK);
    }
}
