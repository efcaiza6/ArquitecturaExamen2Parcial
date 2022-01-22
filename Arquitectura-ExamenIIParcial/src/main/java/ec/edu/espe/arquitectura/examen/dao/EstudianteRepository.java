/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.arquitectura.examen.dao;

import ec.edu.espe.arquitectura.examen.model.Estudiante;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author Windows Boo
 */
public interface EstudianteRepository extends MongoRepository<Estudiante,String>{
    Boolean existsBycorreoElectronico(String correo);
}
