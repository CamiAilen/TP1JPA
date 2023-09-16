package com.utn.tp1jpa.repositorios;

import com.utn.tp1jpa.entidades.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepositorio extends JpaRepository<Producto, Long> {
}
