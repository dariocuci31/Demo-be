package com.its.simulazione.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name="cliente")
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ClienteEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_cliente;

    private String nome;

    private String cognome;

    private String email;

    private String telefono;
}
