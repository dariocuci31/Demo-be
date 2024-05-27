package com.its.simulazione.mapper;

import com.its.simulazione.dto.TecnicoDto;
import com.its.simulazione.entity.TecnicoEntity;
import org.springframework.stereotype.Component;


@Component
public class TecnicoMapper {

    public TecnicoEntity toEntity(TecnicoDto dto){
        return TecnicoEntity.builder()
                .id_tecnico(dto.getId_tecnico())
                .nome(dto.getNome())
                .cognome(dto.getCognome())
                .email(dto.getEmail())
                .telefono(dto.getTelefono())
                .specializzazione(dto.getSpecializzazione())
                .data_assunzione(dto.getData_assunzione())
                .build();
    }

    public TecnicoDto toDto(TecnicoEntity entity){
        return TecnicoDto.builder()
                .id_tecnico(entity.getId_tecnico())
                .nome(entity.getNome())
                .cognome(entity.getCognome())
                .email(entity.getEmail())
                .telefono(entity.getTelefono())
                .data_assunzione(entity.getData_assunzione())
                .specializzazione(entity.getSpecializzazione())
                .build();
    }
}
