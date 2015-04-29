package co.edu.udea.ingenieriaweb.dao.imp;

import static org.junit.Assert.*;

import org.apache.log4j.Logger;
import org.junit.Test;

import co.edu.udea.ingenieriaweb.dao.RolDAO;
import co.edu.udea.ingenieriaweb.dto.Rol;
import co.edu.udea.ingenieriaweb.exception.MyException;

public class RolDAOImpTest {

	@Test
	public void test() {
		Rol rol = null;
				
				try{
					RolDAO rolDao = new RolDAOImp();
					rol = rolDao.obtenerRol("ADM");
					assertTrue(rol!=null);
					Logger  log = Logger.getLogger(this.getClass());
					log.info(rol.getNombre());
					log.info("Nombre del Rol");
				}catch(MyException e){
					e.printStackTrace();
					fail("Not yet implemented");
				}
	}

}
