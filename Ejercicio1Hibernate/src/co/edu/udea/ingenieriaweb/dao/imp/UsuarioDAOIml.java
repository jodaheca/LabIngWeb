package co.edu.udea.ingenieriaweb.dao.imp;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import co.edu.udea.ingenieriaweb.dao.HibernateSessionFactory;
import co.edu.udea.ingenieriaweb.dao.UsuarioDAO;
import co.edu.udea.ingenieriaweb.dto.Usuario;
import co.edu.udea.ingenieriaweb.exception.MyException;

public class UsuarioDAOIml implements UsuarioDAO {
	
	public UsuarioDAOIml(){
		
	}

	@Override
	public List<Usuario> obtenerUsuarios() throws MyException {
		

		List<Usuario> usuarios = new ArrayList<Usuario>();
		Session session = null;
		try{
			
			/*Obtenemos la sesion mediante la cual nos vamos a conectar*/
			session = HibernateSessionFactory.getInstance().getSession();
			
			/*Le indicamos que vamos a hacer consultas sobre la clase Usuario*/
			Criteria criteria = session.createCriteria(Usuario.class);
			
			/*Obtenemos la lista de las Usuarios*/
			usuarios = criteria.list();
			
			return usuarios;
			
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
	public List<Usuario> obtenerUsuariosRol(String rol) throws MyException {
		List<Usuario> usuarios = new ArrayList<Usuario>();
		Session session = null;
		try{
			
			/*Obtenemos la sesion mediante la cual nos vamos a conectar*/
			session = HibernateSessionFactory.getInstance().getSession();
			
			/*Le indicamos que vamos a hacer consultas sobre la clase Usuario*/
			Criteria criteria = session.createCriteria(Usuario.class).
					add(Restrictions.eq("rol.Codigo", rol));
			
			/*Obtenemos la lista de las Usuarios*/
			usuarios = criteria.list();
			
			return usuarios;
			
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
