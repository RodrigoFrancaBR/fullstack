package br.com.franca.web.servlet;

import java.io.IOException;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import br.com.franca.domain.Categoria;

/**
 * Servlet implementation class HelloServlet
 */
public class HelloServlet extends HttpServlet {
	
	private static Log LOG = LogFactory.getLog(HelloServlet.class);
	
	@Inject
	private Categoria categoria;

	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public HelloServlet() {
		super();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		this.categoria.setId(1);
		this.categoria.setNome("Teste");
		
		System.out.println(this.categoria.toString());
		
		try {
			throw new RuntimeException();	
		} catch (Exception e) {
			LOG.error("Ocorreu algum erro no servlet " + e.getMessage(), e);			
		}
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
