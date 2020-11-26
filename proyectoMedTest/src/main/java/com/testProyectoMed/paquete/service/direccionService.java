package com.testProyectoMed.paquete.service;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.testProyectoMed.paquete.frontService.*;
import com.testProyectoMed.paquete.model.direcciones;
import com.testProyectoMed.paquete.view.interfaceDirecciones;

@Service
public class direccionService implements interfaceDireccionesService{

	@Autowired 
	private interfaceDirecciones DireccionesData;
	
	@Override
	public List<direcciones> consultar() {
		// TODO Auto-generated method stub
		
		return (List<direcciones>)DireccionesData.findAll();
	}

	@Override
	public int guardar(direcciones d) {
		int r = 0;
		direcciones dir= DireccionesData.save(d);
		if(dir.equals(null)) {
			r = 1;
		}
		return r;
	}

	@Override
	public void eliminar(int IdDireccion) {
		DireccionesData.deleteById(IdDireccion);
	}

	@Override
	public Optional<direcciones> consultarDireccion(int IdDireccion) {
		
		return DireccionesData.findById(IdDireccion);
	}

	
	
}
