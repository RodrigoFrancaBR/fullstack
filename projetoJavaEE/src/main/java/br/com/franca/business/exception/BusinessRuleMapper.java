package br.com.franca.business.exception;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

@Provider
public class BusinessRuleMapper implements ExceptionMapper<BusinessRuleException> {
	@Context
	UriInfo uriInfo;

	@Override
	public Response toResponse(BusinessRuleException businessRuleException) {
		BusinessErrorDTO standardErrorDTO = new BusinessErrorDTO(businessRuleException.getMessage(), "Regra de Negócio",
				uriInfo.getRequestUri(), Response.Status.BAD_REQUEST, System.currentTimeMillis());
		return Response.status(Status.BAD_REQUEST).entity(standardErrorDTO).build();
	}

}
