package co.edu.udea.ingenieriaweb.ws;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("saludar")
public class PruebaServicio {
	
	@GET
	@Path("{a}")
	@Produces(MediaType.TEXT_HTML)
	public String Saludar(@PathParam("a") String texto){
		return "Hola Amigo " + texto;
	}

}
