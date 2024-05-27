package com.its.simulazione.repository;

import com.its.simulazione.entity.SegnalazioneEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface SegnalazioneRepository extends JpaRepository<SegnalazioneEntity,Integer> {

    List<SegnalazioneEntity> findByDataOra (LocalDate dataOra);
}
