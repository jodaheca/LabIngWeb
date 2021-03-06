package co.edu.udea.ingenieriaweb.dao.imp;


import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import co.edu.udea.ingenieriaweb.dto.Ciudad;
import co.edu.udea.ingenieriaweb.dao.CiudadDAO;
import co.edu.udea.ingenieriaweb.dao.HibernateSessionFactory;
import co.edu.udea.ingenieriaweb.exception.MyException;

/**
 * Clase que implementa todos los metodos de la interfaz CiudadDAO, permite hacer operaciones
 * CRUD de las ciudades en la DB
 * @author Joaquin David Hernandez Cardenas <jdavidhc94@gmail.com>
 *
 */
public class CiudadDAOImp implements CiudadDAO{

	
	public CiudadDAOImp(){}
	
	@Override
	
	public List<Ciudad> obtenerCiudades() throws MyException {
		
		List<Ciudad> resultado = new ArrayList<Ciudad>();
		Session session = null;
		try{
			
			/*Obtenemos la sesion mediante la cual nos vamos a conectar*/
			session = HibernateSessionFactory.getInstance().getSession();
			
			/*Le indicamos que vamos a hacer consultas sobre la clase Ciudad*/
			Criteria criteria = session.createCriteria(Ciudad.class);
			
			/*Obtenemos la lista de las Ciudades*/
			resultado = criteria.list();
			
			return resultado;
			
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

	@Override
	public Ciudad obtenerCiudad(int codigo) throws MyException {
		
		Session session = null;
		try{
			
			Ciudad ciudad = null;
			/*Obtenemos la sesion mediante la cual nos vamos a conectar*/
			session = HibernateSessionFactory.getInstance().getSession();
			
			/*Le indicamos que vamos a hacer consultas sobre la clase Ciudad*/
			Criteria criteria = session.createCriteria(Ciudad.class);
			
			/*Obtenemos la lista de las Ciudades*/
			ciudad =(Ciudad)session.get(Ciudad.class, codigo);
			
			return ciudad;
			
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
	
	/**
	 * 
	 * Metodo que permite insertar una ciudad en la DB
	 * @param ciudad
	 * 
	 */

	@Override
	public void insertarCiudad(Ciudad ciudad) throws MyException {
		Session session = null;
		Logger  log = Logger.getLogger(this.getClass());
		try{
			session = HibernateSessionFactory.getInstance().getSession(); 
			Transaction tx = session.beginTransaction();
            session.save(ciudad);
            session.flush();
            tx.commit();
			
			
		/*catch para caturar algun posible Error*/	
		}catch(HibernateException e){
			log.error("Error guardando Ciudad"+ e);
			throw new MyException(e);
			
		}finally{
			/*Cerramos la sesion creada*/
			 if (session!=null) {
					session.close(); 	
			}
		
		}
	}
	
	/**
	 * 
	 * Metodo para Actualizar una ciudad en la DB
	 * @param ciudad
	 * 
	 */

	@Override
	public void updateCiudad(Ciudad ciudad) throws MyException {
		
         
     	Session session = null;
		Logger  log = Logger.getLogger(this.getClass());
		try{
			session = HibernateSessionFactory.getInstance().getSession(); 
			Transaction tx = session.beginTransaction();
            session.merge(ciudad);
            // Cuando no se manejan varias sessiones se puede usar update
            //session.update(ciudad);
            session.flush();
            tx.commit();
			
			
		/*catch para caturar algun posible Error*/	
		}catch(HibernateException e){
			log.error("Error Actualizando Ciudad"+ e);
			throw new MyException(e);
			
		}finally{
			/*Cerramos la sesion creada*/
			 if (session!=null) {
					session.close(); 	
			}
		
		}
		
	}
	
	/**
	 * 
	 * Metodo que permite eliminar una Ciudad de la DB
	 * @param ciudad
	 * 
	 */

	@Override
	public void deleteCiudad(Ciudad ciudad) throws MyException {
		Session session = null;
		Logger  log = Logger.getLogger(this.getClass());
		try{
			session = HibernateSessionFactory.getInstance().getSession(); 
			Transaction tx = session.beginTransaction();
            session.delete(ciudad);
            session.flush();
            tx.commit();
			
			
		/*catch para caturar algun posible Error*/	
		}catch(HibernateException e){
			log.error("Error Actualizando Ciudad"+ e);
			throw new MyException(e);
			
		}finally{
			/*Cerramos la sesion creada*/
			 if (session!=null) {
					session.close(); 	
			}
		
		}
		
	}	



}
