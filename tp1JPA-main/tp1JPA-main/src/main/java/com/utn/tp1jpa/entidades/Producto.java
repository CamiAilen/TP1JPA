package com.utn.tp1jpa.entidades;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Producto implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "tipo")
    private String tipo;
    @Column(name = "tiempoEstimadoDeCocina")
    private int tiempoEstimadoDeCocina;
    @Column(name = "denominacion")
    private String denominacion;
    @Column(name = "precioVenta")
    private double precioVenta;
    @Column(name = "precioCompra")
    private double precioCompra;
    @Column(name = "stockActual")
    private int stockActual;
    @Column(name = "stockMinimo")
    private int stockMinimo;
    @Column(name = "unidadMedida")
    private String unidadMedida;
    @Column(name = "receta")
    private String receta;
}
