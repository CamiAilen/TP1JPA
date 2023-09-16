package com.utn.tp1jpa.repositorios;

import com.utn.tp1jpa.entidades.DetallePedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DetallePedidoRepositorio extends JpaRepository<DetallePedido, Long> {
}
