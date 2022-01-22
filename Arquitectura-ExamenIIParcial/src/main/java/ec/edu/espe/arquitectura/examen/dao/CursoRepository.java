/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.arquitectura.examen.dao;

import ec.edu.espe.arquitectura.examen.model.Curso;
import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author Windows Boo
 */
public interface CursoRepository extends MongoRepository<Curso, String> {

    List<Curso> findByArea(String area);

    List<Curso> findByNombreLike(String nombre);
}
