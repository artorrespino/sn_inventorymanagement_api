package com.cibertec.inventorymanagementapi.repository;

import com.cibertec.inventorymanagementapi.model.Proveedor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProveedorRepository extends JpaRepository<Proveedor, Long> {
}
