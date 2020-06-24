package server;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;


public class JettyServer {
	
	public static int port = 8080;
	
	public static Server createServer() {
		
		ServletContextHandler context = new ServletContextHandler(ServletContextHandler.SESSIONS);
		context.setContextPath("/");
		
		Server server = new Server(port);
		server.setHandler(context);
		
		ServletHolder jerseyServlet = context.addServlet(org.glassfish.jersey.servlet.ServletContainer.class, "/*");

		// mapping class service rest
		jerseyServlet.setInitParameter("jersey.config.server.provider.packages", "rest");
				
		return server;
	}
	
}
