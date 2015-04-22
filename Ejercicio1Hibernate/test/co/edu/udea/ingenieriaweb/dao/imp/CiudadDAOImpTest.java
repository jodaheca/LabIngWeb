package co.edu.udea.ingenieriaweb.dao.imp;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import co.edu.udea.ingenieriaweb.dao.CiudadDAO;
import co.edu.udea.ingenieriaweb.dto.Ciudad;
import co.edu.udea.ingenieriaweb.exception.MyException;

public class CiudadDAOImpTest {

	@Test
	public void testObtenerCiudades() {
		List<Ciudad> ciudades = null;
		
		try{
			CiudadDAO ciudadDao = new CiudadDAOImp();
			ciudades = ciudadDao.obtenerCiudades();
			assertTrue(ciudades.size()>0);
		}catch(MyException e){
			e.printStackTrace();
			fail("Not yet implemented");
		}
	}

}