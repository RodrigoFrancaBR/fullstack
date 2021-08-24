package br.com.franca.business.exception;

import java.net.URI;

import javax.ws.rs.core.Response.Status;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class BusinessErrorDTO {

	private String message;
	private String error;
	private URI requestUri;
	private Status status;
	private long currentTimeMillis;

	public BusinessErrorDTO() {
		super();
	}

	public BusinessErrorDTO(String message, String error, URI requestUri, Status status, long currentTimeMillis) {
		super();
		this.message = message;
		this.error = error;
		this.requestUri = requestUri;
		this.status = status;
		this.currentTimeMillis = currentTimeMillis;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}

	public URI getRequestUri() {
		return requestUri;
	}

	public void setRequestUri(URI requestUri) {
		this.requestUri = requestUri;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public long getCurrentTimeMillis() {
		return currentTimeMillis;
	}

	public void setCurrentTimeMillis(long currentTimeMillis) {
		this.currentTimeMillis = currentTimeMillis;
	}

}
