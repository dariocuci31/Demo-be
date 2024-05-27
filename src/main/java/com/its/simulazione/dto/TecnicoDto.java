package com.its.simulazione.dto;

import lombok.*;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Component
public class TecnicoDto {

    private int id_tecnico;

    private String nome;

    private String cognome;

    private String email;

    private String telefono;

    private String specializzazione;

    private LocalDate data_assunzione;
}

