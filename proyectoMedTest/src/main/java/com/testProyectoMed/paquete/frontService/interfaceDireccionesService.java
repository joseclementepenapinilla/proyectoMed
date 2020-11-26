package com.testProyectoMed.paquete.frontService;
import java.util.*;
import com.testProyectoMed.paquete.model.*;

public interface interfaceDireccionesService {

	public List<direcciones>consultar();
	public int guardar(direcciones d);
	public void eliminar(int IdDireccion);
	public Optional<direcciones>consultarDireccion(int IdDireccion);
}
