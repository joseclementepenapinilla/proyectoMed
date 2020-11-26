package com.testProyectoMed.paquete.service;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.Service;

import com.testProyectoMed.paquete.frontService.*;
import com.testProyectoMed.paquete.model.direcciones;
import com.testProyectoMed.paquete.model.interlocutores;
import com.testProyectoMed.paquete.view.interfaceInterlocutores;

@Service
public class interlocutorService implements interfaceInterlocutoresService{

	@Autowired 
	private interfaceInterlocutores InterlocutorData;

	@Override
	public List<interlocutores> consultar() {
		// TODO Auto-generated method stub
		 
		return (List<interlocutores>)InterlocutorData.findAll();
	}


	@Override
	public int guardar(interlocutores inter) {
		int r = 0;
		interlocutores i= InterlocutorData.save(inter);
		if(i.equals(null)) {
			r = 1;
		}
		return r;
	}



	@Override
	public void eliminar(int id_interlocutor) {
		InterlocutorData.deleteById(id_interlocutor);		
	}

	@Override
	public Optional<interlocutores> consultarInterlocutor(int id_interlocutor) {		
		return InterlocutorData.findById(id_interlocutor);
	}

	

}
