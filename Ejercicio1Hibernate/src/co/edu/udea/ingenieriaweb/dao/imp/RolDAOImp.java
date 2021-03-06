package co.edu.udea.ingenieriaweb.dao.imp;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;

import co.edu.udea.ingenieriaweb.dao.HibernateSessionFactory;
import co.edu.udea.ingenieriaweb.dao.RolDAO;
import co.edu.udea.ingenieriaweb.dto.Rol;
import co.edu.udea.ingenieriaweb.exception.MyException;

/**
 * 
 * @author Joaquin David Hernandez Cardenas <jdavidhc94@gmail.com>
 *
 */
public class RolDAOImp implements RolDAO {

	
	public RolDAOImp(){
		
	}
	
	@Override
	public Rol obtenerRol(String codigo) throws MyException {
		
		Session session = null;
		try{
				
					Rol rol = null;
					/*Obtenemos la sesion mediante la cual nos vamos a conectar*/
					session = HibernateSessionFactory.getInstance().getSession();
					
					/*Obtenemos un Rol desde la DB*/
					rol =(Rol)session.get(Rol.class, codigo);
					
					return rol;
					
				/*catch para caturar algun posible Error*/	
				}catch(HibernateException e){
					throw new MyException(e);
					
				}finally{
					/*Cerramos la sesion creada*/
					 if (session!=null) {
							session.close(); 	
					}
				}
		}
	
	

}
