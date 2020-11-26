package com.testProyectoMed.paquete.view;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.testProyectoMed.paquete.model.*;

@Repository
public interface interfaceDirecciones extends CrudRepository<direcciones, Integer > {

	
}
