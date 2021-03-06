package co.edu.udea.ingenieriaweb.exception;

import org.apache.log4j.Logger;
import org.hibernate.HibernateException;

/**
 * 
 * @author Joaquin David Hernandez Cardenas <jdavidhc94@gmail.com>
 * Clase que permite controlar las exceptiones que se puedan presentar en la aplicacion
 *
 */
public class MyException extends  Exception{
	
    public MyException(Exception e) {
        super();
    }

	public MyException(ClassNotFoundException e) {
		super();
	}
	
	public MyException(HibernateException e) {
		super();
	}
	
	public MyException(HibernateException e, String mensaje) {
		super(mensaje);
	}
    
   /* public MyException(String message) {
        super(message);
    }
    
    public MyException(Throwable cause) {
        super(cause);
    }
    
    public MyException(String message, Throwable cause) {
        super(message, cause);
    }*/
	

}
