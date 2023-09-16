package com.utn.tp1jpa.entidades;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Pedido implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "estado")
    private String estado;
    @Column(name = "fecha")
    private Date fecha;
    @Column(name = "tipoEnvio")
    private String tipoEnvio;
    @Column(name = "total")
    private double total;
    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "idPedido")
    private Factura factura;
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER,  orphanRemoval = true)
    @JoinColumn(name = "idPedido")
    @Builder.Default
    private List<DetallePedido> detalles= new ArrayList<>();

}
