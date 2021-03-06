package br.com.franca.jms;

import java.util.Scanner;

import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageConsumer;
import javax.jms.Session;
import javax.naming.InitialContext;
import javax.naming.NamingException;

public class TesteConsumidor {
	
	public static void main(String[] args) throws NamingException, JMSException {
		
		InitialContext context = new InitialContext();

		ConnectionFactory factory = (ConnectionFactory) context.lookup("ConnectionFactory");

		Connection connection = factory.createConnection();

		connection.start();

		Session session = connection.createSession(false, Session.CLIENT_ACKNOWLEDGE);

		Destination fila = (Destination) context.lookup("financeiro");

		MessageConsumer consumer = session.createConsumer(fila);

		Message message = consumer.receive();

		System.out.println("Recebendo mensagem: " + message);

		new Scanner(System.in).nextLine();

		connection.close();

		context.close();
	}
}
