package javapackege;

import java.util.ArrayList;

public class TestingClass {

	public static void main(String[] args) {

		UserDAO usersDAO = new UserDAO();
		ArrayList<String> emailList = usersDAO.getAllEmail();
		for (String email : emailList) {
			System.out.println(email);
		}

	}

}
