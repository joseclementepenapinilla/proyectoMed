package com.testProyectoMed.paquete.view;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.testProyectoMed.paquete.model.*;

@Repository
public interface interfaceInterlocutores  extends CrudRepository<interlocutores, Integer > {

}
 
