package com.cibertec.inventorymanagementapi.repository;

import com.cibertec.inventorymanagementapi.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductoRepository extends JpaRepository<Producto, Long> {
}
