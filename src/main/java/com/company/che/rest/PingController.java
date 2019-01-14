package com.company.che.rest;

import java.io.Serializable;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.stereotype.Component;



@Component
@Path("/ping")
public class PingController implements Serializable {

	private static final long serialVersionUID = 6018823416416667358L;

	@GET
	@Path("/")
	@Produces(MediaType.APPLICATION_JSON)
	public String  ping() {

		return "Pong";
	}
	
	
}



