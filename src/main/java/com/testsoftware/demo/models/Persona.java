package com.testsoftware.demo.models;

import javax.persistence.*;
import javax.validation.constraints.*;

@Entity
@Table(name = "personas")

public class Persona {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(unique = true, nullable = false)
	private Long id;

	@NotEmpty(message = "El nombre es obligatorio.")
	private String nombre;

	@NotNull(message = "El apellido paterno es obligatorio.")
	private String apellidoPaterno;

	private String apellidoMaterno;

	@NotNull(message = "El campo identificación es obligatorio.")
	private String identificacion;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidoPaterno() {
		return apellidoPaterno;
	}

	public void setApellidoPaterno(String apellidoPaterno) {
		this.apellidoPaterno = apellidoPaterno;
	}

	public String getApellidoMaterno() {
		return apellidoMaterno;
	}

	public void setApellidoMaterno(String apellidoMaterno) {
		this.apellidoMaterno = apellidoMaterno;
	}

	public String getIdentificacion() {
		return identificacion;
	}

	public void setIdentificacion(String identificacion) {
		this.identificacion = identificacion;
	}
}