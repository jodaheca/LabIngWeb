package co.edu.udea.ingenieriaweb.dto;


/**
 * 
 *  @author Joaquin David Hernandez Cardenas <jdavidhc94@gmail.com>
 * DTO de la tabla Direcciones en la Base de datos
 *
 */
public class Direccion {
	
	private DireccionId direccionId ;
	private String direccion;
	private String telefono;
	private Integer ciudad;
	private Integer preferida;
	
	
	
	
	public DireccionId getDireccionId() {
		return direccionId;
	}
	public void setDireccionId(DireccionId direccionId) {
		this.direccionId = direccionId;
	}
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
