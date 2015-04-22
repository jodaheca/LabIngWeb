package co.edu.udea.ingenieriaweb.dao;

import java.util.List;

import co.edu.udea.ingenieriaweb.dto.Ciudad;
import co.edu.udea.ingenieriaweb.exception.MyException;

public interface CiudadDAO {
	public List<Ciudad> obtenerCiudades() throws MyException;
	public Ciudad obtenerCiudad(int codigo) throws MyException;
	public void insertarCiudad(Ciudad ciudad) throws MyException;
}
