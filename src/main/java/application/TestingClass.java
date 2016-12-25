package application;

import javamail.MailSender;
import model.ModelOfMail;

public class TestingClass {

	public static void main(String[] args) {

//		UserDAO usersDAO = new UserDAO();
//		ArrayList<String> emailList = usersDAO.getAllEmail();
//		for (String email : emailList) {
//			System.out.println(email);
//		}
		ModelOfMail modelMail = new ModelOfMail();
		MailSender sender = new MailSender();
		sender.sendMail(modelMail);
		

	}

}
