package co.edu.udea.ingenieriaweb.dao;

import java.util.List;

import co.edu.udea.ingenieriaweb.dto.Ciudad;
import co.edu.udea.ingenieriaweb.exception.MyException;
/**
 * 
 * @author Joaquin David Hernandez C <jdavidhc94@gmail.com>
 * Interfaces que contienelos metodo que permiten hacer operaciones de el DTO ciudad en la DB
 *
 */
public interface CiudadDAO {
	/**
	 * Metodo que permite obtener todas las ciudades de la DB
	 * @return List<Ciudad>
	 * @throws MyException
	 */
	public List<Ciudad> obtenerCiudades() throws MyException;
	
	/**
	 * Metodo que permite obtener una ciudad de la DB, recibe como parametro el codigo de 
	 * una ciudad
	 * @param codigo
	 * @return
	 * @throws MyException
	 */
	public Ciudad obtenerCiudad(int codigo) throws MyException;
	
	/**
	 * Metodo que permite insertar una Ciudad en la DB, recibe como parametro el objeto de la 
	 * ciudad que se va a insertar en la DB
	 * @param ciudad
	 * @throws MyException
	 */
	public void insertarCiudad(Ciudad ciudad) throws MyException;
	
	/**
	 * Metodo que permite actualizar una ciudad en la DB, recibe como parametro la el objeto con
	 * la ciudad que se va a actualizar, el codigo de la ciudad debe corresponder con el codigo de
	 * una ciudad en la DB
	 * @param ciudad
	 * @throws MyException
	 */
	public void updateCiudad(Ciudad ciudad) throws MyException;
	
	/**
	 * Metodo que permite eliminar una Ciudad de la DB, recibe como parametro un objeto de Ciudad
	 * que debe contener como minimo el codigo de la ciudad que se desea eliminar, el unico 
	 * dato que se utiliza para eliminar el objeto es el codigo de la Ciudad
	 * @param ciudad
	 * @throws MyException
	 */
	public void deleteCiudad(Ciudad ciudad) throws MyException;
}
