package com.testProyectoMed.paquete.service;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.testProyectoMed.paquete.frontService.*;
import com.testProyectoMed.paquete.model.direcciones;
@Service
public class direccionService implements interfaceDireccionesService{

	@Override
	public List<direcciones> consultar() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int guardar(direcciones d) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void eliminar(int IdDireccion) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Optional<direcciones> consultarDireccion(int IdDireccion) {
		// TODO Auto-generated method stub
		return null;
	}

	
	
}
