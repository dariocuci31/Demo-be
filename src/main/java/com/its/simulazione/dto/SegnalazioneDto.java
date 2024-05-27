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
public class SegnalazioneDto {

    private int id_segnalazione;

    private LocalDate dataOra;

    private ClienteDto clienteDto;

    private TecnicoDto tecnicoDto;

}
