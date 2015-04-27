package co.edu.udea.ingenieriaweb.dao;

import org.apache.log4j.Logger;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import co.edu.udea.ingenieriaweb.exception.MyException;


public class HibernateSessionFactory {
	
	private static HibernateSessionFactory instancia = null;
	private static SessionFactory sessionFactory = null;
	private static Configuration configuration = new Configuration();
	 Logger  log = Logger.getLogger(this.getClass());
	//Constructor
	private HibernateSessionFactory(){}
	
	//Metodo que retorne una instancia de la clase
	public static HibernateSessionFactory getInstance(){
		if(instancia==null){
			instancia = new HibernateSessionFactory();
		}
		return instancia;
	}
	
	/*Metodo para obtener las conexiones a la DB*/
	public Session getSession() throws MyException{
		try{
			if(sessionFactory == null){
				configuration.configure("co/edu/udea/ingenieriaweb/dao/cfg/configuration.hbm.xml");
				sessionFactory = configuration.buildSessionFactory();
			}
			return sessionFactory.openSession();
		
		}catch (HibernateException e) {
			log.error("Error cargando", e);
			throw new MyException(e);
		}
	}

}
