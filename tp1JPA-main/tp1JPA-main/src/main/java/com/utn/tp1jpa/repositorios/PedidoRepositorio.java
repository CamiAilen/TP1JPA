package com.utn.tp1jpa.repositorios;

import com.utn.tp1jpa.entidades.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidoRepositorio extends JpaRepository<Pedido, Long> {
}
