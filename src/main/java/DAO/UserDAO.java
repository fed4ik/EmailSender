package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class UserDAO {



	public ArrayList<String> getAllEmail() {
		Connection c = null;
		Statement stmt = null;
		ResultSet rs = null;
		ArrayList<String> allUsersEmail = new ArrayList<String>();

		try {
			c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "postgres");
			stmt = c.createStatement();
			rs = stmt.executeQuery("SELECT email FROM usertable;");
			while (rs.next()) {
				allUsersEmail.add(rs.getString("email"));
			}
		} catch (Exception exc) {
			System.out.println("Fail whith basedata");
			exc.printStackTrace();
		} finally {
			try {
				stmt.close();
				rs.close();
				c.close();
			} catch (SQLException e) {
				System.out.println("Fail whith closing DB");
				e.printStackTrace();
			}

		}
		return allUsersEmail;
	}

}
