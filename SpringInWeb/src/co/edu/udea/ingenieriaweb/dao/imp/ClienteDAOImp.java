package co.edu.udea.ingenieriaweb.dao.imp;

import org.apache.log4j.Logger;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import co.edu.udea.ingenieriaweb.dao.ClienteDAO;
import co.edu.udea.ingenieriaweb.dto.Cliente;
import co.edu.udea.ingenieriaweb.exception.MyException;

public class ClienteDAOImp  extends HibernateDaoSupport implements ClienteDAO{

	@Override
	public void guardarCliente(Cliente cliente) throws MyException {
		Session session = null;
		Logger  log = Logger.getLogger(this.getClass());
		try{
			session = getSession(); 
			Transaction tx = session.beginTransaction();
            session.save(cliente);
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

}
