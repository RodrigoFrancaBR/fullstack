package br.com.franca.web.api.controller.exception;

import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

public class RestException extends WebApplicationException {
	private static final long serialVersionUID = 1L;

	public RestException(String message, Status status) {
		super(Response.status(status).entity(message).type(MediaType.TEXT_PLAIN).build());
	}
}
