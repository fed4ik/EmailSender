package javamail;

import java.util.ArrayList;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import DAO.UserDAO;

public class MailSender {
	public void sendMail(MailConstructor mailModel) {
		// Recipient's email ID needs to be mentioned.
		String to = "fed4iksasha@gmail.com";// change accordingly

		// Sender's email ID needs to be mentioned
		String from = "javahomesfk@gmail.com";// change accordingly
		final String username = "javahomesfk@gmail.com";// change accordingly
		final String password = "JavaHome01";// change accordingly

		// Assuming you are sending email through relay.jangosmtp.net
		String host = "smtp.gmail.com";

		Properties props = new Properties();
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.starttls.enable", "true");
		props.put("mail.smtp.host", host);
		props.put("mail.smtp.port", "587");

		// Get the Session object.
		Session session = Session.getInstance(props, new javax.mail.Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(username, password);
			}
		});

		try {
			// Create a default MimeMessage object.
			Message message = new MimeMessage(session);

			// Set From: header field of the header.
			message.setFrom(new InternetAddress(from));

			// Set To: header field of the header.
			  // Set To: header field of the header.
	         UserDAO dao = new UserDAO();
	         ArrayList<String> emailList = dao.getAllEmail();
	         for (String email : emailList) {
	        	 System.out.println(email);
	         }
	         InternetAddress[] address = new InternetAddress[emailList.size()];
	         for (int i = 0; i < emailList.size(); i++) {
	        	 address[i] = new InternetAddress(emailList.get(i));
	         }
	         message.setRecipients(Message.RecipientType.TO, address);
	        
	         /*for 1 recipient
//	         message.setRecipients(Message.RecipientType.TO,   
//	         InternetAddress.parse(to));
	*/

			// Set Subject: header field
			message.setSubject("Testing Subject");

			// Now set the actual message
			message.setText("Email massage");

			// Send message
			Transport.send(message);

			System.out.println("Sent message successfully....");

		} catch (MessagingException e) {
			throw new RuntimeException(e);
		}
	}

}
