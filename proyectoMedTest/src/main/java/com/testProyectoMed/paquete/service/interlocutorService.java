package com.testProyectoMed.paquete.service;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.*;

import org.springframework.stereotype.Service;

import com.testProyectoMed.paquete.frontService.*;
import com.testProyectoMed.paquete.model.direcciones;
import com.testProyectoMed.paquete.model.interlocutores;
@Service
public class interlocutorService implements interfaceInterlocutoresService{

	@Autowired 
	private interfaceInterlocutoresService InterlocutorData;
	@Override
	public List<interlocutores> consultar() {
		// TODO Auto-generated method stub
		
		return (List<interlocutores>)InterlocutorData;
	}

	@Override
	public int guardar(interlocutores Il) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void eliminar(int id_interlocutor) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Optional<direcciones> consultarInterlocutor(int id_interlocutor) {
		// TODO Auto-generated method stub
		return null;
	}

	

}
