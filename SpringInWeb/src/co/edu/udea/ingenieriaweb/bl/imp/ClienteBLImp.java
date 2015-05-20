package co.edu.udea.ingenieriaweb.bl.imp;

import java.util.Date;

import co.edu.udea.ingenieriaweb.bl.ClienteBl;
import co.edu.udea.ingenieriaweb.dao.ClienteDAO;
import co.edu.udea.ingenieriaweb.dto.Cliente;
import co.edu.udea.ingenieriaweb.exception.MyException;

public class ClienteBLImp implements ClienteBl{
	
	ClienteDAO clienteDAO;
	

	public ClienteDAO getClienteDAO() {
		return clienteDAO;
	}



	public void setClienteDAO(ClienteDAO clienteDAO) {
		this.clienteDAO = clienteDAO;
	}



	@Override
	public void GuardarCliente(String cedula, String nombres, String apellidos,
			String email, String usuarioCrea) throws MyException {
		
		if(cedula==null|| "".equals(cedula)){
			throw new MyException("La cedula no puede ser vacia ni Nula");
		}
		/*Hacer todas las demas validaciones correspondientes a las reglas del necogio*/
		
		Cliente cliente = new Cliente();
		cliente.setCedula(cedula);
		cliente.setApellidos(apellidos);
		cliente.setNombres(nombres);
		cliente.setEmail(email);
		cliente.setUsuarioCrea(usuarioCrea);
		cliente.setFechaCreacion(new Date());
		
		
	}

}
