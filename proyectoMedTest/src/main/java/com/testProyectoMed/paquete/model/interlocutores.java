package com.testProyectoMed.paquete.model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity 
@Table(name = "interlocutores") 
public class interlocutores {

public interlocutores() {
	// TODO Auto-generated constructor stub
}
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id_interlocutor;

public int getId_interlocutor() {
	return id_interlocutor;
}

public void setId_interlocutor(int id_interlocutor) {
	this.id_interlocutor = id_interlocutor;
}
private int tipo_interlocutor;

private int id_externo;

private String tipo_identificacion;

private int identificacion;

private  String nombre1;

private String nombre2;

private  String apellido1;

private  String apellido2;

private  String comentarios;

private  String fecha_creacion;

private  boolean estado;

private  int direccion_id;




public interlocutores(int id_interlocutor, int tipo_interlocutor, int id_externo, String tipo_identificacion,
		int identificacion, String nombre1, String nombre2, String apellido1, String apellido2, String comentarios,
		String fecha_creacion, boolean estado, int direccion_id) {
	super();
	this.id_interlocutor = id_interlocutor;
	this.tipo_interlocutor = tipo_interlocutor;
	this.id_externo = id_externo;
	this.tipo_identificacion = tipo_identificacion;
	this.identificacion = identificacion;
	this.nombre1 = nombre1;
	this.nombre2 = nombre2;
	this.apellido1 = apellido1;
	this.apellido2 = apellido2;
	this.comentarios = comentarios;
	this.fecha_creacion = fecha_creacion;
	this.estado = estado;
	this.direccion_id = direccion_id;
}

public int getTipo_interlocutor() {
	return tipo_interlocutor;
}

public void setTipo_interlocutor(int tipo_interlocutor) {
	this.tipo_interlocutor = tipo_interlocutor;
}

public int getId_externo() {
	return id_externo;
}

public void setId_externo(int id_externo) {
	this.id_externo = id_externo;
}

public String getTipo_identificacion() {
	return tipo_identificacion;
}

public void setTipo_identificacion(String tipo_identificacion) {
	this.tipo_identificacion = tipo_identificacion;
}

public int getIdentificacion() {
	return identificacion;
}

public void setIdentificacion(int identificacion) {
	this.identificacion = identificacion;
}

public String getNombre1() {
	return nombre1;
}

public void setNombre1(String nombre1) {
	this.nombre1 = nombre1;
}

public String getNombre2() {
	return nombre2;
}

public void setNombre2(String nombre2) {
	this.nombre2 = nombre2;
}

public String getApellido1() {
	return apellido1;
}

public void setApellido1(String apellido1) {
	this.apellido1 = apellido1;
}

public String getApellido2() {
	return apellido2;
}

public void setApellido2(String apellido2) {
	this.apellido2 = apellido2;
}

public String getComentarios() {
	return comentarios;
}

public void setComentarios(String comentarios) {
	this.comentarios = comentarios;
}

public String getFecha_creacion() {
	return fecha_creacion;
}

public void setFecha_creacion(String fecha_creacion) {
	this.fecha_creacion = fecha_creacion;
}

public boolean isEstado() {
	return estado;
}

public void setEstado(boolean estado) {
	this.estado = estado;
}

public int getDireccion_id() {
	return direccion_id;
}

public void setDireccion_id(int direccion_id) {
	this.direccion_id = direccion_id;
}





}