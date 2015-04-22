package co.edu.udea.ingenieriaweb.dao.imp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
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
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insertarCiudad(Ciudad ciudad) throws MyException {
		// TODO Auto-generated method stub
		
	}

//	@Override
//	public Ciudad obtenerCiudad(int codigo) throws MyException {
//		// TODO Auto-generated method stub
//		Connection conexion = null;
//		PreparedStatement ps = null;
//		ResultSet rs = null;
//		String consultaSQL = "SELECT * FROM ciudades WHERE codigo=?";
//		Ciudad ciudad=null;
//		try{
//			conexion = DataSource.getInstance().getConnection();
//			ps = conexion.prepareStatement(consultaSQL);
//			ps.setInt(1, codigo);
//			rs = ps.executeQuery();
//			if(rs.next()){
//				ciudad = new Ciudad();
//				ciudad.setCodigo(rs.getInt("codigo"));
//				ciudad.setNombre(rs.getString("nombre"));
//				ciudad.setCodigoArea(rs.getString("codigoArea"));
//				
//			}
//			return ciudad;
//			
//		}catch(SQLException e){
//			throw new MyException(e);
//		}finally{
//			 if (rs!=null) {
//				try{
//					rs.close();
//				}catch(Exception e){
//					System.out.println("Error cerrando la conexion");
//				} 
//				
//			}
//			 if(ps != null){
//				 try{
//						ps.close();
//					}catch(Exception e){
//						System.out.println("Error cerrando la conexion");
//					} 
//			 }
//			 if(conexion != null){
//				 try{
//						conexion.close();
//					}catch(Exception e){
//						System.out.println("Error cerrando la conexion");
//					} 
//			 }
//		 }
//	}
//
//	@Override
//	public void insertarCiudad(Ciudad ciudad) throws MyException {
//		// TODO Auto-generated method stub
//		Connection conexion = null;
//		PreparedStatement ps = null;
//		String consultaSQL = "INSERT INTO ciudades(codigo,nombre,codigoArea) VALUES (?,?,?)";
//		try{
//			conexion = DataSource.getInstance().getConnection();
//			ps = conexion.prepareStatement(consultaSQL);
//			ps.setInt(1, ciudad.getCodigo());
//			ps.setString(2, ciudad.getNombre());
//			ps.setString(3, ciudad.getCodigoArea());
//			ps.execute();
//		}catch(SQLException e){
//			throw new MyException(e);
//		}finally{
//			 if(ps != null){
//				 try{
//						ps.close();
//					}catch(Exception e){
//						System.out.println("Error cerrando la conexion");
//					} 
//			 }
//			 if(conexion != null){
//				 try{
//						conexion.close();
//					}catch(Exception e){
//						System.out.println("Error cerrando la conexion");
//					} 
//			 }
//		 }
//	}



}