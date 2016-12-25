package application;

import javamail.MailConstructor;
import javamail.MailSender;

public class TestingClass {

	public static void main(String[] args) {

//		UserDAO usersDAO = new UserDAO();
//		ArrayList<String> emailList = usersDAO.getAllEmail();
//		for (String email : emailList) {
//			System.out.println(email);
//		}
		MailConstructor modelMail = new MailConstructor();
		MailSender sender = new MailSender();
		sender.sendMail(modelMail);
		

	}

}
