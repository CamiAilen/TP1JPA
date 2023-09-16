package com.utn.tp1jpa.repositorios;

import com.utn.tp1jpa.entidades.Domicilio;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DomicilioRepositorio extends JpaRepository<Domicilio, Long> {
}
