package co.edu.udea.ingenieriaweb.dao.imp;


import java.util.ArrayList;
import java.util.List;


import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;

import co.edu.udea.ingenieriaweb.dto.Ciudad;
import co.edu.udea.ingenieriaweb.dao.CiudadDAO;
import co.edu.udea.ingenieriaweb.dao.HibernateSessionFactory;
import co.edu.udea.ingenieriaweb.exception.MyException;;

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

	@Override
	public void insertarCiudad(Ciudad ciudad) throws MyException {
		Session session = null;
		 org.hibernate.Transaction tx = session.beginTransaction();
		try{
			
			/*Obtenemos la sesion mediante la cual nos vamos a conectar*/
			session = HibernateSessionFactory.getInstance().getSession();
			// Guardo la ciudad en ka DB
			session.save(ciudad); 
            tx.commit(); 
			
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
