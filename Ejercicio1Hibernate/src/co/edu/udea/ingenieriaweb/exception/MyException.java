package co.edu.udea.ingenieriaweb.exception;

import org.hibernate.HibernateException;

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
