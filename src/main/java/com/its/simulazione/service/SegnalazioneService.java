package com.its.simulazione.service;

import com.its.simulazione.dto.SegnalazioneDto;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

public interface SegnalazioneService {

    List<SegnalazioneDto> getFilteredSegnalazione(LocalDate date);

    SegnalazioneDto createSegnalazione(SegnalazioneDto segnalazioneDto);

    boolean deleteSegnalazione(int id);
}