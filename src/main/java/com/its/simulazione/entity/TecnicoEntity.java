package com.its.simulazione.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Table(name="tecnico")
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TecnicoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_tecnico;

    private String nome;

    private String cognome;

    private String email;

    private String telefono;

    private String specializzazione;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDate data_assunzione;
}
