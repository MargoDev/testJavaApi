package mx.com.crm.general;

import java.net.HttpURLConnection;

import javax.ws.rs.core.Response;

import com.google.gson.Gson;

public class Util {

	public static Response jsonResponse(Object valor) {
		return Response.status(HttpURLConnection.HTTP_OK).entity(new Gson().toJson(valor)).build();
	}
}
