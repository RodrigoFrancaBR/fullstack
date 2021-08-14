package br.com.franca.web.filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 * Servlet Filter implementation class HelloFilter
 */
public class HelloFilter implements Filter {

	/**
	 * Default constructor.
	 */
	public HelloFilter() {
		System.out.println("Criação do HelloFilter.");
	}

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		System.out.println("Destroy");
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		long tempoInicial = System.currentTimeMillis();

		chain.doFilter(request, response);

		long tempoFinal = System.currentTimeMillis();
		
		System.out.println(tempoFinal - tempoInicial);

		// pass the request along the filter chain
		chain.doFilter(request, response);
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		System.out.println("init");
	}

}
