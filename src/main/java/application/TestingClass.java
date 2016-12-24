package application;

import java.util.ArrayList;

import DAO.UserDAO;

public class TestingClass {

	public static void main(String[] args) {

		UserDAO usersDAO = new UserDAO();
		ArrayList<String> emailList = usersDAO.getAllEmail();
		for (String email : emailList) {
			System.out.println(email);
		}

	}

}
