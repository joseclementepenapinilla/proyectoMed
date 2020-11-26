package com.testProyectoMed.paquete.control;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.testProyectoMed.paquete.frontService.*;
import com.testProyectoMed.paquete.model.*;

@RequestMapping
@Controller
public class controlIndex {

	@Autowired
	private interfaceInterlocutoresService InterlocutorService;

	@GetMapping("/consultarnterlocutores")
	public String consultar(Model modelo) {
		List<interlocutores>Inerlocutores = InterlocutorService.consultar();
		modelo.addAttribute("interlocutores", Inerlocutores );
		return "index";
		
	}

	@Autowired
	private interfaceDireccionesService direccionService;

	@GetMapping("/consultarDirecciones")
	public String consultarDir(Model modelo) {
		List<direcciones>Direcciones = direccionService.consultar();
		modelo.addAttribute("direcciones", Direcciones );
		return "direcciones";
		
	}
	
}
