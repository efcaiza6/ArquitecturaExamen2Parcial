/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.arquitectura.examen.model;

import java.util.Date;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 *
 * @author Windows Boo
 */
@Data
@Document(collection = "cursos")
public class Curso {

    @Id
    private String id;
    private String codigo;
    private String area;
    private String nombre;
    private String duracionHoras;
    private Date fechaInicio;
    private String costo;

   

    
    
}
