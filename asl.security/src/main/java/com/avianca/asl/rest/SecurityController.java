package com.avianca.asl.rest;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.avianca.asl.domain.Authorization;
import com.avianca.asl.domain.Session;
import com.avianca.asl.domain.Token;
import com.avianca.asl.domain.User;
import com.avianca.asl.service.LoginService;
import com.google.gson.Gson;


/**
 * 
 * @author CBYK - Ricardo Almeida
 * @since 16/06/2016
 * @version 1.0.0
 */

@Component
@Path("/securitycontroller")
public class SecurityController {

	private Logger logger = LoggerFactory.getLogger(this.getClass());
	@Autowired
	@Qualifier("loginServiceImpl")
	LoginService service ;
	
	@GET
	@Path("/login/{user}/{password}")
	@Produces(value = MediaType.APPLICATION_JSON)
	public String login(@PathParam("user") String user,@PathParam("password") String pwd){
		Authorization  authorization = null;
		try {
			authorization  = service.loginTest(user, pwd);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		List list = new ArrayList<>();
		list.add(authorization);
		//list.add(new User());
		//list.add(new Session());
		String json = new Gson().toJson(list);
		return json;
	}
	
    @GET
    @Path("/test/{valor}")
    @Produces(value = MediaType.TEXT_PLAIN)
    public Response sale(@PathParam("id") int id) {
        logger.info("Recebendo valore : " + id);
        return Response.ok("OK!").status(Response.Status.OK).build();
    }

    @GET
    @Path("/test/")
    public String message() {
        return "XABARACUNAIA";
    }

}
