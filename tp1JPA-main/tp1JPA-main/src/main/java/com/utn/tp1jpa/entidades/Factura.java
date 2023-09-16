package com.utn.tp1jpa.entidades;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Factura implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column (name = "numero")
    private int numero;
    @Column (name = "fecha")
    private Date fecha;
    @Column (name = "descuento")
    private double descuento;
    @Column (name = "formaPago")
    private String formaPago;
    @Column (name = "total")
    private int total;

}
