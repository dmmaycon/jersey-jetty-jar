package rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/")
public class HelloRest {
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String welcome() {
		return "Welcome to REST in Jar (Jetty and Jersey)!!!";
	}
	
	
}
