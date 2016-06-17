package com.avianca.asl.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;


/**
 * 
 * @author CBYK - Ricardo Almeida
 * @since 16/06/2016
 * @version 1.0.0
 */

@Component
@Path("/test")
public class SecurityController {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

    @GET
    @Path("/envio/{id}")
    @Produces(value = MediaType.TEXT_PLAIN)
    public Response sale(@PathParam("id") int id) {
        logger.info("Recebendo intencao de venda ID: " + id);
        return Response.ok("OK!").status(Response.Status.OK).build();
    }

    @GET
    @Path("/test/")
    public String message() {
        return "XABARACUNAIA";
    }

}
