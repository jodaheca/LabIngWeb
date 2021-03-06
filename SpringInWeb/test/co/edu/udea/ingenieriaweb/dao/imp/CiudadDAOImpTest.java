package co.edu.udea.ingenieriaweb.dao.imp;

import static org.junit.Assert.*;

import java.util.List;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import co.edu.udea.ingenieriaweb.dao.CiudadDAO;
import co.edu.udea.ingenieriaweb.dto.Ciudad;
import co.edu.udea.ingenieriaweb.exception.MyException;
/**
 * 
 * @author Joaquin Hernandez Cardenas <jdavidhc94@gmail.com>
 *
 */

/*Le especificamos que correremos la prueba con el Junit de Spring*/
@RunWith (SpringJUnit4ClassRunner.class)

/*Le decimos cual es el archivo de configuraciones del Spring*/
@ContextConfiguration (locations = "classpath:springConfig.xml")

/*Le decimos a Spring que en esta clase pueden haber cosas que deba inyectar*/
@Component
public class CiudadDAOImpTest {
	
	/*Inyectamos Un objeto de la clase CiudadDAO*/
	
	@Autowired
	CiudadDAO ciudadDao;
	
	/**
	 * 
	 * prueba de integracion  para  obtener todas las ciudades
	 *  
	 */
	@Test
	public void testObtenerCiudades() {
		List<Ciudad> ciudades = null;
		
		try{
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
//	@Test
//	public void testObtenerCiudad() {
//		Ciudad ciudad = null;
//		
//		try{
//			CiudadDAO ciudadDao = new CiudadDAOImp();
//			ciudad = ciudadDao.obtenerCiudad(1);
//			assertTrue(ciudad!=null);
//			Logger  log = Logger.getLogger(this.getClass());
//			log.info(ciudad.getNombre());
//			log.info("Nombre de la Ciudad");
//		}catch(MyException e){
//			e.printStackTrace();
//			fail("Not yet implemented");
//		}
//	}
//	
//	/**
//	 * 
//	 * Prueba de integracion para Ingresar una ciudad a la DB
//	 * 
//	 */
//	
//	@Test
//	public void testIngresarCiudad() {
//		Ciudad ciudad = new Ciudad();
//		ciudad.setNombre("Prueba de Ingreso");
//		ciudad.setCodigoArea("12");
//		ciudad.setCodigo(5);
//		
//		
//		try{
//			CiudadDAO ciudadDao = new CiudadDAOImp();
//		    ciudadDao.insertarCiudad(ciudad);;
//			//assertTrue(ciudad!=null);
//		}catch(MyException e){
//			e.printStackTrace();
//			fail("Not yet implemented");
//		}
//	}
//	
//	@Test
//	public void testUptdateCiudad() {
//		Ciudad ciudad = new Ciudad();
//		ciudad.setNombre("Otra Prueba");
//		ciudad.setCodigoArea("12");
//		ciudad.setCodigo(5);
//		
//		
//		try{
//			CiudadDAO ciudadDao = new CiudadDAOImp();
//		    ciudadDao.updateCiudad(ciudad);
//			//assertTrue(ciudad!=null);
//		}catch(MyException e){
//			e.printStackTrace();
//			fail("Not yet implemented");
//		}
//	}
//	
//	@Test
//	public void testDeleteCiudad() {
//		Ciudad ciudad = new Ciudad();
//		ciudad.setCodigo(5);
//		
//		
//		try{
//			CiudadDAO ciudadDao = new CiudadDAOImp();
//		    ciudadDao.deleteCiudad(ciudad);
//			//assertTrue(ciudad!=null);
//		}catch(MyException e){
//			e.printStackTrace();
//			fail("Not yet implemented");
//		}
//	}

}
