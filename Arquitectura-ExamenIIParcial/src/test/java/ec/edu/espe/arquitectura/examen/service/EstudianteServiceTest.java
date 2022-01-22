/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.arquitectura.examen.service;

import ec.edu.espe.arquitectura.examen.Data;
import ec.edu.espe.arquitectura.examen.dao.EstudianteRepository;
import ec.edu.espe.arquitectura.examen.model.Estudiante;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import static org.mockito.Mockito.*;

/**
 *
 * @author Windows Boo
 */
@SpringBootTest
public class EstudianteServiceTest {
    
    @MockBean
    private EstudianteRepository estudianteRepository;

    @Autowired
    private EstudianteService estudianteService;

    @Test
    public void testCrearEstudiante() {
        when(estudianteRepository.save(Data.ESTUDIANTE_001)).thenReturn(Data.ESTUDIANTE_001);
        Estudiante response = estudianteService.crearEstudiante(Data.ESTUDIANTE_001);
        assertEquals(Data.ESTUDIANTE_001, response);
    }
    
    
    
}
