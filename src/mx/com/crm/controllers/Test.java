package mx.com.crm.controllers;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.google.gson.JsonObject;

import mx.com.crm.general.Util;

@Path("/api")
public class Test {

	@GET
	@Path("/test")
	@Produces(MediaType.APPLICATION_JSON)
	public Response test() {
		JsonObject json = new JsonObject();
		
		json.addProperty("Status", "OK");
		json.addProperty("Message", "El servicio REST está activo");

		return Util.jsonResponse(json);
	}
}
