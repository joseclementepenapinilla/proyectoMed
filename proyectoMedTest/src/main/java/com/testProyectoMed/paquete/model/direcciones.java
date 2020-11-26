package com.testProyectoMed.paquete.model;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity 
@Table(name = "direcciones") 
public class direcciones {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private  int id_direccion;

	private  String pais;

	private String departamento;

	private String ciudad;

	private String direccion;

	private boolean estado;

	public direcciones(int id_direccion, String pais, String departamento, String ciudad, String direccion,
			boolean estado) {
		super();
		this.id_direccion = id_direccion;
		this.pais = pais;
		this.departamento = departamento;
		this.ciudad = ciudad;
		this.direccion = direccion;
		this.estado = estado;
	}

	public int getId_direccion() {
		return id_direccion;
	}

	public void setId_direccion(int id_direccion) {
		this.id_direccion = id_direccion;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}

	
	
	
	
}
