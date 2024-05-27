package com.its.simulazione.controller;

import com.its.simulazione.dto.SegnalazioneDto;
import com.its.simulazione.service.SegnalazioneService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/segnalazioni")
public class SegnalazioneController {

    @Autowired
    SegnalazioneService service;

    @Operation(summary = "Crea una nuova segnalazione")
    @ApiResponses(value = {@ApiResponse(responseCode = "201", description = "segnalazione creata con successo")})
    @PostMapping("/")
    public ResponseEntity<SegnalazioneDto> createSegnalazione(@RequestBody SegnalazioneDto dto){
        SegnalazioneDto entity = service.createSegnalazione(dto);
        return new ResponseEntity<>(entity, HttpStatus.CREATED);
    }
    @Operation(summary = "recupera l'elenco di tutte le segnalazioni")
    @ApiResponses(value = {@ApiResponse(responseCode = "200", description = "lista recuperata con successo")})
    @GetMapping("/")
    public ResponseEntity<List<SegnalazioneDto>> getSegnalazione(@RequestParam(required = false) LocalDate date){
      List<SegnalazioneDto> dtos = service.getFilteredSegnalazione(date);
      return new ResponseEntity<>(dtos, HttpStatus.OK);
    };

    @Operation(summary = "Elimina una segnalazione")
    @ApiResponses(value = {@ApiResponse(responseCode = "200", description = "segnalazione cancellata con successo")})
    @DeleteMapping("/{id}")
    public ResponseEntity<Boolean> deleteSegnalazione(@PathVariable int id){
        boolean value = service.deleteSegnalazione(id);
        return  new ResponseEntity<>(value, HttpStatus.OK);
    };
}
