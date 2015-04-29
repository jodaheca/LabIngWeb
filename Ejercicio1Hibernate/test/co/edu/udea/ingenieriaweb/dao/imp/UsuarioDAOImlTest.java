package co.edu.udea.ingenieriaweb.dao.imp;

import static org.junit.Assert.*;

import java.util.List;

import org.apache.log4j.Logger;
import org.junit.Test;

import co.edu.udea.ingenieriaweb.dao.CiudadDAO;
import co.edu.udea.ingenieriaweb.dao.UsuarioDAO;
import co.edu.udea.ingenieriaweb.dto.Ciudad;
import co.edu.udea.ingenieriaweb.dto.Usuario;
import co.edu.udea.ingenieriaweb.exception.MyException;

public class UsuarioDAOImlTest {

	@Test
	public void testObtenerUsuarios() {
		List<Usuario> usuarios = null;
		
		try{
			UsuarioDAO usuarioDao = new UsuarioDAOIml();
			usuarios = usuarioDao.obtenerUsuarios();
			Usuario usuario = usuarios.get(0);
			Logger  log = Logger.getLogger(this.getClass());
			log.info("Lista de Usuarios"+ usuarios);
			log.info("Nombre Primer Uusario: "+ usuario.getNombres());
			assertTrue(usuarios.size()>0);
			
		}catch(MyException e){
			
			e.printStackTrace();
			fail("Not yet implemented");
		}
	}

}
