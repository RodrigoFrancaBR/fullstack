package br.com.franca.jms;

import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageConsumer;
import javax.jms.Session;
import javax.naming.InitialContext;
import javax.naming.NamingException;

public class JMSUtil {

	private Connection getConnection() {

		InitialContext context;

		Connection connection = null;

		try {
			context = new InitialContext();
			ConnectionFactory factory = (ConnectionFactory) context.lookup("ConnectionFactory");

			connection = factory.createConnection();

		} catch (NamingException | JMSException e) {
			e.printStackTrace();
		}

		return connection;

	}

	private MessageConsumer getConsumer() {

		Session session;

		MessageConsumer consumer = null;

		try {
			session = connection.createSession(false, Session.CLIENT_ACKNOWLEDGE);

			InitialContext context = new InitialContext();

			Destination fila = (Destination) context.lookup("financeiro");

			consumer = session.createConsumer(fila);
		} catch (JMSException | NamingException e) {
			e.printStackTrace();
		}

		return consumer;
	}

	private Connection connection;

	
	public String getMessage() {
		MessageConsumer consumer = getConsumer();
		Message message = null;
		try {
			message = consumer.receive();
		} catch (JMSException e) {
			e.printStackTrace();
		}
		return message.toString();
	}

	
	public void start() {
		connection = getConnection();
		try {
			connection.start();
		} catch (JMSException e) {
			e.printStackTrace();
		}
	}

}
