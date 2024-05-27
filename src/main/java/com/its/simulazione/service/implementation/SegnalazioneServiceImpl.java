package com.its.simulazione.service.implementation;

import com.its.simulazione.dto.SegnalazioneDto;
import com.its.simulazione.entity.SegnalazioneEntity;
import com.its.simulazione.mapper.SegnalazioneMapper;
import com.its.simulazione.repository.SegnalazioneRepository;
import com.its.simulazione.service.SegnalazioneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class SegnalazioneServiceImpl implements SegnalazioneService {

    @Autowired
    SegnalazioneRepository repository;

    @Autowired
    SegnalazioneMapper mapper;

    @Override
    public SegnalazioneDto createSegnalazione(SegnalazioneDto segnalazioneDto) {
        segnalazioneDto.setDataOra(LocalDate.now());
        SegnalazioneEntity entity = repository.save(mapper.toEntity(segnalazioneDto));
        return mapper.toDto(entity);
    }

    @Override
    public boolean deleteSegnalazione(int id) {
        repository.deleteById(id);
        return true;
    }

    @Override
    public List<SegnalazioneDto> getFilteredSegnalazione(LocalDate date) {
        List<SegnalazioneDto> list = new ArrayList<>();
        if (date != null)
            list = mapper.toDtoList(repository.findByDataOra(date));
        else
            list = mapper.toDtoList(repository.findAll());
        return list;
    }
}
