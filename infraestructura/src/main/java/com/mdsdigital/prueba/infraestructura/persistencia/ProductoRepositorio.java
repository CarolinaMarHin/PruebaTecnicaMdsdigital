package com.mdsdigital.prueba.infraestructura.persistencia;

import com.mdsdigital.prueba.dominio.modelo.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductoRepositorio extends JpaRepository<Producto, Long> {
}
