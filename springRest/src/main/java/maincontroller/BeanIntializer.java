package maincontroller;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;

import org.apache.catalina.connector.Request;
import org.springframework.context.ApplicationContext;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

public class BeanIntializer  extends org.springframework.web.context.ContextLoaderListener{
	public static WebApplicationContext ctx;
	
 
	      

	@Override
	protected WebApplicationContext createWebApplicationContext(
			ServletContext sc, ApplicationContext parent) {
		// TODO Auto-generated method stub
		System.out.println("I reachedd in listener");
	
	ctx = WebApplicationContextUtils.getRequiredWebApplicationContext(sc);
	

	return ctx;
	      
	}  
	
	@Override
	public void contextInitialized(ServletContextEvent event) {
		// TODO Auto-generated method stub
		super.contextInitialized(event);
		System.out.println("I reachedd in listener");
		
		ctx = WebApplicationContextUtils.getRequiredWebApplicationContext(event.getServletContext());
		System.out.println(ctx);
		
	}

	public WebApplicationContext getWebapplicationContext(){
		return ctx;
		
	}

}
