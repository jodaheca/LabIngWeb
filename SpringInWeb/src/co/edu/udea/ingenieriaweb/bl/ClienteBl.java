package co.edu.udea.ingenieriaweb.bl;

import co.edu.udea.ingenieriaweb.dto.Cliente;
import co.edu.udea.ingenieriaweb.exception.MyException;

public interface ClienteBl {
 public void GuardarCliente(String cedula, String nombres,String 
		 apellidos,String email,String usuarioCrea) throws MyException;
}
