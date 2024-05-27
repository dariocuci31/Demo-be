package com.its.simulazione.repository;

import com.its.simulazione.entity.TecnicoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TecnicoRepository extends JpaRepository<TecnicoEntity,Integer> {
}
