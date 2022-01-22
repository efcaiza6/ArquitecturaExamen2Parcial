/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.arquitectura.examen.service;

import ec.edu.espe.arquitectura.examen.dao.EstudianteRepository;
import ec.edu.espe.arquitectura.examen.model.Estudiante;
import org.springframework.stereotype.Service;

/**
 *
 * @author Windows Boo
 */
@Service
public class EstudianteService {

    private final EstudianteRepository estudianteRepository;

    public EstudianteService(EstudianteRepository estudianteRepository) {
        this.estudianteRepository = estudianteRepository;
    }

    public Estudiante crearEstudiante(Estudiante estudiante) {

        if (estudianteRepository.existsBycorreoElectronico(estudiante.getCorreoElectronico())) {
            throw new IllegalArgumentException("El correo electronico ya existe. No se puede registrar");
        } else {
            return this.estudianteRepository.save(estudiante);
        }
    }
    
    
}
