package com.testProyectoMed.paquete.control;

import java.util.List;

import javax.validation.Valid;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.testProyectoMed.paquete.frontService.*;
import com.testProyectoMed.paquete.model.*;

@Controller
@RequestMapping
public class controlIndex {
	
	@Autowired
	private interfaceDireccionesService direccionService;

	@GetMapping("/consultarDirecciones")
	public String consultarDir(Model modelo) {
		List<direcciones>Direcciones = direccionService.consultar();
		System.out.print(Direcciones); 
		
		modelo.addAttribute("direcciones", Direcciones );
		return "direcciones";
		
	}
	
	@Autowired
	private interfaceInterlocutoresService InterlocutorService;

	@GetMapping("/consultarnterlocutores")
	public String consultarInt(Model modelo) {
				
		List<interlocutores>Inerlocutores = InterlocutorService.consultar();
		modelo.addAttribute("interlocutores", Inerlocutores );
		return "interlocutores";
		
	}
	
	/**
	 * Registrar
	 */
	@GetMapping("/registrarDir")
	public String registrarDir(Model m) {

		m.addAttribute("direccion",new direcciones());
		return "registroDir";
	}
	
	@GetMapping("/registrarInter")
	public String registrarInter(Model m) {
		List<direcciones>Direcciones = direccionService.consultar();
		m.addAttribute("direcciones", Direcciones );
		m.addAttribute("interlocutor",new interlocutores());
		return "registroInter";
	}
	
	@PostMapping("/guardarDir")
	public String persGuardarDir(@Valid direcciones d,Model m) {
		direccionService.guardar(d);
		return "redirect:/consultarDirecciones";
	}

	@PostMapping("/guardarInter")
	public String persGuardarInter(@Valid interlocutores inter,Model m) {
		InterlocutorService.guardar(inter);
		return "redirect:/consultarnterlocutores";
	}
	
	/**
	 *Actualiza un egistro por id, de la entidad segun  indique @param proceso. 
	 * @param proceso
	 * @param id
	 * @param m
	 * @return
	 */
	@GetMapping("/actualizar/{proceso}/{id}")
	public String actualizarDir(@PathVariable String proceso, @PathVariable int id, Model m) {
		String retorno ="";
		switch(proceso)
		{
		   case "direccion" :
				Optional<direcciones> direccion = 	direccionService.consultarDireccion(id);
				m.addAttribute("direccion" ,direccion);
				retorno = "registroDir";
			   break; 		   
		   case "inter" :
				Optional<interlocutores> interlocutor = InterlocutorService.consultarInterlocutor(id);
				m.addAttribute("interlocutor" ,interlocutor);
				retorno = "registroInter";
		      break; 
		   default : 
			   	retorno ="redirect:/";
		}
		
		return retorno;
		
	}
	/**
	 * Alimina un registro, de la entidad que indique @param proceso, entre "direccion" ó "inter"[interlocutor]
	 * @param proceso
	 * @param id
	 * @param m
	 * @return
	 */
	@GetMapping("/eliminar/{proceso}/{id}")
	public String eliminar(@PathVariable String proceso, @PathVariable int id,Model m) {
		String retorno ="redirect:/";
		switch(proceso)
		{
		   case "direccion" :
			   direccionService.eliminar(id);
			   retorno ="redirect:/consultarDirecciones";
			   break; 		   
		   case "inter" :
			   InterlocutorService.eliminar(id);
			   retorno ="redirect:/consultarnterlocutores";
		      break; 
		   default : 
			   	retorno ="redirect:/";
		}
		
		return retorno;
	}
	


	
}
