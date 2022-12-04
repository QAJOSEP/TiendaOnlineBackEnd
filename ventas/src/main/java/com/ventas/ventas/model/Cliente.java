package com.ventas.ventas.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "cliente")
public class Cliente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idCliente;
	
	@NotNull(message = "No puede se puede dejar vacio")
	@NotBlank(message = "El nombre es obligatorio")
	@Size(min = 3, max =70, message = "Mínimo requiere tres caractéres")
	@Column(name = "nombres", nullable = false, length = 70)
	private String nombres;
	
	@NotNull
	@NotBlank(message = "El apellido es obligatorio")
	@Size(min = 3, max =150, message = "Mínimo requiere tres caractéres")
	@Column(name = "apellidos", nullable = false, length = 150)
	private String apellidos;
	
	@Size(max =150, message = "La dirección no debe superar los 150 caractéres")
	@Column(name = "direccion", nullable = true, length = 150)
	private String direccion;
	
	@Size(min = 8, message = "Debe tener al menos 8 dígitos")
	@Column(name = "telefono", nullable = true, length = 10)
	private String telefono;
	
	@NotNull
	@NotBlank(message = "El email es obligatorio")
	@Size(min = 10, max =150, message = "Mínimo requiere diez caractéres")
	@Email(message = "El email no tiene un formato valido")
	@Column(nullable = false, length = 150)
	private String email;
	

	public Integer getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(Integer idCliente) {
		this.idCliente = idCliente;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
