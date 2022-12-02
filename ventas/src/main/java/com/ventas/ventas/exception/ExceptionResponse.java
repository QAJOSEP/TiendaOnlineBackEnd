package com.ventas.ventas.exception;

import java.util.Date;

public class ExceptionResponse {

	private Date timestamp;
	private String mensaje;
	private String detalles;
	
		
	public ExceptionResponse(Date timestamp, String mensaje, String detalles) {
		super();
		this.timestamp = timestamp;
		this.mensaje = mensaje;
		this.detalles = detalles;
	}
	
	public Date getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}
	public String getMensaje() {
		return mensaje;
	}
	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
	public String getDetalles() {
		return detalles;
	}
	public void setDetalles(String detalles) {
		this.detalles = detalles;
	}
	
	 
}
