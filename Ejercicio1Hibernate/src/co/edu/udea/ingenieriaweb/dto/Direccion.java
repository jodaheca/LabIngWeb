package co.edu.udea.ingenieriaweb.dto;

import java.io.Serializable;

public class Direccion implements Serializable{
	
	private DireccionId direccionId;
	private String direccion;
	private String telefono;
	private Integer ciudad;
	private Integer preferida;
	
	
	
	public Integer getPreferida() {
		return preferida;
	}
	public void setPreferida(Integer preferida) {
		this.preferida = preferida;
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
	public Integer getCiudad() {
		return ciudad;
	}
	public void setCiudad(Integer ciudad) {
		this.ciudad = ciudad;
	}

	
}