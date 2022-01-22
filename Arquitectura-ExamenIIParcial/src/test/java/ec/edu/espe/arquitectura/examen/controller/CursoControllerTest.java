/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.arquitectura.examen.controller;

import ec.edu.espe.arquitectura.examen.model.Curso;
import ec.edu.espe.arquitectura.examen.service.CursoService;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import static org.mockito.Mockito.*;
import org.mockito.MockitoAnnotations;

/**
 *
 * @author Windows Boo
 */
@SpringBootTest
public class CursoControllerTest {

    @Mock
    private CursoService cursoService;

    @InjectMocks
    private CursoController cursoController;

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
        when(cursoService.obtenerCursoPorArea("Ciencias")).thenReturn(listaCurso);
        assertNotNull(cursoController.obtenerCursoPorArea("Ciencias"));
    }

    @Test
    public void testObtenerCursoPorNombre() {
        List<Curso> listaCurso = new ArrayList<>();
        listaCurso.add(curso);
        when(cursoService.obtenerCursoPorNombre("Quimica")).thenReturn(listaCurso);
        assertNotNull(cursoController.obtenerCursoPorNombre("Quimica"));
    }

}
