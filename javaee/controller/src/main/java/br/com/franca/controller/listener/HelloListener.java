package br.com.franca.controller.listener;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;

/**
 * Application Lifecycle Listener implementation class HelloListener
 *
 */
public class HelloListener implements ServletRequestListener {

    /**
     * Default constructor. 
     */
    public HelloListener() {
    	System.out.println("Iniciando o HelloListener.");
    }

	/**
     * @see ServletRequestListener#requestDestroyed(ServletRequestEvent)
     */
    public void requestDestroyed(ServletRequestEvent sre)  { 
		System.out.println("Fim do do request.");
    }

	/**
     * @see ServletRequestListener#requestInitialized(ServletRequestEvent)
     */
    public void requestInitialized(ServletRequestEvent sre)  { 
		System.out.println("Inicio do request.");
    }
	
}
