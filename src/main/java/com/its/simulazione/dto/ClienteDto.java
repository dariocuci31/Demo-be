package com.its.simulazione.dto;

import lombok.*;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Component
public class ClienteDto {

    private int id_cliente;

    private String nome;

    private String cognome;

    private String email;

    private String telefono;
}
