package co.edu.udea.ingenieriaweb.dao.imp;

import static org.junit.Assert.*;

import java.util.List;

import org.apache.log4j.Logger;
import org.junit.Test;

import co.edu.udea.ingenieriaweb.dao.CiudadDAO;
import co.edu.udea.ingenieriaweb.dao.RolDAO;
import co.edu.udea.ingenieriaweb.dao.UsuarioDAO;
import co.edu.udea.ingenieriaweb.dto.Ciudad;
import co.edu.udea.ingenieriaweb.dto.Rol;
import co.edu.udea.ingenieriaweb.dto.Usuario;
import co.edu.udea.ingenieriaweb.exception.MyException;

/**
 * 
 * @author Joaquin David Hernandez Cardenas <jdavidhc94@gmail.com>
 * Clase en la cual se realizan todas las pruebas sobre la clase UsuarioDaoImp
 */
public class UsuarioDAOImlTest {

	/**
	 * Prueba que permite obtener todos los usuarios que estan en la DB, no recibe parametros
	 */
	@Test
	public void testObtenerUsuarios() {
		List<Usuario> usuarios = null;
		
		try{
			UsuarioDAO usuarioDao = new UsuarioDAOIml();
			//RolDAO managerRol = new RolDAOImp();
			usuarios = usuarioDao.obtenerUsuarios();
			for(int i =0; i<usuarios.size(); i++){
				Usuario usuario = usuarios.get(i);
				Logger  log = Logger.getLogger(this.getClass());
				log.info("Nombre Usuario: "+ usuario.getNombres());
				log.info("Rol Usuario: " + usuario.getRol().getNombre());
			}		
			assertTrue(usuarios.size()>0);
			
		}catch(MyException e){
			
			e.printStackTrace();
			fail("Not yet implemented");
		}
	}

}
