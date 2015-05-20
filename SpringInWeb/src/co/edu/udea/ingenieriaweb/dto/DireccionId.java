package co.edu.udea.ingenieriaweb.dto;

import java.io.Serializable;

public class DireccionId implements Serializable {

	private Integer codigo;
	private String cliente;

	public Integer getCodigo() {
		return codigo;
	}
	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}
	public String getCliente() {
		return cliente;
	}
	public void setCliente(String cliente) {
		this.cliente = cliente;
	}	
	
	
}
