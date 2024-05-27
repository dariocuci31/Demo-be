package com.its.simulazione.mapper;

import com.its.simulazione.dto.ClienteDto;
import com.its.simulazione.entity.ClienteEntity;
import org.springframework.stereotype.Component;

@Component
public class ClienteMapper {

    public ClienteEntity toEntity(ClienteDto dto){
        return ClienteEntity.builder()
                .id_cliente(dto.getId_cliente())
                .nome(dto.getNome())
                .cognome(dto.getCognome())
                .email(dto.getEmail())
                .telefono(dto.getTelefono())
                .build();
    }

    public ClienteDto toDto(ClienteEntity entity){
        return ClienteDto.builder()
                .id_cliente(entity.getId_cliente())
                .nome(entity.getNome())
                .cognome(entity.getCognome())
                .email(entity.getEmail())
                .telefono(entity.getTelefono())
                .build();
    }

}
