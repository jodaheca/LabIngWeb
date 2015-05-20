package co.edu.udea.ingenieriaweb.dao;

import co.edu.udea.ingenieriaweb.dto.Cliente;
import co.edu.udea.ingenieriaweb.exception.MyException;

/**
 * 
 * @author Joaquin David Hernandez C <jdavidhc94@gmail.com>
 * Interfaces que contienelos metodo que permiten hacer operaciones de el DTO Cliente en la DB
 *
 */
public interface ClienteDAO {
	
	public void guardarCliente(Cliente cliente ) throws MyException ;

}
