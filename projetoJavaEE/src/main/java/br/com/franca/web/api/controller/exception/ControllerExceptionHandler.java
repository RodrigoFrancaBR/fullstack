package br.com.franca.web.api.controller.exception;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

import br.com.franca.business.exception.BusinessRuleException;
import br.com.franca.web.api.controller.exception.dto.StandardErrorDTO;

@Provider
public  class ControllerExceptionHandler implements ExceptionMapper<Throwable>{
	@Context
	UriInfo uriInfo;

	@Override
	public Response toResponse(Throwable exception) {
		Throwable cause = exception.getCause();

		System.out.println(exception.getMessage());
		StandardErrorDTO standardErrorDTO = new StandardErrorDTO(exception.getMessage(), "Regra de Negócio",
				uriInfo.getRequestUri(), Response.Status.BAD_REQUEST, System.currentTimeMillis());
		return Response.status(Status.BAD_REQUEST).entity(standardErrorDTO).build();
	}
	
}
