package com.testProyectoMed.paquete.frontService;

import java.util.*;
import com.testProyectoMed.paquete.model.*;

public interface interfaceInterlocutoresService {


	public List<interlocutores>consultar();
	public int guardar(interlocutores Il);
	public void eliminar(int id_interlocutor);
	public Optional<interlocutores>consultarInterlocutor(int id_interlocutor);

 }





