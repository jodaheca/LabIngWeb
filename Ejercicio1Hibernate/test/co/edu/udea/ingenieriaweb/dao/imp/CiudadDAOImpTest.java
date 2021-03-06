package co.edu.udea.ingenieriaweb.dao.imp;

import static org.junit.Assert.*;

import java.util.List;

import org.apache.log4j.Logger;
import org.junit.Test;

import co.edu.udea.ingenieriaweb.dao.CiudadDAO;
import co.edu.udea.ingenieriaweb.dto.Ciudad;
import co.edu.udea.ingenieriaweb.exception.MyException;
/**
 * 
 * @author Joaquin Hernandez Cardenas <jdavidhc94@gmail.com>
 *
 */

public class CiudadDAOImpTest {
	
	/**
	 * 
	 * prueba de integracion  para  obtener todas las ciudades
	 *  
	 */

	@Test
	public void testObtenerCiudades() {
		List<Ciudad> ciudades = null;
		
		try{
			CiudadDAO ciudadDao = new CiudadDAOImp();
			ciudades = ciudadDao.obtenerCiudades();
			assertTrue(ciudades.size()>0);
			Logger  log = Logger.getLogger(this.getClass());
			log.info("Lista de Ciudades"+ ciudades);
		}catch(MyException e){
			e.printStackTrace();
			fail("Not yet implemented");
		}
	}
	
	/**
	 * 
	 * Prueba de integracion para obtener una ciudad.
	 */
	@Test
	public void testObtenerCiudad() {
		Ciudad ciudad = null;
		
		try{
			CiudadDAO ciudadDao = new CiudadDAOImp();
			ciudad = ciudadDao.obtenerCiudad(1);
			assertTrue(ciudad!=null);
			Logger  log = Logger.getLogger(this.getClass());
			log.info(ciudad.getNombre());
			log.info("Nombre de la Ciudad");
		}catch(MyException e){
			e.printStackTrace();
			fail("Not yet implemented");
		}
	}
	
	/**
	 * 
	 * Prueba de integracion para Ingresar una ciudad a la DB
	 * 
	 */
	
	@Test
	public void testIngresarCiudad() {
		Ciudad ciudad = new Ciudad();
		ciudad.setNombre("Prueba de Ingreso");
		ciudad.setCodigoArea("12");
		ciudad.setCodigo(5);
		
		
		try{
			CiudadDAO ciudadDao = new CiudadDAOImp();
		    ciudadDao.insertarCiudad(ciudad);;
			//assertTrue(ciudad!=null);
		}catch(MyException e){
			e.printStackTrace();
			fail("Not yet implemented");
		}
	}
	
	@Test
	public void testUptdateCiudad() {
		Ciudad ciudad = new Ciudad();
		ciudad.setNombre("Otra Prueba");
		ciudad.setCodigoArea("12");
		ciudad.setCodigo(5);
		
		
		try{
			CiudadDAO ciudadDao = new CiudadDAOImp();
		    ciudadDao.updateCiudad(ciudad);
			//assertTrue(ciudad!=null);
		}catch(MyException e){
			e.printStackTrace();
			fail("Not yet implemented");
		}
	}
	
	@Test
	public void testDeleteCiudad() {
		Ciudad ciudad = new Ciudad();
		ciudad.setCodigo(5);
		
		
		try{
			CiudadDAO ciudadDao = new CiudadDAOImp();
		    ciudadDao.deleteCiudad(ciudad);
			//assertTrue(ciudad!=null);
		}catch(MyException e){
			e.printStackTrace();
			fail("Not yet implemented");
		}
	}

}
