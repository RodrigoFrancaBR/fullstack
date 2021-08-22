package br.com.franca.business.exception;

public class BusinessRuleException extends RuntimeException {
	private static final long serialVersionUID = 1L;
	
	public BusinessRuleException() {
		super();
	}

	public BusinessRuleException(String msg) {
		super(msg);
	}

	public BusinessRuleException(String msg, Throwable cause) {
		super(msg, cause);
	}
}
