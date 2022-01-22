/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.arquitectura.examen.service;

import ec.edu.espe.arquitectura.examen.dao.CursoRepository;
import ec.edu.espe.arquitectura.examen.model.Curso;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author Windows Boo
 */
@Service
public class CursoService {

    final private CursoRepository cursoRepository;

    public CursoService(CursoRepository cursoRepository) {
        this.cursoRepository = cursoRepository;
    }

    public List<Curso> obtenerCursoPorArea(String area) {
        List<Curso> cursos = this.cursoRepository.findByArea(area);
        if (cursos == null) {
            throw new IllegalArgumentException("Cursos no encontrados para el Area.");
        }
        return cursos;
    }
    
    public List<Curso> obtenerCursoPorNombre(String nombre) {
        List<Curso> cursos = this.cursoRepository.findByNombreLike(nombre);
        if (cursos == null) {
            throw new IllegalArgumentException("Cursos no encontrados con el nombre.");
        }
        return cursos;
    } 
}
