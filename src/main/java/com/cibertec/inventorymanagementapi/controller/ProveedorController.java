package com.cibertec.inventorymanagementapi.controller;

import com.cibertec.inventorymanagementapi.dtos.ProveedorCreateDTO;
import com.cibertec.inventorymanagementapi.dtos.ProveedorDTO;
import com.cibertec.inventorymanagementapi.dtos.ProveedorUpdateDTO;
import com.cibertec.inventorymanagementapi.service.ProveedorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/proveedores")
@CrossOrigin(origins = "http://localhost:4200")
public class ProveedorController {

    @Autowired
    private ProveedorService proveedorService;

    @GetMapping()
    public ResponseEntity<List<ProveedorDTO>> listarProveedores() {
        return new ResponseEntity<>(proveedorService.listarProveedores(), HttpStatus.OK);
    }

    @GetMapping("/{proveedorId}")
    public ResponseEntity<ProveedorDTO> obtenerProveedorPorId(@PathVariable("proveedorId") long proveedorId) {
        return new ResponseEntity<>(proveedorService.obtenerProveedorPorID(proveedorId), HttpStatus.OK);
    }

    @PostMapping()
    public ResponseEntity<ProveedorDTO> registrarProveedor(@RequestBody ProveedorCreateDTO proveedorCreateDTO) {
        return new ResponseEntity<>(proveedorService.registrarProveedor(proveedorCreateDTO), HttpStatus.OK);
    }

    @PutMapping()
    public ResponseEntity<ProveedorDTO> actualizarProveedor(@RequestBody ProveedorUpdateDTO proveedorUpdateDTO) {
        return new ResponseEntity<>(proveedorService.actualizarProveedor(proveedorUpdateDTO), HttpStatus.OK);
    }

    @DeleteMapping("/{proveedorId}")
    public ResponseEntity<ProveedorDTO> eliminarProveedor(@PathVariable("proveedorId") long proveedorId) {
        return new ResponseEntity<>(proveedorService.eliminarProveedor(proveedorId), HttpStatus.OK);
    }
}
