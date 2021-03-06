package co.edu.udea.ingenieriaweb.dao;

import java.util.List;

import co.edu.udea.ingenieriaweb.dto.Usuario;
import co.edu.udea.ingenieriaweb.exception.MyException;

/**
 * 
 ** @author Joaquin David Hernandez C <jdavidhc94@gmail.com>
 * Interfaces que contienelos metodo que permiten hacer operaciones de el DTO Usuario en la DB
 *
 */
public interface UsuarioDAO {
	/**
	 * Metodo que permite obtener la lista de los usuarios que existen en la DB
	 * @return List<Usuario>
	 * @throws MyException
	 */
	public List<Usuario> obtenerUsuarios() throws MyException;
	public List<Usuario> obtenerUsuariosRol(String rol) throws MyException;
}
