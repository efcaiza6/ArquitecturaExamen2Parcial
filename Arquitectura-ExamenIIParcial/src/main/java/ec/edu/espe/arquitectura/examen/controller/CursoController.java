/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.arquitectura.examen.controller;

import ec.edu.espe.arquitectura.examen.model.Curso;
import ec.edu.espe.arquitectura.examen.service.CursoService;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Windows Boo
 */
@RestController
@RequestMapping("/v1/curso")
@Slf4j
public class CursoController {

    private final CursoService cursoService;

    public CursoController(CursoService cursoService) {
        this.cursoService = cursoService;
    }

    @GetMapping(value = "area/{area}")
    public ResponseEntity obtenerCursoPorArea(@PathVariable("area") String area) {
        try {
            List<Curso> cursos = this.cursoService.obtenerCursoPorArea(area);
            return ResponseEntity.ok(cursos);
        } catch (Exception e) {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping(value = "nombre/{nombre}")
    public ResponseEntity obtenerCursoPorNombre(@PathVariable("nombre") String nombre) {
        try {
            List<Curso> cursos = this.cursoService.obtenerCursoPorNombre(nombre);
            return ResponseEntity.ok(cursos);
        } catch (Exception e) {
            return ResponseEntity.notFound().build();
        }
    }
}
