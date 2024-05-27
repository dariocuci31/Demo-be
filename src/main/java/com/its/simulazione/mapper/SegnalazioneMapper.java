package com.its.simulazione.mapper;

import com.its.simulazione.dto.SegnalazioneDto;
import com.its.simulazione.entity.SegnalazioneEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class SegnalazioneMapper {

    @Autowired
    ClienteMapper clienteMapper;

    @Autowired
    TecnicoMapper tecnicoMapper;

    public SegnalazioneEntity toEntity(SegnalazioneDto dto) {
        return SegnalazioneEntity.builder()
                .id_segnalazione(dto.getId_segnalazione())
                .clienteEntity(clienteMapper.toEntity(dto.getClienteDto()))
                .tecnicoEntity(tecnicoMapper.toEntity(dto.getTecnicoDto()))
                .dataOra(dto.getDataOra())
                .build();
    }

    public SegnalazioneDto toDto(SegnalazioneEntity entity) {
        return SegnalazioneDto.builder()
                .id_segnalazione(entity.getId_segnalazione())
                .clienteDto(clienteMapper.toDto(entity.getClienteEntity()))
                .tecnicoDto(tecnicoMapper.toDto(entity.getTecnicoEntity()))
                .dataOra(entity.getDataOra())
                .build();
    }

    public List<SegnalazioneDto> toDtoList(List<SegnalazioneEntity> enititiesList) {
        return enititiesList.stream().map(this::toDto).toList();
    }
}
