/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.arquitectura.examen.controller;

import ec.edu.espe.arquitectura.examen.model.Estudiante;
import ec.edu.espe.arquitectura.examen.service.EstudianteService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Windows Boo
 */
@RestController
@RequestMapping("/v1/estudiante")
@Slf4j
public class EstudianteController {

    private final EstudianteService estudianteService;

    public EstudianteController(EstudianteService estudianteService) {
        this.estudianteService = estudianteService;
    }

    @PostMapping
    public ResponseEntity crearEstudiante(@RequestBody Estudiante estudiante) {
        try {
            log.info("Va a crear el estudiante con la siguiente informacion: {}", estudiante);
            this.estudianteService.crearEstudiante(estudiante);
            return ResponseEntity.ok().build();
        } catch (Exception e) {
            log.error("Ocurrio un error al crear el estudiante. {}"
                    + " - retorna badrequest", e.getMessage());
            return ResponseEntity.badRequest().build();
        }
    }
}
