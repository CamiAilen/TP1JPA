package com.utn.tp1jpa.repositorios;

import com.utn.tp1jpa.entidades.Factura;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FacturaRepositorio extends JpaRepository<Factura, Long> {
}
