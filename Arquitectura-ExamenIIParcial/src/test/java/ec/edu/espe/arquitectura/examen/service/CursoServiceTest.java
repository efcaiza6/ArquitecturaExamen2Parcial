/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.arquitectura.examen.service;

import ec.edu.espe.arquitectura.examen.Data;
import ec.edu.espe.arquitectura.examen.dao.CursoRepository;
import ec.edu.espe.arquitectura.examen.dao.EstudianteRepository;
import ec.edu.espe.arquitectura.examen.model.Curso;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import static org.mockito.Mockito.*;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;

/**
 *
 * @author Windows Boo
 */
@SpringBootTest
public class CursoServiceTest {

    @MockBean
    private CursoRepository cursoRepository;

    @Autowired
    private CursoService cursoService;
    
    private Curso curso;
    
    @BeforeEach
    public void SetUp() {
        MockitoAnnotations.initMocks(this);
        curso = new Curso();
        curso.setId("asdfghjk");
        curso.setCodigo("dfgh");
        curso.setArea("Ciencias");
        curso.setNombre("Quimica");
    }
    
    @Test
    public void testObtenerCursoPorArea() {
        List<Curso> listaCurso = new ArrayList<>();
        listaCurso.add(curso);
        List<Curso> response = cursoService.obtenerCursoPorArea(listaCurso.get(0).getArea());
        when(cursoRepository.findByArea("Ciencias")).thenReturn(listaCurso);
        assertNotNull(cursoService.obtenerCursoPorArea("Ciencias"));
    }

    @Test
    public void testObtenerCursoPorNombre() {
        List<Curso> listaCurso = new ArrayList<>();
        listaCurso.add(curso);
        List<Curso> response = cursoService.obtenerCursoPorNombre("Quimica");
        when(cursoRepository.findByNombreLike("Quimica")).thenReturn(listaCurso);
        assertEquals(listaCurso.get(0),response);
    }
    
}
