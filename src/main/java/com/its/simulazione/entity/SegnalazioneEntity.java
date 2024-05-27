package com.its.simulazione.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.Cascade;

import java.time.LocalDate;

@Entity
@Table(name="segnalazione")
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SegnalazioneEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_segnalazione;

    @JsonFormat(pattern = "dd-MM-yyyy")
    @Column(name = "data_ora")
    private LocalDate dataOra;

    @ManyToOne
    @Cascade(org.hibernate.annotations.CascadeType.ALL)
    @JoinColumn(name = "id_cliente", nullable = false)
    private ClienteEntity clienteEntity;

    @ManyToOne
    @Cascade(org.hibernate.annotations.CascadeType.ALL)
    @JoinColumn(name = "id_tecnico", nullable = false)
    private TecnicoEntity tecnicoEntity;

}
